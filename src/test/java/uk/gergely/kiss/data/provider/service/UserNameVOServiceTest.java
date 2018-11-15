package uk.gergely.kiss.data.provider.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.junit.Assert;
import org.junit.Before;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;
import uk.gergely.kiss.data.provider.administration.service.UserNameService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserNameVOServiceTest {

	@Autowired
	private UserNameService userNameVOService;

	public String savedUserName;
	
	@Before
	public void prepareData() {
		savedUserName = userNameVOService.saveUserName(AdministrationTestConstants.TEST_USER_NAME_VO_NAME);
	}

	@Test
	public void saveUserNameVO() {;
		Assert.assertEquals(savedUserName, AdministrationTestConstants.TEST_USER_NAME_VO_NAME);
	}

	@Test
	public void getAllUserNameVO() {
		int defultNumberOfUserNameVO = userNameVOService.getAllUserName().size();
		Assert.assertTrue(defultNumberOfUserNameVO > 0);
		Assert.assertNotNull(userNameVOService.getAllUserName());
	}

}
