package uk.gergely.kiss.data.provider.administration.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.junit.Assert;
import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserRoleVORepositoryTest {

	@Autowired
	private UserRoleVORepository userRoleVORepository;

	@Before
	public void prepareData() {
		userRoleVORepository.save(AdministrationTestConstants.TEST_USER_ROLE_VO);
	}

	@Test
	public void isDefaultUserExist() {
		UserRoleVO savedUserRoleVO = userRoleVORepository
				.findById(AdministrationTestConstants.DEFAULT_USER_ROLE_VO.getId()).get();
		Assert.assertEquals(savedUserRoleVO, AdministrationTestConstants.DEFAULT_USER_ROLE_VO);
	}

	@Test
	public void isfPreparedDataIsSaved() {
		UserRoleVO savedUserRoleVO = userRoleVORepository
				.findById(AdministrationTestConstants.TEST_USER_ROLE_VO.getId()).get();
		Assert.assertEquals(savedUserRoleVO, AdministrationTestConstants.TEST_USER_ROLE_VO);
	}
}
