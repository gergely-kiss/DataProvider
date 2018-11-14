package uk.gergely.kiss.data.provider.administration.util;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.gergely.kiss.data.provider.administration.model.AuthorizedUserVO;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizedUser;

@Component
public class AuthorizedUserVOToAuthorizedUserConvertUtil{
	private final static Logger LOGGER = Logger
			.getLogger(String.valueOf(AuthorizedUserVOToAuthorizedUserConvertUtil.class));
	@Autowired
	AuthorizationTypeVOToAuthorizationTypeConverterUtil authorizationTypeVOToAuthorizationTypeConverterUtil;
	
	public AuthorizedUser convert(AuthorizedUserVO authorizedUserVO) {
		LOGGER.info("convert was called with authorizedUserVO: " + authorizedUserVO);
		AuthorizedUser authorizedUser = new AuthorizedUser();
		authorizedUser.setId(authorizedUserVO.getHostReference());
		authorizedUser.setPassword(authorizedUserVO.getPassword());
		authorizedUser.setSalt(authorizedUserVO.getSalt());
		authorizedUser.setUserName(authorizedUserVO.getUserNameVO().getUserName());
		authorizedUser.setType(
				authorizationTypeVOToAuthorizationTypeConverterUtil.convert(authorizedUserVO.getAuthorizationTypeVO()));
		LOGGER.info("AuthorizedUserVOList: " + authorizedUserVO + " was converted to authorizedUserList: "
				+ authorizedUser);
		return authorizedUser;
	}

	public List<AuthorizedUser> convert(List<AuthorizedUserVO> authorizedUserVOList) {
		LOGGER.info("convert was called with authorizedUserVOList: " + authorizedUserVOList);
		List<AuthorizedUser> authorizedUserList = new ArrayList<>();
		for (AuthorizedUserVO authorizedUserVO : authorizedUserVOList) {
			authorizedUserList.add(convert(authorizedUserVO));
		}
		LOGGER.info("AuthorizedUserVOList: " + authorizedUserVOList + " was converted to authorizedUserList: "
				+ authorizedUserList);
		return authorizedUserList;
	}

}
