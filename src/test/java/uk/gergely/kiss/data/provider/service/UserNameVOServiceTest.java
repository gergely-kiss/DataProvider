package uk.gergely.kiss.data.provider.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import org.junit.Assert;
import uk.gergely.kiss.data.provider.administration.model.UserNameVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;
import uk.gergely.kiss.data.provider.administration.service.UserNameVOService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserNameVOServiceTest {

	@Autowired
	UserNameVOService userNameVOService;
	
	@Test
	public void saveUserNameVO() {
		UserNameVO savedUserNameVO = userNameVOService.saveUserNameVO(AdministrationTestConstants.TEST_USER_NAME_VO);
		Assert.assertEquals(savedUserNameVO, AdministrationTestConstants.TEST_USER_NAME_VO);
	}
	@Test
	public void getAllUserNameVO() {
		UserNameVO savedUserNameVO = userNameVOService.saveUserNameVO(AdministrationTestConstants.TEST_USER_NAME_VO);
		Assert.assertEquals(2, userNameVOService.getAll().size());
	}
}
