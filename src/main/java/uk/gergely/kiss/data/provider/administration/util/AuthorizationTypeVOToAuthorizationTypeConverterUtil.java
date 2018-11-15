package uk.gergely.kiss.data.provider.administration.util;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.gergely.kiss.data.provider.administration.PermissionEnum;
import uk.gergely.kiss.data.provider.administration.RoleEnum;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.administration.service.AuthorizationTypeVOUserRoleVOPermissionVOService;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizationType;
import uk.gergely.kiss.data.provider.administration.util.domain.RolePermissionPair;

@Component
public class AuthorizationTypeVOToAuthorizationTypeConverterUtil {
	private final static Logger LOGGER = LoggerFactory
			.getLogger(AuthorizationTypeVOToAuthorizationTypeConverterUtil.class);
	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVOService authorizationTypeVOUserRoleVOPermissionVOService;

	public AuthorizationType convert(AuthorizationTypeVO authorizationTypeVO) {
		LOGGER.info("convert was called with authorizationTypeVO: " + authorizationTypeVO);
		AuthorizationType authorizationType = new AuthorizationType();
		authorizationType.setName(authorizationTypeVO.getName());
		authorizationType.setDescription(authorizationTypeVO.getDescription());

		List<RolePermissionPair> userRolePermission = new ArrayList<>();

		List<AuthorizationTypeVOUserRoleVOPermissionVO> authorizationTypeVOUserRoleVOPermissionVO = authorizationTypeVOUserRoleVOPermissionVOService
				.getAllAuthorizationTypeVOUserRoleVOPermissionVO();
		for (AuthorizationTypeVOUserRoleVOPermissionVO aTVOUURVOPVO : authorizationTypeVOUserRoleVOPermissionVO) {
			if (aTVOUURVOPVO.getAuthorizationTypeVO().getId() == authorizationTypeVO.getId()) {
				RolePermissionPair rolePermission = new RolePermissionPair();
				rolePermission.setRole(RoleEnum.valueOf(aTVOUURVOPVO.getUserRoleVO().getName()));
				rolePermission.setPermission(PermissionEnum.valueOf(aTVOUURVOPVO.getPermission()));
				userRolePermission.add(rolePermission);
			}
		}

		authorizationType.setRolePermissionList(userRolePermission);
		LOGGER.info("convert: authorizationTypeVO: {}, was converted to authorizationType: {}", authorizationTypeVO,
				authorizationType);
		return authorizationType;
	}
}
