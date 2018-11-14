package uk.gergely.kiss.data.provider.administration.service;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizationTypeVORepository;

public class AuthorizationTypeServiceImpl implements AuthorizationTypeService {
	private final static Logger LOGGER = Logger.getLogger(String.valueOf(AuthorizationTypeService.class));

	@Autowired
	AuthorizationTypeVORepository repo;

	@Override
	public AuthorizationTypeVO getAuthorizationTypeVOById(Integer id) {
		LOGGER.info("getAuthorizationTypeVOById: called with the following id: " + id);
		Optional<AuthorizationTypeVO> authorizationTypeVO = repo.findById(id);
		LOGGER.info("getAuthorizationTypeVOById: authorizationTypeVO: " + authorizationTypeVO.get());
		return authorizationTypeVO.get();
	}
}
