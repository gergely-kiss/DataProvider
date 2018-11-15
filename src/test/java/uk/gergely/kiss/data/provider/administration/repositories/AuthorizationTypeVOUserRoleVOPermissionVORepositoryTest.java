package uk.gergely.kiss.data.provider.administration.repositories;

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
	private UserRoleVORepository userRoleVORepository;
	@Autowired
	private AuthorizationTypeVORepository authorizationTypeVORepository;
	@Autowired
	private AuthorizationTypeVOUserRoleVOPermissionVORepository authorizationTypeVOUserRoleVOPermissionVORepository;

	@Before
	public void prepareData() {
		userRoleVORepository.save(AdministrationTestConstants.TEST_USER_ROLE_VO);
		authorizationTypeVORepository.save(AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO);
		authorizationTypeVOUserRoleVOPermissionVORepository
				.save(AdministrationTestConstants.TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO);
	}

	@Test
	public void isDefaultUserExist() {
		AuthorizationTypeVOUserRoleVOPermissionVO savedAuthorizationTypeVOUserRoleVOPermissionVO = authorizationTypeVOUserRoleVOPermissionVORepository
				.findById(AdministrationTestConstants.DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO.getId())
				.get();
		Assert.assertEquals(savedAuthorizationTypeVOUserRoleVOPermissionVO,
				AdministrationTestConstants.DEFAULT_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO);
	}

	@Test
	public void isfPreparedDataIsSaved() {
		AuthorizationTypeVOUserRoleVOPermissionVO savedAuthorizationTypeVOUserRoleVOPermissionVO = authorizationTypeVOUserRoleVOPermissionVORepository
				.findById(AdministrationTestConstants.TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO.getId())
				.get();
		Assert.assertEquals(savedAuthorizationTypeVOUserRoleVOPermissionVO,
				AdministrationTestConstants.TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO);
	}

}
