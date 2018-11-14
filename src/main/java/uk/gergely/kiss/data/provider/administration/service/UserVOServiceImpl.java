package uk.gergely.kiss.data.provider.administration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.administration.model.UserVO;
import uk.gergely.kiss.data.provider.administration.repositories.UserVORepository;

@Service
public class UserVOServiceImpl implements UserVOService {
	Logger LOGGER = LoggerFactory.getLogger(UserVOService.class);

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
