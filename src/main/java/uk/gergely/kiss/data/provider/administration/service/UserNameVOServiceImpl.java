package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.gergely.kiss.data.provider.administration.model.UserNameVO;
import uk.gergely.kiss.data.provider.administration.repositories.UserNameVORepository;

@Service
public class UserNameVOServiceImpl implements UserNameVOService {
	private final static Logger LOGGER = LoggerFactory.getLogger(UserNameVOServiceImpl.class);
	@Autowired
	UserNameVORepository userNameVORepository;

	@Override
	public UserNameVO saveUserNameVO(UserNameVO userNameVO) {
		LOGGER.info("saveUserNameVO with UserNameVO: {} was called", userNameVO);
		UserNameVO savedUserNameVO = userNameVORepository.save(userNameVO);
		LOGGER.info("savedUserNameVO {}", savedUserNameVO);
		return savedUserNameVO;
	}

	@Override
	public List<UserNameVO> getAllUserNameVO() {
		LOGGER.info("getAll was called");
		List<UserNameVO> userNameVOList = (List<UserNameVO>) userNameVORepository.findAll();
		LOGGER.info("getAll userNameVOList");
		return userNameVOList;
	}

	@Override
	public void deleteUserNameVO(UserNameVO userNameVO) {
		LOGGER.info("deleteUserNameVO was called with the UserVO: {}", userNameVO);
		userNameVORepository.delete(userNameVO);

		if (userNameVORepository.existsById(userNameVO.getId())) {
			LOGGER.info("deleteUserNameVO: error occurred the userNameVO still exist {}", userNameVO);
		} else {
			LOGGER.info("deleteUserNameVO: deleted userNameVO( {} ) deleted", userNameVO);
		}

	}

	@Override
	public UserNameVO getUserNameVOById(Integer id) {
		LOGGER.info("getUserNameVOByHostReference was called with hostReference: {} was called", id);
		UserNameVO userNameVO = userNameVORepository.findById(id).get();
		LOGGER.info("getUserNameVOByHostReference: found {}", userNameVO);
		return userNameVO;
	}

}
