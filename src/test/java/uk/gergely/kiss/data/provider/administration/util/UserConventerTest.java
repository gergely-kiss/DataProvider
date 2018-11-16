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
public class UserConventerTest {

	@Autowired
	private UserConverter userConverter;

	@Test
	public void convert() {
		Assert.assertEquals(Arrays.asList(AdministrationTestConstants.TEST_USER),
				userConverter.convert(Arrays.asList(AdministrationTestConstants.TEST_USER_VO)));
		Assert.assertEquals(AdministrationTestConstants.TEST_USER,
				userConverter.convert(AdministrationTestConstants.TEST_USER_VO));
		Assert.assertEquals(AdministrationTestConstants.TEST_USER_VO,
				userConverter.convert(AdministrationTestConstants.TEST_USER));
	}
	
}
