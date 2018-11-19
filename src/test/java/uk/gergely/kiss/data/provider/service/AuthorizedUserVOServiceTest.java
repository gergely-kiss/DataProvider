package uk.gergely.kiss.data.provider.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import uk.gergely.kiss.data.provider.administration.service.AuthorizedUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizedUserVOServiceTest {

	@Autowired
	AuthorizedUserService authorizedUserVOService;

	@Test
	public void getAuthorizedUserList() {
		Assert.assertNotNull(authorizedUserVOService.getAuthorizedUserList());
	}
}
