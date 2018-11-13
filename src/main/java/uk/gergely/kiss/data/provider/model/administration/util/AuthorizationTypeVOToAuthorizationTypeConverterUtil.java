package uk.gergely.kiss.data.provider.model.administration.util;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.gergely.kiss.data.provider.model.administration.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.model.administration.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizationType;
import uk.gergely.kiss.data.provider.model.administration.util.model.RolePermission;
import uk.gergely.kiss.data.provider.service.administration.AuthorizationTypeVOUserRoleVOPermissionVOService;

@Component
public class AuthorizationTypeVOToAuthorizationTypeConverterUtil {
	private final static Logger LOGGER = Logger
			.getLogger(String.valueOf(AuthorizationTypeVOToAuthorizationTypeConverterUtil.class));
	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVOService authorizationTypeVOUserRoleVOPermissionVOService;

	public AuthorizationType convert(AuthorizationTypeVO authorizationTypeVO) {
		LOGGER.info("convert was called with authorizationTypeVO: " + authorizationTypeVO);
		AuthorizationType authorizationType = new AuthorizationType();
		authorizationType.setName(authorizationTypeVO.getName());
		authorizationType.setDescription(authorizationTypeVO.getDescription());

		List<RolePermission> userRolePermission = new ArrayList<>();

		List<AuthorizationTypeVOUserRoleVOPermissionVO> authorizationTypeVOUserRoleVOPermissionVO = authorizationTypeVOUserRoleVOPermissionVOService
				.getAllAuthorizationTypeVOUserRoleVOPermissionVO();
		for (AuthorizationTypeVOUserRoleVOPermissionVO aTVOUURVOPVO : authorizationTypeVOUserRoleVOPermissionVO) {
			if (aTVOUURVOPVO.getAuthorizationTypeVO().getId() == authorizationTypeVO.getId()) {
				RolePermission rolePermission = new RolePermission();
				rolePermission.setRole(aTVOUURVOPVO.getUserRoleVO().getName());
				rolePermission.setPermission(aTVOUURVOPVO.getPermission());
				userRolePermission.add(rolePermission);
			}
		}

		authorizationType.setRolePermissionList(userRolePermission);
		LOGGER.info("authorizationTypeVO: " + authorizationTypeVO
				+ " was converted to authorizationType: " + authorizationType);
		return authorizationType;
	}
}
