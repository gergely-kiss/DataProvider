package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.administration.model.AuthorizationTypeVOUserRoleVOPermissionVO;
import uk.gergely.kiss.data.provider.administration.repositories.AuthorizationTypeVOUserRoleVOPermissionVORepository;

@Service
public class RolePermissionPairServiceImpl implements RolePermissionPairService {
	@Autowired
	AuthorizationTypeVOUserRoleVOPermissionVORepository repo;
	
	private final static Logger LOGGER = LoggerFactory.getLogger(RolePermissionPairService.class);

	@Override
	public List<AuthorizationTypeVOUserRoleVOPermissionVO> getAllAuthorizationTypeVOUserRoleVOPermissionVO() {
		LOGGER.info("getAllAuthorizationTypeVOUserRoleVO called");
		List<AuthorizationTypeVOUserRoleVOPermissionVO> authorizationTypeVOUserRoleVOList = (List<AuthorizationTypeVOUserRoleVOPermissionVO>) repo.findAll();
		LOGGER.info("getAllAuthorizationTypeVOUserRoleVO: authorizationTypeVOUserRoleVOList: {} ", authorizationTypeVOUserRoleVOList);
		return authorizationTypeVOUserRoleVOList;
	}

}
