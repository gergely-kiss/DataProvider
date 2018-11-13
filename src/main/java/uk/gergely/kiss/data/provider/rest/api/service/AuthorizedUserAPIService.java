package uk.gergely.kiss.data.provider.rest.api.service;

import java.util.List;

import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizedUser;

public interface AuthorizedUserAPIService {
	public List<AuthorizedUser> getAllAuthorizedUser();
}
