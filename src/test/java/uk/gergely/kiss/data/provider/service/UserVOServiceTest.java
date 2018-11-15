/*package uk.gergely.kiss.data.provider.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.junit.Assert;
import org.junit.Before;

import uk.gergely.kiss.data.provider.administration.model.UserVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;
import uk.gergely.kiss.data.provider.administration.service.UserNameVOService;
import uk.gergely.kiss.data.provider.administration.service.UserVOService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserVOServiceTest {

	@Autowired
	private UserVOService userVOService;
	@Autowired
	private UserNameVOService userNameVOService;
	
	public UserVO savedUserVO;

	@Before
	public void prepareData() {
		savedUserVO = userVOService.saveUserVO(AdministrationTestConstants.TEST_USER_VO);
	}

	@Test
	public void createUser() {
		Assert.assertNotNull(savedUserVO);
		Assert.assertEquals(AdministrationTestConstants.TEST_USER_VO, savedUserVO);
	}

	@Test
	public void getUserByHostReference() {
		UserVO userVO = userVOService.getUserVOByHostReference(savedUserVO.getHostReference());
		Assert.assertNotNull(userVO);
		Assert.assertEquals(savedUserVO,userVO);		
	}
	@Test
	public void updateUser() {
		UserVO userVO = userVOService.getUserVOByHostReference(savedUserVO.getHostReference());
		userVO.setEmail(AdministrationTestConstants.UPDATE_USER_VO_EMAIL);
		UserVO UpdatedUser = userVOService.updateUserVO(userVO);
		Assert.assertNotEquals(AdministrationTestConstants.TEST_USER_VO, UpdatedUser);
		Assert.assertEquals(userVO, UpdatedUser);
		Assert.assertEquals(AdministrationTestConstants.UPDATE_USER_VO_EMAIL, UpdatedUser.getEmail());
	}
	@Test
	public void deleteUser() {
		userVOService.deleteUserVO(savedUserVO);
		Assert.assertNull(userVOService.getUserVOByHostReference(savedUserVO.getHostReference()));
		Assert.assertNull(userNameVOService.getUserNameVOByHostReference(savedUserVO.getUserNameVO().getHostReference()));
	}
}
*/