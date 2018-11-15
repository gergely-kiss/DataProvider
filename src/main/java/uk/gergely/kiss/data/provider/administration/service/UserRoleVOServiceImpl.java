package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.administration.model.UserRoleVO;
import uk.gergely.kiss.data.provider.administration.repositories.UserRoleVORepository;

@Service
public class UserRoleVOServiceImpl implements UserRoleVOService {
	@Autowired
	UserRoleVORepository repo;

	private final static Logger LOGGER = LoggerFactory.getLogger(AuthorizationTypeVOUserRoleVOPermissionVOService.class);

	@Override
	public List<UserRoleVO> getAllUserRoles() {
		LOGGER.info("getAllUserRoles was called");
		List<UserRoleVO> userRoleVOList = (List<UserRoleVO>) repo.findAll();
		LOGGER.info("getAllUserRoles: userRoleVOList: {}", userRoleVOList);
		return userRoleVOList;
	}

}
