package uk.gergely.kiss.data.provider.administration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class RoleEnumTest {
	
	@Test
	public void isAllAdminEnumExist() {
		for (String s : AdministrationTestConstants.ROLE_ENUMS_STRING_VALUES_FOR_ADMINISTRATION) {
			Assert.assertNotNull(RoleEnum.valueOf(s));
		}
	}
	
}
