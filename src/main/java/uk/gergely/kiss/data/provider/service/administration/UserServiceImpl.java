package uk.gergely.kiss.data.provider.service.administration;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.model.administration.UserVO;
import uk.gergely.kiss.data.provider.repositories.administration.UserVORepository;

@Service
public class UserServiceImpl implements UserService {
	Logger LOGGER = Logger.getLogger(String.valueOf(UserService.class));

	@Autowired
	UserVORepository userVORepository;
	
	@Override
	public UserVO getUserByHostReference(String hostReference) {
		return userVORepository.findUserByHostReference(hostReference);
	}

	@Override
	public UserVO createUser(UserVO userVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO updateUser(UserVO userVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO deleteUser(UserVO userVO) {
		// TODO Auto-generated method stub
		return null;
	}
}
