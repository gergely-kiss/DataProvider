package uk.gergely.kiss.data.provider.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import org.junit.Assert;
import org.junit.Before;

import uk.gergely.kiss.data.provider.administration.model.UserNameVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;
import uk.gergely.kiss.data.provider.administration.service.UserNameVOService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserNameVOServiceTest {

	@Autowired
	UserNameVOService userNameVOService;

	public UserNameVO savedUserNameVO;
	
	@Before
	public void prepareData() {
		savedUserNameVO = userNameVOService.saveUserNameVO(AdministrationTestConstants.TEST_USER_NAME_VO);
		Assert.assertEquals(savedUserNameVO, AdministrationTestConstants.TEST_USER_NAME_VO);
	}

	@Test
	public void saveUserNameVO() {;
		Assert.assertEquals(savedUserNameVO, AdministrationTestConstants.TEST_USER_NAME_VO);
	}

	@Test
	public void getAllUserNameVO() {
		int defultNumberOfUserNameVO = userNameVOService.getAllUserNameVO().size();
		Assert.assertTrue(defultNumberOfUserNameVO > 0);
		Assert.assertNotNull(userNameVOService.getAllUserNameVO());
	}
	@Test
	public void getUserByHostReference() {
		UserNameVO userNameVO = userNameVOService.getUserNameVOByHostReference(savedUserNameVO.getHostReference());
		Assert.assertNotNull(userNameVO);		
		Assert.assertEquals(savedUserNameVO, userNameVO);
		
	}
	@Test
	public void deleteUserNameVO() {
		userNameVOService.deleteUserNameVO(savedUserNameVO);
		Assert.assertNull(userNameVOService.getUserNameVOByHostReference(savedUserNameVO.getHostReference()));
	}
}
