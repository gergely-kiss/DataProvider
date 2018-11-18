package uk.gergely.kiss.data.provider.administration.service;

import uk.gergely.kiss.data.provider.administration.util.domain.Role;

public interface UserRoleService {
	public Role getAuthorizationTypeVOByName(String name);
}
