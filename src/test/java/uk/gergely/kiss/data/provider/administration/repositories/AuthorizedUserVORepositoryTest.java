package uk.gergely.kiss.data.provider.administration.repositories;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizedUserVORepositoryTest {

	@Autowired
	private AuthorizedUserVORepository authorizedUserVORepository;

	@Test
	public void isAuthorizedUserVOExist() {
		AuthorizedUserVO savedAuthorizedUserVO = ((List<AuthorizedUserVO>) authorizedUserVORepository.findAll()).get(0);
		Assert.assertNotNull(savedAuthorizedUserVO);
	}
}
