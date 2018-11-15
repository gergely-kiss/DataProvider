package uk.gergely.kiss.data.provider.administration.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizedUserVORepositoryTest {

	@Autowired
	private AuthorizedUserVORepository authorizedUserVORepository;
	@Autowired
	private UserNameVORepository userNameVORepository;
	@Autowired
	private UserRoleVORepository userRoleVORepository;
	@Autowired
	private AuthorizationTypeVORepository authorizationTypeVORepository;
	@Autowired
	private AuthorizationTypeVOUserRoleVOPermissionVORepository authorizationTypeVOUserRoleVOPermissionVORepository;

	@Before
	public void prepareData() {
		userNameVORepository.save(AdministrationTestConstants.TEST_USER_NAME_VO);
		userRoleVORepository.save(AdministrationTestConstants.TEST_USER_ROLE_VO);
		authorizationTypeVORepository.save(AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO);
		authorizationTypeVOUserRoleVOPermissionVORepository
				.save(AdministrationTestConstants.TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO);
		authorizedUserVORepository.save(AdministrationTestConstants.TEST_AUTHORIZED_USER_VO);

	}

	@Test
	public void isPreparedDataIsSaved() {

		AuthorizedUserVO savedAuthorizedUserVO = authorizedUserVORepository
				.findById(AdministrationTestConstants.TEST_AUTHORIZED_USER_VO.getId()).get();
		Assert.assertEquals(savedAuthorizedUserVO, AdministrationTestConstants.TEST_AUTHORIZED_USER_VO);
	}
	
	@Test
	public void isDefaultUserExist() {

		AuthorizedUserVO savedAuthorizedUserVO = authorizedUserVORepository
				.findById(AdministrationTestConstants.DEFAULT_AUTHORIZED_USER_VO.getId()).get();
		Assert.assertEquals(savedAuthorizedUserVO, AdministrationTestConstants.DEFAULT_AUTHORIZED_USER_VO);
	}
}
