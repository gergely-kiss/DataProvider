package uk.gergely.kiss.data.provider.administration.repositories;

import java.util.List;

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
	UserRoleVORepository userRoleVORepository;

	public UserRoleVO testUserRoleVO;
	public UserRoleVO defaultUserRoleVO;

	@Before
	public void prepareData() {
		testUserRoleVO = AdministrationTestConstants.TEST_USER_ROLE_VO;
		defaultUserRoleVO = AdministrationTestConstants.DEFAULT_USER_ROLE_VO;
	}

	@Test
	public void isDefaultUserExist() {
		Assert.assertTrue(userRoleVORepository.findById(AdministrationTestConstants.DEFAULT_USER_ROLE_VO_ID).get().equals(defaultUserRoleVO));
	}

	@Test
	public void isfPreparedDataIsSaved() {
		userRoleVORepository.save(testUserRoleVO);
		Assert.assertTrue(
				((List<UserRoleVO>) (userRoleVORepository.findAll())).stream().anyMatch(u -> u.equals(testUserRoleVO)));
	}

}
