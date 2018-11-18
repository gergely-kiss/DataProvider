package uk.gergely.kiss.data.provider.administration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizationTypeVORepository;
import uk.gergely.kiss.data.provider.administration.util.AuthorizationTypeBuilder;
import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizationType;

@Service
public class AuthorizationTypeServiceImpl implements AuthorizationTypeService {
	private final static Logger LOGGER = LoggerFactory.getLogger(AuthorizationTypeService.class);

	@Autowired
	private AuthorizationTypeVORepository repo;
	@Autowired
	private AuthorizationTypeBuilder builder;

	@Override
	public AuthorizationType getAuthorizationTypeVOByName(String name) {
		LOGGER.info("getAuthorizationTypeVOById called with the following id: {} ",name);
		AuthorizationTypeVO authorizationTypeVO = repo.findByName(name);
		LOGGER.info("getAuthorizationTypeVOById: authorizationTypeVO: {}", authorizationTypeVO);
		AuthorizationType authorizationType = builder.build(authorizationTypeVO);
		LOGGER.info("getAuthorizationTypeVOById: authorizationType to return: {}", authorizationType);
		return authorizationType;
	}
}
