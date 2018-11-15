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
	@Autowired
	UserNameVOService userNameVOService;

	@Override
	public UserVO getUserVOByHostReference(String hostReference) {
		LOGGER.info("getUserVOByHostReference was called with the hostReference: {}", hostReference);
		UserVO savedUserVO = userVORepository.findUserVOByHostReference(hostReference);
		LOGGER.info("getUserVOByHostReference: found the following user savedUserVO: {}", savedUserVO);
		return savedUserVO;
	}

	@Override
	public UserVO saveUserVO(UserVO userVO) {
		LOGGER.info("saveUserVO was called with the UserVO: {}", userVO);
		userNameVOService.saveUserNameVO(userVO.getUserNameVO());
		UserVO savedUserVO = userVORepository.save(userVO);
		LOGGER.info("saveUserVO: savedUserVO: {}", savedUserVO);
		return savedUserVO;
	}

	@Override
	public UserVO updateUserVO(UserVO userVO) {
		LOGGER.info("updateUserVO was called with the UserVO: {}", userVO);
		UserVO updatedUserVO = userVORepository.save(userVO);
		LOGGER.info("updateUserVO: updatedUserVO: {}", updatedUserVO);
		return updatedUserVO;
	}

	@Override
	public void deleteUserVO(UserVO userVO) {
		LOGGER.info("deleteUserVO was called with the UserVO: {}", userVO);
		userVORepository.delete(userVO);
		userNameVOService.deleteUserNameVO(userVO.getUserNameVO());
		if (userVORepository.existsById(userVO.getId())) {
			LOGGER.info("deleteUserVO: error occurred the userVO still exist {}", userVO);
		} else {
			LOGGER.info("deleteUserVO: deleted userVO( {} ) deleted", userVO);
		}

	}
}
