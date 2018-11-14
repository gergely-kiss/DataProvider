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
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizationTypeVOUserRoleVOPermissionVORepositoryTest {
	@Autowired
	UserRoleVORepository userRoleVORepository;
	@Autowired
	AuthorizationTypeVORepository authorizationTypeVORepository;
	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVORepository authorizationTypeVOUserRoleVOPermissionVORepository;

	public AuthorizationTypeVOUserRoleVOPermissionVO testAuthorizationTypeVOUserRoleVOPermissionVO;
	public AuthorizationTypeVOUserRoleVOPermissionVO defaultAuthorizationTypeVOUserRoleVOPermissionVO;

	@Before
	public void prepareData() {
		userRoleVORepository.save(AdministrationTestConstants.TEST_USER_ROLE_VO);
		authorizationTypeVORepository.save(AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO);
		testAuthorizationTypeVOUserRoleVOPermissionVO = AdministrationTestConstants.TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO;
		defaultAuthorizationTypeVOUserRoleVOPermissionVO = AdministrationTestConstants.DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO;
	}

	@Test
	public void isDefaultUserExist() {
		Assert.assertTrue(authorizationTypeVOUserRoleVOPermissionVORepository
				.findById(AdministrationTestConstants.DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO_ID)
				.get().equals(defaultAuthorizationTypeVOUserRoleVOPermissionVO));
	}

	@Test
	public void isfPreparedDataIsSaved() {
		authorizationTypeVOUserRoleVOPermissionVORepository.save(testAuthorizationTypeVOUserRoleVOPermissionVO);
		Assert.assertTrue(
				((List<AuthorizationTypeVOUserRoleVOPermissionVO>) (authorizationTypeVOUserRoleVOPermissionVORepository
						.findAll())).stream()
								.anyMatch(u -> u.equals(testAuthorizationTypeVOUserRoleVOPermissionVO)));
	}

}
