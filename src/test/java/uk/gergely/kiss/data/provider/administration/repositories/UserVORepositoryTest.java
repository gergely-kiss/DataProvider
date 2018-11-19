package uk.gergely.kiss.data.provider.administration.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.model.UserVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserVORepositoryTest {

	@Autowired
	private UserVORepository userVORepository;
	@Autowired
	private UserNameVORepository userNameVORepository;

	@Test
	public void findUserVOByHostReference() {
		userNameVORepository.save(AdministrationTestConstants.TEST_USER_NAME_VO);
		UserVO savedUserVO = userVORepository.save(AdministrationTestConstants.TEST_USER_VO);
		Assert.assertEquals(savedUserVO, userVORepository.findUserVOByHostReference(savedUserVO.getHostReference()));
	}
	@Test
	public void findUserVOByHostReferenceUserNotExist() {
		Assert.assertNull(userVORepository.findUserVOByHostReference(AdministrationTestConstants.TEST_USER_VO.getHostReference()));
	}
	

}
