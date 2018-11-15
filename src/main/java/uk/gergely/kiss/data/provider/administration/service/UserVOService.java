package uk.gergely.kiss.data.provider.administration.service;

import uk.gergely.kiss.data.provider.administration.model.UserVO;

public interface UserVOService {
	
	public UserVO getUserVOByHostReference(String hostReference);
	public UserVO saveUserVO(UserVO userVO);
	public UserVO updateUserVO(UserVO userVO);
	public void deleteUserVO(UserVO userVO);
	
}
