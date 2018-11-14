package uk.gergely.kiss.data.provider.administration.repositories;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizationTypeVORepositoryTest {

	@Autowired
	AuthorizationTypeVORepository authorizationTypeVORepositoryTest;

	public AuthorizationTypeVO authorizationTypeVO;
	public AuthorizationTypeVO defaultAuthorizationTypeVO;

	@Before
	public void prepareDate() {
		authorizationTypeVO = AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO;
		defaultAuthorizationTypeVO = AdministrationTestConstants.DEFAULT_AUTHORIZATION_TYPE_VO;
	}

	@Test
	public void isDefaultUserExist() {
		Assert.assertTrue(authorizationTypeVORepositoryTest.findById(AdministrationTestConstants.DEFAULT_USER_ROLE_VO_ID).get().equals(defaultAuthorizationTypeVO));
	}

	@Test
	public void isfPreparedDataIsSaved() {
		authorizationTypeVORepositoryTest.save(authorizationTypeVO);
		Assert.assertTrue(
				((List<AuthorizationTypeVO>) (authorizationTypeVORepositoryTest.findAll())).stream().anyMatch(u -> u.equals(authorizationTypeVO)));
	}
}
