package uk.gergely.kiss.data.provider.model.administration.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import uk.gergely.kiss.data.provider.model.administration.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizationType;
import uk.gergely.kiss.data.provider.model.administration.util.model.Role;
import uk.gergely.kiss.data.provider.service.administration.AuthorizationTypeVOUserRoleVOPermissionVOService;
import uk.gergely.kiss.data.provider.service.administration.UserRoleVOService;

public class AuthorizationTypeVOToAuthorizationTypeConverterUtil {

	@Autowired
	UserRoleVOService userRoleVOService;
	
	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVOService authorizationTypeVOUserRoleVOPermissionVOService;
	
	@Autowired
	UserRoleVOToRoleConventerUtil userRoleVOToRoleConventer; 
	public AuthorizationType convert(AuthorizationTypeVO authorizationTypeVO) {
		AuthorizationType authorizationType = new AuthorizationType();
		authorizationType.setName(authorizationTypeVO.getName());
		authorizationType.setDescription(authorizationTypeVO.getDescription());
		List<Role> roleList = userRoleVOToRoleConventer.convert(userRoleVOService.getAllUserRoles());

		return authorizationType;
	}
}
