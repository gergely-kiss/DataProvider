package uk.gergely.kiss.data.provider.administration.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizationTypeVORepository;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizationTypeVOUserRoleVOPermissionVORepository;
import uk.gergely.kiss.data.provider.administration.repositories.UserRoleVORepository;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizedUser;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizedUserBuilderTest {
	@Autowired
	private AuthorizedUserBuilder authorizedUserBuilder;
	@Autowired
	private AuthorizationTypeVORepository authorizationTypeVORepository;
	@Autowired
	private UserRoleVORepository userRoleVORepository;
	@Autowired
	private AuthorizationTypeVOUserRoleVOPermissionVORepository repo;
	@Test
	public void convert() {
		AuthorizedUser authorizedUser = AdministrationTestConstants.TEST_AUTHORIZED_USER;	
		authorizationTypeVORepository.save(AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO);
		
		userRoleVORepository.save(AdministrationTestConstants.TEST_USER_ROLE_VO);
		repo.save(AdministrationTestConstants.TEST_AUTHORIZATIONT_TYPE_VO_USER_ROLE_VO_PERMISSION_VO);
		AuthorizedUserVO authorizedUserVO = AdministrationTestConstants.TEST_AUTHORIZED_USER_VO;
		Assert.assertEquals(authorizedUser, authorizedUserBuilder.convert(authorizedUserVO));
	}
}
