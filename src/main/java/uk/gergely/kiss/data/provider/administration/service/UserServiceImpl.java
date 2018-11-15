package uk.gergely.kiss.data.provider.administration.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.administration.model.UserVO;
import uk.gergely.kiss.data.provider.administration.repositories.UserVORepository;
import uk.gergely.kiss.data.provider.administration.util.UserConverter;
import uk.gergely.kiss.data.provider.administration.util.domain.User;

@Service
public class UserServiceImpl implements UserService {
	Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Autowired
	UserVORepository userVORepository;
	@Autowired
	UserNameService userNameVOService;
	@Autowired
	UserConverter userVOToUserConverterUtil;

	@Override
	public User getUserByHostReference(String hostReference) {
		LOGGER.info("getUserByHostReference was called with the hostReference: {}", hostReference);
		UserVO savedUserVO = userVORepository.findUserVOByHostReference(hostReference);
		LOGGER.info("getUserByHostReference: found the following user savedUserVO: {}", savedUserVO);
		User user = userVOToUserConverterUtil.convert(savedUserVO);
		return user;
	}

	@Override
	public User saveUser(User user) {
		// LOGGER.info("saveUserVO was called with the UserVO: {}", userVO);

		// LOGGER.info("saveUserVO: savedUserVO: {}", savedUserVO);
		return new User();
	}

	@Override
	public User updateUser(User userVO) {
		LOGGER.info("updateUserVO was called with the UserVO: {}", userVO);

		// LOGGER.info("updateUserVO: updatedUserVO: {}", updatedUserVO);
		return new User();
	}

	@Override
	public void deleteUser(User userVO) {
		LOGGER.info("deleteUserVO was called with the UserVO: {}", userVO);
		/*
		 * userVORepository.delete(userVO);
		 * userNameVOService.deleteUserNameVO(userVO.getUserNameVO()); if
		 * (userVORepository.existsById(userVO.getId())) {
		 * LOGGER.info("deleteUserVO: error occurred the userVO still exist {}",
		 * userVO); } else { LOGGER.info("deleteUserVO: deleted userVO( {} ) deleted",
		 * userVO);}
		 */
	}

	@Override
	public List<User> getAllUser() {
		LOGGER.info("getAllUserVO was called");
		List<UserVO> userVOList = (List<UserVO>) userVORepository.findAll();
		LOGGER.info("getAllUserVO: userVOList: {}", userVOList);
		List<User> userList = new ArrayList<>();
		return userList;
	}
}
