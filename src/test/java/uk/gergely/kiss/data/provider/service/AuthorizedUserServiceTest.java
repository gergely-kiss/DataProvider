package uk.gergely.kiss.data.provider.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizedUserVORepository;
import uk.gergely.kiss.data.provider.administration.service.AuthorizedUserService;
import uk.gergely.kiss.data.provider.administration.util.AuthorizedUserVOToAuthorizedUserConvertUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizedUserServiceTest {

	@Autowired
	private AuthorizedUserService authorizedUserService;
	@Autowired
	private AuthorizedUserVORepository authorizedUserVORepository;
	@Autowired
	private AuthorizedUserVOToAuthorizedUserConvertUtil authorizedUserVOToAuthorizedUserConvertUtil;

	@Test
	public void getAuthorizedUserList() {
		Assert.assertEquals(authorizedUserService.getAuthorizedUserList(), authorizedUserVOToAuthorizedUserConvertUtil
				.convert((List<AuthorizedUserVO>) authorizedUserVORepository.findAll()));
	}

	@Test
	public void getAuthorizedUserByHostreference() {
		List<AuthorizedUserVO> authorizedUserVOList = (List<AuthorizedUserVO>) authorizedUserVORepository.findAll();
		AuthorizedUserVO authorizedUserVO = authorizedUserVOList.get(0);
		Assert.assertEquals(authorizedUserVOToAuthorizedUserConvertUtil.convert(authorizedUserVO),
				authorizedUserService.getAuthorizedUserByHostreference(authorizedUserVO.getHostReference()));

	}
}
