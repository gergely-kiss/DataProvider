package uk.gergely.kiss.data.provider.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;
import uk.gergely.kiss.data.provider.administration.service.AuthorizationTypeVOUserRoleVOPermissionVOService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizationTypeVOUserRoleVOPermissionVOServiceTest {

	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVOService authorizationTypeVOUserRoleVOPermissionVOService;

	@Test
	public void getAllAuthorizationTypeVOUserRoleVOPermissionVOTest() {
		Assert.assertTrue(authorizationTypeVOUserRoleVOPermissionVOService
				.getAllAuthorizationTypeVOUserRoleVOPermissionVO().stream().anyMatch(a -> a.equals(
						AdministrationTestConstants.DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO)));
		Assert.assertNotNull(
				authorizationTypeVOUserRoleVOPermissionVOService.getAllAuthorizationTypeVOUserRoleVOPermissionVO());
	}
}
