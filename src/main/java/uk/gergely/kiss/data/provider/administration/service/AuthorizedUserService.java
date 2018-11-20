package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;

import uk.gergely.kiss.data.provider.administration.util.domain.AuthorizedUser;

public interface AuthorizedUserService {

	public List<AuthorizedUser> getAuthorizedUserList();
	public AuthorizedUser getAuthorizedUserByHostreference(String hostreference);
}
