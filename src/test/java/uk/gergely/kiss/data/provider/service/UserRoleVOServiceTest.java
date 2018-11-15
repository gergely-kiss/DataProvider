package uk.gergely.kiss.data.provider.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;
import uk.gergely.kiss.data.provider.administration.service.UserRoleVOService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserRoleVOServiceTest {

	@Autowired
	private UserRoleVOService userRoleVOService;

	@Test
	public void getAllUserRolesBasic() {
		Assert.assertNotNull(userRoleVOService.getAllUserRoles());
	}

	@Test
	public void getAllUserRolesIsDefaultRoleReturned() {
		Assert.assertTrue(userRoleVOService.getAllUserRoles().stream()
				.anyMatch(r -> r.equals(AdministrationTestConstants.DEFAULT_USER_ROLE_VO)));
	}
}
