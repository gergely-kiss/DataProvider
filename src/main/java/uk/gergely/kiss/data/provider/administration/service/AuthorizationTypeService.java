package uk.gergely.kiss.data.provider.administration.service;

import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizationType;

public interface AuthorizationTypeService {
	public AuthorizationType getAuthorizationTypeVOByName(String name);
}
