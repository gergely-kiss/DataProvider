package uk.gergely.kiss.data.provider.service.administration;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import uk.gergely.kiss.data.provider.model.administration.UserRoleVO;
import uk.gergely.kiss.data.provider.repositories.administration.UserRoleVORepository;

public class UserRoleVOServiceImpl implements UserRoleVOService {
	@Autowired
	UserRoleVORepository repo;

	private final static Logger LOGGER = Logger.getLogger(String.valueOf(AuthorizationTypeVOUserRoleVOPermissionVOService.class));

	@Override
	public List<UserRoleVO> getAllUserRoles() {
		LOGGER.info("getAllUserRoles was called");
		List<UserRoleVO> userRoleVOList = (List<UserRoleVO>) repo.findAll();
		LOGGER.info("getAllUserRoles: userRoleVOList: " + userRoleVOList);
		return userRoleVOList;
	}

}
