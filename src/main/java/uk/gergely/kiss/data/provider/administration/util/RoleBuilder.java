package uk.gergely.kiss.data.provider.administration.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;
import uk.gergely.kiss.data.provider.administration.util.domain.Role;

@Component
public class RoleBuilder {
	private final static Logger LOGGER = LoggerFactory.getLogger(RoleBuilder.class);

	@Autowired
	private AuthorizationTypeEnumPermissionEnumPairBuilder authorizationTypeEnumPermissionEnumPairBuilder;

	public Role build(UserRoleVO userRoleVO) {
		LOGGER.info("convert was called with authorizationTypeVO: " + userRoleVO);
		Role authorizationType = new Role();
		authorizationType.setName(userRoleVO.getName());
		authorizationType.setDescription(userRoleVO.getDescription());
		authorizationType.setAuthorizationTypePermissionPairList(authorizationTypeEnumPermissionEnumPairBuilder.build(userRoleVO.getId()));
		LOGGER.info("convert: authorizationTypeVO: {}, was converted to authorizationType: {}", userRoleVO,
				authorizationType);
		return authorizationType;
	}
}
