package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import uk.gergely.kiss.data.provider.administration.model.AuthorizationVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizationVORepository;

public class AuthorizationVOServiceImpl implements AuthorizationVOService {
	@Autowired
	AuthorizationVORepository repo;

	private final static Logger LOGGER = LoggerFactory.getLogger(AuthorizationTypeVOUserRoleVOPermissionVOService.class);

	@Override
	public List<AuthorizationVO> getAllUserRoles() {
		LOGGER.info("getAllUserRoles was called");
		List<AuthorizationVO> userRoleVOList = (List<AuthorizationVO>) repo.findAll();
		LOGGER.info("getAllUserRoles: userRoleVOList: {}", userRoleVOList);
		return userRoleVOList;
	}

}
