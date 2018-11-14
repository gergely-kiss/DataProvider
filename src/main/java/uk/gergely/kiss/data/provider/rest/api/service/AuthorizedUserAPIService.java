package uk.gergely.kiss.data.provider.rest.api.service;

import java.util.List;

import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizedUser;

public interface AuthorizedUserAPIService {
	public List<AuthorizedUser> getAllAuthorizedUser();
}
