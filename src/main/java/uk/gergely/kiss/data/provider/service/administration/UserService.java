package uk.gergely.kiss.data.provider.service.administration;

import uk.gergely.kiss.data.provider.model.administration.UserVO;

public interface UserService {
	
	public UserVO getUserByHostReference(String hostReference);
	public UserVO createUser(UserVO userVO);
	public UserVO updateUser(UserVO userVO);
	public UserVO deleteUser(UserVO userVO);
	
}
