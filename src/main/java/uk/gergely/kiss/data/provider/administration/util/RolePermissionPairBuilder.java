package uk.gergely.kiss.data.provider.administration.util;

import java.util.List;
import java.util.stream.Collectors;
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

		return ((List<AuthorizationTypeVOUserRoleVOPermissionVO>) repo.findAll()).stream()
				.filter(a -> a.getId().equals(authorizationId))
				.map(a -> new RolePermissionPair(RoleEnum.valueOf(a.getUserRoleVO().getName()),
						PermissionEnum.valueOf(a.getPermission())))
				.collect(Collectors.toList());
	}

}
