package uk.gergely.kiss.data.provider.administration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.gergely.kiss.data.provider.administration.model.UserNameVO;
import uk.gergely.kiss.data.provider.administration.repositories.UserNameVORepository;

@Service
public class UserNameServiceImpl implements UserNameService {
	private final static Logger LOGGER = LoggerFactory.getLogger(UserNameServiceImpl.class);
	@Autowired
	UserNameVORepository userNameVORepository;

	@Override
	public UserNameVO saveUserName(String userName) {
		LOGGER.info("saveUserNameVO with UserName: {} was called", userName);
		UserNameVO savedUserNameVO = userNameVORepository.save(new UserNameVO(userName));
		LOGGER.info("savedUserNameVO {}", savedUserNameVO);
		return savedUserNameVO;
	}

	@Override
	public void deleteUserName(String userName) {
		LOGGER.info("deleteUserNameVO was called with the UserVO: {}", userName);
		userNameVORepository.deleteByUserName(userName);

		if (userNameVORepository.findByUserName(userName) != null ) {
			LOGGER.info("deleteUserNameVO: error occurred the userNameVO still exist {}", userName);
		} else {
			LOGGER.info("deleteUserNameVO: deleted userNameVO( {} ) deleted", userName);
		}

	}
}
