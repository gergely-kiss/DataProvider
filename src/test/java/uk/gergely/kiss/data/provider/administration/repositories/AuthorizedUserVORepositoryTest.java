package uk.gergely.kiss.data.provider.administration.repositories;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.administration.resources.AdministrationTestConstants;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizedUserVORepositoryTest {
	Logger LOGGER = LoggerFactory.getLogger(AuthorizedUserVORepositoryTest.class);
	@Autowired
	private AuthorizedUserVORepository authorizedUserVORepository;

	public AuthorizedUserVO authorizedUserVO;

	@Before
	public void prepareData() {
		authorizedUserVO = AdministrationTestConstants.TEST_AUTHORIZED_USER_VO;

	}

	@Test
	public void isfPreparedDataIsSaved() {
		authorizedUserVORepository.save(authorizedUserVO);
		LOGGER.info("!!!!!!!!!!!!!!!!!!!!! {} !!!!!!!!!!!!!!!!!!!!!", authorizedUserVO);
		AuthorizedUserVO savedAuthorizedUserVO =authorizedUserVORepository.findById(authorizedUserVO.getId()).get();
		LOGGER.info("!!!!!!!!!!!!!!!!!!!!! {} !!!!!!!!!!!!!!!!!!!!!", savedAuthorizedUserVO);
	}
}
