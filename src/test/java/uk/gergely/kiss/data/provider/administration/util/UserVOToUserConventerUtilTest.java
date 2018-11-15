package uk.gergely.kiss.data.provider.administration.util;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserVOToUserConventerUtilTest {

	@Autowired
	private UserConverter userVOToUserConverterUtil;

	@Test
	public void convert() {
		Assert.assertEquals(Arrays.asList(AdministrationTestConstants.TEST_USER),
				userVOToUserConverterUtil.convert(Arrays.asList(AdministrationTestConstants.TEST_USER_VO)));
		Assert.assertEquals(AdministrationTestConstants.TEST_USER,
				userVOToUserConverterUtil.convert(AdministrationTestConstants.TEST_USER_VO));

	}

}
