package uk.gergely.kiss.data.provider.administration.repositories;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizationTypeVORRepositoryTest {

	@Autowired
	private AuthorizationTypeVORepository repo;

	@Test
	public void isAllDefaultRolesArePresen() {
		List<String> savedAuthorizationTypeVOList = ((List<AuthorizationTypeVO>) repo.findAll()).stream().map(AuthorizationTypeVO::getName)
				.collect(Collectors.toList());
		Arrays.asList(AdministrationTestConstants.AUTHORIZATION_TYPE_ENUMS_STRING_VALUES_FOR_ADMINISTRATION).stream().forEach(s -> {
			Assert.assertTrue(savedAuthorizationTypeVOList.contains(s));
		});

	}
}
