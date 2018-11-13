package uk.gergely.kiss.data.provider.service.administration;

import java.util.List;

import uk.gergely.kiss.data.provider.model.administration.util.model.AuthorizedUser;

public interface AuthorizedUserService {

	public List<AuthorizedUser> getAuthorizedUserList();
}
