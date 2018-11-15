package uk.gergely.kiss.data.provider.administration.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizationType;

@Component
public class AuthorizationTypeBuilder {
	private final static Logger LOGGER = LoggerFactory.getLogger(AuthorizationTypeBuilder.class);

	@Autowired
	private RolePermissionPairBuilder rolePermissionPairBuilder;

	public AuthorizationType build(AuthorizationTypeVO authorizationTypeVO) {
		LOGGER.info("convert was called with authorizationTypeVO: " + authorizationTypeVO);
		AuthorizationType authorizationType = new AuthorizationType();
		authorizationType.setName(authorizationTypeVO.getName());
		authorizationType.setDescription(authorizationTypeVO.getDescription());
		authorizationType.setRolePermissionList(rolePermissionPairBuilder.build(authorizationTypeVO.getId()));
		LOGGER.info("convert: authorizationTypeVO: {}, was converted to authorizationType: {}", authorizationTypeVO,
				authorizationType);
		return authorizationType;
	}
}
