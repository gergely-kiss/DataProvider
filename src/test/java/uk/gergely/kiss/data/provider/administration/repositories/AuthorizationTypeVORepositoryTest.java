package uk.gergely.kiss.data.provider.administration.repositories;

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
	private AuthorizationTypeVORepository authorizationTypeVORepository;

	@Before
	public void prepareDate() {
		authorizationTypeVORepository.save(AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO);
	}

	@Test
	public void isDefaultUserExist() {
		AuthorizationTypeVO savedAuthorizationTypeVO = authorizationTypeVORepository
				.findByName(AdministrationTestConstants.DEFAULT_AUTHORIZATION_TYPE_VO.getName());
		Assert.assertEquals(savedAuthorizationTypeVO.getName(), AdministrationTestConstants.DEFAULT_AUTHORIZATION_TYPE_VO.getName());
	}

	@Test
	public void isfPreparedDataIsSaved() {
		AuthorizationTypeVO savedAuthorizationTypeVO = authorizationTypeVORepository
				.findByName((AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO.getName()));
		Assert.assertNotNull(savedAuthorizationTypeVO);
		Assert.assertEquals(AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO.getName(), savedAuthorizationTypeVO.getName());
	}
}
