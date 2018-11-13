package uk.gergely.kiss.data.provider.service.administration;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import uk.gergely.kiss.data.provider.model.administration.AuthorizationTypeVO;
import uk.gergely.kiss.data.provider.repositories.administration.AuthorizationTypeVORepository;

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
