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
				.findById(AdministrationTestConstants.DEFAULT_AUTHORIZATION_TYPE_VO.getId()).get();
		Assert.assertEquals(savedAuthorizationTypeVO, AdministrationTestConstants.DEFAULT_AUTHORIZATION_TYPE_VO);
	}

	@Test
	public void isfPreparedDataIsSaved() {
		AuthorizationTypeVO savedAuthorizationTypeVO = authorizationTypeVORepository
				.findById(AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO.getId()).get();
		Assert.assertEquals(savedAuthorizationTypeVO, AdministrationTestConstants.TEST_AUTHORIZATION_TYPE_VO);
	}
}
