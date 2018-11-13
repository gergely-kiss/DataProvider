package uk.gergely.kiss.data.provider.model.administration.util;

import uk.gergely.kiss.data.provider.model.administration.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.model.administration.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.model.administration.UserVO;
import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizedUser;

public class AuthorizedUserVOToAuthorizedUserConvertUtil {

	public AuthorizedUser converted(AuthorizedUserVO inputVO, UserVO userVO, AuthorizationTypeVO authorizationTypeVO) {
		AuthorizedUser authorizedUser = new AuthorizedUser();
		authorizedUser.setHostReference(inputVO.getHostReference());
		authorizedUser.setPassword(inputVO.getPassword());
		authorizedUser.setSalt(inputVO.getSalt());
		
		return authorizedUser;
	}
	

}
