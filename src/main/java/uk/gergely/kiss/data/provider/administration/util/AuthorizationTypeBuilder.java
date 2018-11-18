package uk.gergely.kiss.data.provider.administration.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;
import uk.gergely.kiss.data.provider.administration.util.domain.Role;

@Component
public class AuthorizationTypeBuilder {
	private final static Logger LOGGER = LoggerFactory.getLogger(AuthorizationTypeBuilder.class);

	@Autowired
	private AuthorizationTypeEnumPermissionEnumPairBuilder rolePermissionPairBuilder;

	public Role build(UserRoleVO authorizationTypeVO) {
		LOGGER.info("convert was called with authorizationTypeVO: " + authorizationTypeVO);
		Role authorizationType = new Role();
		authorizationType.setName(authorizationTypeVO.getName());
		authorizationType.setDescription(authorizationTypeVO.getDescription());
		authorizationType.setAuthorizationTypePermissionPairList(rolePermissionPairBuilder.build(authorizationTypeVO.getId()));
		LOGGER.info("convert: authorizationTypeVO: {}, was converted to authorizationType: {}", authorizationTypeVO,
				authorizationType);
		return authorizationType;
	}
}
