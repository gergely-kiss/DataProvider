package uk.gergely.kiss.data.provider.administration.util;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.gergely.kiss.data.provider.administration.PermissionEnum;
import uk.gergely.kiss.data.provider.administration.AuthorizationTypeEnum;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizationTypeVOUserRoleVOPermissionVORepository;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizationTypeEnumPermissionEnumPair;

@Component
public class AuthorizationTypeEnumPermissionEnumPairBuilder {

	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVORepository repo;

	public List<AuthorizationTypeEnumPermissionEnumPair> build(Integer authorizationId) {

		return ((List<AuthorizationTypeVOUserRoleVOPermissionVO>) repo.findAll()).stream()
				.filter(a -> a.getId().equals(authorizationId))
				.map(a -> new AuthorizationTypeEnumPermissionEnumPair(AuthorizationTypeEnum.valueOf(a.getAuthorizationTypeVO().getName()),
						PermissionEnum.valueOf(a.getPermission())))
				.collect(Collectors.toList());
	}

}
