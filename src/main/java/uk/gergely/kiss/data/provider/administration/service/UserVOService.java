package uk.gergely.kiss.data.provider.administration.service;

import uk.gergely.kiss.data.provider.administration.model.UserVO;

public interface UserVOService {
	
	public UserVO getUserByHostReference(String hostReference);
	public UserVO createUser(UserVO userVO);
	public UserVO updateUser(UserVO userVO);
	public UserVO deleteUser(UserVO userVO);
	
}
