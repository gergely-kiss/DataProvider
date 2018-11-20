/**
 * 
 */
package uk.gergely.kiss.data.provider.administration.util;

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
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizedUser;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AuthorizedUserVOToAuthorizedUserConvertUtilTest {

	@Autowired
	private AuthorizedUserService authorizedUserService;
	@Autowired
	private AuthorizedUserVORepository authorizedUserVORepository;
	@Autowired
	private AuthorizedUserVOToAuthorizedUserConvertUtil authorizedUserVOToAuthorizedUserConvertUtil;
	@Autowired
	AuthorizationTypeVOToAuthorizationTypeConverterUtil authorizationTypeVOToAuthorizationTypeConverterUtil;

	@Test
	public void getAuthorizedUserByHostreference() {
		List<AuthorizedUserVO> authorizedUserVOList = (List<AuthorizedUserVO>) authorizedUserVORepository.findAll();
		AuthorizedUserVO authorizedUserVO = authorizedUserVOList.get(0);
		AuthorizedUser authorizedUser = new AuthorizedUser();
		authorizedUser.setId(authorizedUserVO.getHostReference());
		authorizedUser.setPassword(authorizedUserVO.getPassword());
		authorizedUser.setSalt(authorizedUserVO.getSalt());
		authorizedUser.setType(
				authorizationTypeVOToAuthorizationTypeConverterUtil.convert(authorizedUserVO.getAuthorizationTypeVO()));
		authorizedUser.setUserName(authorizedUserVO.getUserNameVO().getUserName());
		
		Assert.assertEquals(authorizedUserVOToAuthorizedUserConvertUtil.convert(authorizedUserVO),
				authorizedUserService.getAuthorizedUserByHostreference(authorizedUserVO.getHostReference()));

	}
}
