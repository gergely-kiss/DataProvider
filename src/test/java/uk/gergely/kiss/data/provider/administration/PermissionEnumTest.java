package uk.gergely.kiss.data.provider.administration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PermissionEnumTest {
	public static final String[] ROLE_ENUMS_STRING_VALUES_FOR_ADMINISTRATION = { "ANY", "CREATE", "READ", "EXECUTE", "DELETE" };

	@Test
	public void isAllAdminEnumExist() {
		for (String s : ROLE_ENUMS_STRING_VALUES_FOR_ADMINISTRATION) {
			Assert.assertNotNull(PermissionEnum.valueOf(s));
		}
	}
}
