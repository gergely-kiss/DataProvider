package uk.gergely.kiss.data.provider.administration.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.gergely.kiss.data.provider.administration.PermissionEnum;
import uk.gergely.kiss.data.provider.administration.RoleEnum;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizationTypeVOUserRoleVOPermissionVORepository;
import uk.gergely.kiss.data.provider.administration.util.domain.RolePermissionPair;

@Component
public class RolePermissionPairBuilder {

	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVORepository repo;

	public List<RolePermissionPair> build(Integer authorizationId) {
		List<RolePermissionPair> userRolePermission = new ArrayList<>();

		List<AuthorizationTypeVOUserRoleVOPermissionVO> authorizationTypeVOUserRoleVOPermissionVO = (List<AuthorizationTypeVOUserRoleVOPermissionVO>) repo
				.findAll();
		for (AuthorizationTypeVOUserRoleVOPermissionVO aTVOUURVOPVO : authorizationTypeVOUserRoleVOPermissionVO) {
			if (aTVOUURVOPVO.getAuthorizationTypeVO().getId() == authorizationId) {
				RolePermissionPair rolePermission = new RolePermissionPair();
				rolePermission.setRole(RoleEnum.valueOf(aTVOUURVOPVO.getUserRoleVO().getName()));
				rolePermission.setPermission(PermissionEnum.valueOf(aTVOUURVOPVO.getPermission()));
				userRolePermission.add(rolePermission);
			}
		}
		return userRolePermission;

	}
}
