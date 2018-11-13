package uk.gergely.kiss.data.provider.model.administration.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.gergely.kiss.data.provider.model.administration.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.model.administration.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.model.administration.UserVO;
import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizedUser;
import uk.gergely.kiss.data.provider.repositories.administration.AuthorizationTypeVORepository;

@Component
public class AuthorizedUserVOToAuthorizedUserConvertUtil {
	@Autowired
	AuthorizationTypeVOToAuthorizationTypeConverterUtil authorizationTypeVOToAuthorizationTypeConverterUtil;

	public AuthorizedUser convert(AuthorizedUserVO inputVO) {

		AuthorizedUser authorizedUser = new AuthorizedUser();
		authorizedUser.setHostReference(inputVO.getHostReference());
		authorizedUser.setPassword(inputVO.getPassword());
		authorizedUser.setSalt(inputVO.getSalt());
		authorizedUser.setUserName(inputVO.getUserNameVO().getUserName());
		authorizedUser
				.setType(authorizationTypeVOToAuthorizationTypeConverterUtil.convert(inputVO.getAuthorizationTypeVO()));
		return authorizedUser;
	}

	public List<AuthorizedUser> convert(List<AuthorizedUserVO> inputVOList) {
		List<AuthorizedUser> authorizedUserList = new ArrayList<>();
		for (AuthorizedUserVO a : inputVOList) {
			authorizedUserList.add(convert(a));
		}
		return authorizedUserList;
	}

}
