package uk.gergely.kiss.data.provider.administration.service;

import uk.gergely.kiss.data.provider.administration.model.UserNameVO;

public interface UserNameService {

	public UserNameVO saveUserName(String userName);

	public void deleteUserName(String userName);
}
