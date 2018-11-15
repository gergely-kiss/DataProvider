package uk.gergely.kiss.data.provider.administration.repositories;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.junit.Assert;
import uk.gergely.kiss.data.provider.administration.model.UserNameVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserNameVORepositoryTest {

	@Autowired
	private UserNameVORepository userNameVORepository;

	@Before
	public void prepareData() {
		userNameVORepository.save(AdministrationTestConstants.TEST_USER_NAME_VO);
	}

	@Test
	public void isDefaultUserExist() {
		UserNameVO savedUserNameVO = userNameVORepository
				.findById(AdministrationTestConstants.DEFAULT_USER_NAME_VO.getId()).get();
		Assert.assertEquals(savedUserNameVO, AdministrationTestConstants.DEFAULT_USER_NAME_VO);
	}
	
	@Test
	public void isfPreparedDataIsSaved() {
		UserNameVO savedUserNameVO = userNameVORepository
				.findById(AdministrationTestConstants.TEST_USER_NAME_VO.getId()).get();
		Assert.assertEquals(savedUserNameVO, AdministrationTestConstants.TEST_USER_NAME_VO);
	}
}
