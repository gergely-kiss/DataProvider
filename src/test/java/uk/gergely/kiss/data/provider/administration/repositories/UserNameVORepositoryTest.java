package uk.gergely.kiss.data.provider.administration.repositories;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import uk.gergely.kiss.data.provider.administration.model.UserNameVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserNameVORepositoryTest {

	@Autowired
	private UserNameVORepository userNameVORepository;

	@Test
	public void delete() {
		UserNameVO savedUserNameVO = userNameVORepository.save(AdministrationTestConstants.TEST_USER_NAME_VO);
		int savedUserNameVOCount = ((List<UserNameVO>) userNameVORepository.findAll()).size();
		userNameVORepository.delete(savedUserNameVO);
		int savedUserNameVOCountAfterDelete = ((List<UserNameVO>) userNameVORepository.findAll()).size();
		Assert.assertTrue(savedUserNameVOCount > savedUserNameVOCountAfterDelete);
	}
	
	@Test
	public void findByName() {
		UserNameVO savedUserNameVO = userNameVORepository.save(AdministrationTestConstants.TEST_USER_NAME_VO);
		UserNameVO foundUserNameVO = userNameVORepository.findByUserName(savedUserNameVO.getUserName());
		Assert.assertEquals(savedUserNameVO, foundUserNameVO);
	}
	
}
