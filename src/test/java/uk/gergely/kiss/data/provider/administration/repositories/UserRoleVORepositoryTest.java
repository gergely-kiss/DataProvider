package uk.gergely.kiss.data.provider.administration.repositories;

import java.util.List;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserRoleVORepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(String.valueOf(UserRoleVORepositoryTest.class));
	@Autowired
	UserRoleVORepository userRoleVORepository;

	public UserRoleVO userRoleVO;

	@Before
	public void prepareDate() {
		userRoleVO = new UserRoleVO();
		userRoleVO.setId(9);
		userRoleVO.setName("TEST_ROLE");
		userRoleVORepository.save(userRoleVO);
	}

	@Test
	public void testIfRoleExist() {
		LOGGER.info((List<UserRoleVO>) (userRoleVORepository.findAll()) + "");
	}

}
