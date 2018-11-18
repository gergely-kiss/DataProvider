package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;

import uk.gergely.kiss.data.provider.administration.model.AuthorizationVO;

public interface AuthorizationVOService {

	public List<AuthorizationVO> getAllUserRoles();
}
