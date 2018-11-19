package uk.gergely.kiss.data.provider.administration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;
import uk.gergely.kiss.data.provider.administration.repositories.UserRoleVORepository;
import uk.gergely.kiss.data.provider.administration.util.RoleBuilder;
import uk.gergely.kiss.data.provider.administration.util.domain.Role;

@Service
public class UserRoleServiceImpl implements UserRoleService {
	private final static Logger LOGGER = LoggerFactory.getLogger(UserRoleService.class);

	@Autowired
	private UserRoleVORepository repo;
	@Autowired
	private RoleBuilder builder;

	@Override
	public Role getAuthorizationTypeVOByName(String name) {
		LOGGER.info("getAuthorizationTypeVOById called with the following id: {} ",name);
		UserRoleVO authorizationTypeVO = repo.findByName(name);
		LOGGER.info("getAuthorizationTypeVOById: authorizationTypeVO: {}", authorizationTypeVO);
		Role authorizationType = builder.build(authorizationTypeVO);
		LOGGER.info("getAuthorizationTypeVOById: authorizationType to return: {}", authorizationType);
		return authorizationType;
	}
}
