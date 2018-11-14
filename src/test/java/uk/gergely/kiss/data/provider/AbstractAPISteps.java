package uk.gergely.kiss.data.provider;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.jbehave.core.annotations.Then;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.ScenarioType;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;


public class AbstractAPISteps implements ApplicationContextAware {

	ApplicationContext applicationContext;

	protected static HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
	//protected static Authentication authenticationMock = Mockito.mock(Authentication.class); java security
	protected static TelrockUser telrockUser = new TelrockUser("god", "password", Collections
			.<GrantedAuthority> emptyList());
	protected static MockHttpSession mockHttpSession = new MockHttpSession();
	protected static Long customerId = null;
	protected static Long customerAccountId = null;
	protected static final String DOES_NOT_EXIST = "does_not_exist";
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}

	@BeforeStories
	public void setupTestJersey() throws Exception {
		if (jerseyTest == null) {
			jerseyTest = new JerseyTest() {
				@Override
				protected Application configure() {
					enable(TestProperties.LOG_TRAFFIC);

					ResourceConfig application = new TasApplication();
					application.property("contextConfig", applicationContext);

					application.register(new AbstractBinder() {
						@Override
						protected void configure() {
							bind(request).to(HttpServletRequest.class);
						}
					});
					return application;
				}
			};

			jerseyTest.setUp();
			jerseyTest.client().register(MultiPartFeature.class);
		}
	}

	// --------------------------------------------------------------------------------------------------

	@BeforeScenario(uponType = ScenarioType.ANY)
	public void beforeScenario() throws Exception {
		// Mock request session
		mockNewSession();
	}

	// --------------------------------------------------------------------------------------------------

	@Given("no logged-in user")
	public void givenNoLoggedInUser() {
		
		Mockito.reset(request);
		mockHttpSession = new MockHttpSession(null, UUID.randomUUID().toString());
		Mockito.when(request.getSession()).thenReturn(mockHttpSession);
	}

	// --------------------------------------------------------------------------------------------------

	@Given("user authentication with name: '${userName}'")
	public void givenAuthUser(String userName) {
		
		telrockUser = new TelrockUser(userName, "password", Collections.<GrantedAuthority>emptyList());

		mockUserAuth();
	}

	// --------------------------------------------------------------------------------------------------

	@Given("with role superadmin")
	public void givenSuperadminRole() {
		
		telrockUser.setSuperUser(true);

		mockUserAuth();
	}

	// --------------------------------------------------------------------------------------------------

	@Given("with role:'${roleName}' and permissions: ${permissions}")
	public void givenRole(String roleName, ExamplesTable permissions) {
		

		PermissionEnum pEnum = null;

		for (Map<String, String> row : permissions.getRows()) {
			String permission = row.get("permission");
			pEnum = PermissionEnum.valueOf(permission);
			telrockUser.add(roleName, pEnum);
		}

		List<GrantedAuthority> authorities = new ArrayList<>(1);
		authorities.add(new SimpleGrantedAuthority(roleName));
		telrockUser.setAuthorities(authorities);

		mockUserAuth();
	}

	// --------------------------------------------------------------------------------------------------

	@Given("with user ip address: '${ipAddress}'")
	public void givenUserIpAddress(String ipAddress) {
		
		Mockito.when(request.getRemoteAddr()).thenReturn(ipAddress);

		mockSession();
	}

	// --------------------------------------------------------------------------------------------------

	protected void mockCustomerSession() {
		customerId = SharedStepVars.getCustomerVO().getId();
		mockHttpSession.setAttribute("customerId", customerId);
		mockSession();
	}

	// --------------------------------------------------------------------------------------------------

	protected void mockCustomerAccountSession() {
		customerAccountId = SharedStepVars.getCustomerAccountVO().getId();
		mockHttpSession.setAttribute("customerAccountId", customerAccountId);
		mockSession();
	}

	// --------------------------------------------------------------------------------------------------

	private void mockNewSession() {
		Mockito.reset(request);
		mockHttpSession = new MockHttpSession(null, UUID.randomUUID().toString());

		mockSession();
	}

	// --------------------------------------------------------------------------------------------------

	protected void mockSession() {
		mockHttpSession.setAttribute(SecurityUtils.AUTHENTICATION_IN_SESSION, authenticationMock);
		Mockito.when(authenticationMock.getPrincipal()).thenReturn(telrockUser);
		SecurityUtils.setCredentialsInSession(mockHttpSession, authenticationMock);
		Mockito.when(request.getSession()).thenReturn(mockHttpSession);
	}

	// --------------------------------------------------------------------------------------------------

	private void mockUserAuth() {
		Mockito.when(authenticationMock.getPrincipal()).thenReturn(telrockUser);
		mockSession();
	}

	// --------------------------------------------------------------------------------------------------

	private void resetHttpSession() {
		mockHttpSession = new MockHttpSession();
	}

	// --------------------------------------------------------------------------------------------------

	@Then("the API call was successful")
	public void apiCallSuccessful() {
		Response response = SharedStepVars.getJerseyResponse();
		Assert.assertNotNull("No Jersey response found in SharedStepVars", response);
		Assert.assertEquals("Expected 200 response, from Jersey but got: " + response.getStatus(), 200,
				response.getStatus());
	}

	// --------------------------------------------------------------------------------------------------

	@Then("the API call completed with a status of '${status}'")
	public void thenApiCallCompleteWithStatus(int status) {
		Response response = SharedStepVars.getJerseyResponse();
		Assert.assertNotNull("No Jersey response found in SharedStepVars", response);
		Assert.assertEquals(status, response.getStatus());
	}

	// --------------------------------------------------------------------------------------------------

	@Then("the API call completed not with error '${errorKey}'")
	public void apiCallCompleteNotWithStatus(String errorKey) {
		ApiResponseVO result = SharedStepVars.getApiResponseVO();
		List<ApiResponseMessageVO> errors = result.getErrors();
		Assert.assertNotNull("Error expected", errors);
		Assert.assertNotEquals("One or more error expected", 0, errors.size());

		boolean found = false;
		for (ApiResponseMessageVO apiResponseMessageVO : errors) {
			if (apiResponseMessageVO.getKey().equals(errorKey)) {
				found = true;
				break;
			}
		}
		Assert.assertEquals("Expected no error key : " + errorKey, found, false);

		// Reset session
		resetHttpSession();
	}

	// --------------------------------------------------------------------------------------------------

	@Then("the API user is logged in")
	public void thenAPIUserIsLoggedIn() {
		Assert.assertNotNull("customerId must be set in HTTP Session",
				mockHttpSession.getAttribute(HttpSessionAccessor.SESSION_KEY_CUSTOMER_ID));
		Assert.assertNotNull("customerAccountId must be set in HTTP Session",
				mockHttpSession.getAttribute(HttpSessionAccessor.SESSION_KEY_CUSTOMER_ACCOUNT_ID));
		Assert.assertNotNull("Authenication must be set in HTTP Session",
				mockHttpSession.getAttribute(SecurityUtils.AUTHENTICATION_IN_SESSION));
	}

	// --------------------------------------------------------------------------------------------------

	@Then("the API user is not logged in")
	public void thenAPIUserIsNotLoggedIn() {
		Assert.assertNull("customerId must not be set in HTTP Session",
				mockHttpSession.getAttribute(HttpSessionAccessor.SESSION_KEY_CUSTOMER_ID));
		Assert.assertNull("customerAccountId must not be set in HTTP Session",
				mockHttpSession.getAttribute(HttpSessionAccessor.SESSION_KEY_CUSTOMER_ACCOUNT_ID));
		Assert.assertNull("Authenication must not be set in HTTP Session",
				mockHttpSession.getAttribute(SecurityUtils.AUTHENTICATION_IN_SESSION));
	}

	// --------------------------------------------------------------------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Then("the API response has only one error with key: '${errorKey}'")
	public void thenAPIResponseErrorKey(String errorKey) {
		ApiResponseVO result = SharedStepVars.getApiResponseVO();
		List<ApiResponseMessageVO> errors = result.getErrors();
		Assert.assertNotNull("Error expected", errors);
		Assert.assertEquals("Only one error expected", 1, errors.size());
		Assert.assertEquals("Expected error key not returned", errorKey, errors.get(0).getKey());

		// Reset session
		resetHttpSession();
	}

	// --------------------------------------------------------------------------------------------------

	@Then("the API response body contains: ${body}")
	public void thenResponseBodyContains(String body) {
		Response response = SharedStepVars.getJerseyResponse();
		Assert.assertTrue("API response does not contain a body", response.hasEntity());

		String actualBody = response.readEntity(String.class);
		Assert.assertTrue("API response body is blank", StringUtils.isNotBlank(actualBody));
		Assert.assertTrue("API response body [" + actualBody + "] does not contain: [" + body + "]",
				actualBody.contains(body));

	}

	// --------------------------------------------------------------------------------------------------

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Then("the API response has an error with key: '${errorKey}'")
	public void assertAPIResponseHasAnErrorKey(String errorKey) {
		ApiResponseVO result = SharedStepVars.getApiResponseVO();
		List<ApiResponseMessageVO> errors = result.getErrors();
		Assert.assertNotNull("Error expected", errors);
		Assert.assertNotEquals("One or more error expected", 0, errors.size());

		boolean found = false;
		for (ApiResponseMessageVO apiResponseMessageVO : errors) {
			if (apiResponseMessageVO.getKey().equals(errorKey)) {
				found = true;
				break;
			}
		}
		Assert.assertNotEquals("Expected error key not returned", found, false);

		// Reset session
		resetHttpSession();

	}

	// --------------------------------------------------------------------------------------------------

	@Given("the API request has a query parameter with key: '${key}' and value: '${value}'")
	public void givenApiRequestQuery(String key, String value) {
		Map<String, String> queryParameters = SharedStepVars.getQueryParameters();
		if (queryParameters == null) {
			queryParameters = new HashMap<>();
		}
		queryParameters.put(key, value);
		SharedStepVars.setQueryParameters(queryParameters);
	}

	// ------------------------------------------------------------------------------------------------------------------

	@Given("the Customer is authenticated on V1 API")
	public static void givenCustomerAuthenticateOnV1API() {
		CustomerAccountVO customerAccountVO = SharedStepVars.getCustomerAccountVO();
		CustomerVO customerVO = SharedStepVars.getCustomerVO();

		if (Objects.nonNull(customerAccountVO)) {
			HttpSessionAccessor.setCustomerAccountId(request, customerAccountVO);
		}
		HttpSessionAccessor.setCustomerId(request, customerVO);
	}

	// --------------------------------------------------------------------------------------------------

	protected JerseyTest getJerseyTest() {
		return AbstractApiSteps.jerseyTest;
	}

	// --------------------------------------------------------------------------------------------------

	@SuppressWarnings("unchecked")
	protected void setResponse(Response response) {
		ApiResponseVO<IdvQuestionVO[]> apiResponse = response.readEntity(ApiResponseVO.class);

		SharedStepVars.setJerseyResponse(response);
		SharedStepVars.setApiResponseVO(apiResponse);
	}

	// --------------------------------------------------------------------------------------------------

	protected Response executeGet(String uri, Map<String, String> queryParam) {
		WebTarget webTarget = getJerseyTest().target(uri);
		if (queryParam != null) {
			String value;
			for (String key : queryParam.keySet()) {
				value = queryParam.get(key);
				webTarget = webTarget.queryParam(key, value);
			}
		}

		Response response = webTarget.request().get();
		return response;
	}

	// --------------------------------------------------------------------------------------------------

}
