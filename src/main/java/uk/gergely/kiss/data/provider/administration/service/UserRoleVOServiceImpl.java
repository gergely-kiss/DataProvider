package uk.gergely.kiss.data.provider.administration.service;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;
import uk.gergely.kiss.data.provider.administration.repositories.UserRoleVORepository;

public class UserRoleVOServiceImpl implements UserRoleVOService {
	private final static Logger LOGGER = LoggerFactory.getLogger(UserRoleVOService.class);

	@Autowired
	UserRoleVORepository repo;

	@Override
	public UserRoleVO getAuthorizationTypeVOById(Integer id) {
		LOGGER.info("getAuthorizationTypeVOById called with the following id: {} ", id);
		Optional<UserRoleVO> authorizationTypeVO = repo.findById(id);
		LOGGER.info("getAuthorizationTypeVOById: authorizationTypeVO: {}", authorizationTypeVO.get());
		return authorizationTypeVO.get();
	}
}
