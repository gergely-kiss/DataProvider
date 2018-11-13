package uk.gergely.kiss.data.provider.service.administration;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.model.administration.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.repositories.administration.AuthorizationTypeVOUserRoleVOPermissionVORepository;

@Service
public class AuthorizationTypeVOUserRoleVOPermissionVOServiceImpl implements AuthorizationTypeVOUserRoleVOPermissionVOService {
	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVORepository repo;
	
	private final static Logger LOGGER = Logger.getLogger(String.valueOf(AuthorizationTypeVOUserRoleVOPermissionVOService.class));

	@Override
	public List<AuthorizationTypeVOUserRoleVOPermissionVO> getAllAuthorizationTypeVOUserRoleVOPermissionVO() {
		LOGGER.info("getAllAuthorizationTypeVOUserRoleVO called");
		List<AuthorizationTypeVOUserRoleVOPermissionVO> authorizationTypeVOUserRoleVOList = (List<AuthorizationTypeVOUserRoleVOPermissionVO>) repo.findAll();
		LOGGER.info("getAllAuthorizationTypeVOUserRoleVO: authorizationTypeVOUserRoleVOList: " + authorizationTypeVOUserRoleVOList);
		return authorizationTypeVOUserRoleVOList;
	}

}
