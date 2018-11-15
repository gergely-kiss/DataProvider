package uk.gergely.kiss.data.provider.administration.util;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import uk.gergely.kiss.data.provider.administration.model.UserVO;
import uk.gergely.kiss.data.provider.administration.util.domain.User;

@Component
public class UserConverter {

	private final static Logger LOGGER = LoggerFactory.getLogger(String.valueOf(UserConverter.class));

	public User convert(UserVO userVO) {
		LOGGER.info("convert was called with UserVO: {}", userVO);
		User user = new User();
		user.setUserName(userVO.getUserNameVO().getUserName());
		user.setId(userVO.getHostReference());
		user.setFirstName(userVO.getFirstName());
		user.setLastName(userVO.getLastName());
		user.setEmail(userVO.getEmail());
		LOGGER.info("UserVO: {} was converted to User: {}", userVO, user);
		return user;
	}

	public List<User> convert(List<UserVO> userVOList) {
		LOGGER.info("convert was called with userVOList {} ", userVOList);
		List<User> userList = new ArrayList<>();
		for (UserVO userVO : userVOList) {
			userList.add(convert(userVO));
		}
		LOGGER.info("userVOList: {} was converted to userList: {}", userVOList, userList);
		return userList;
	}
	
	public UserVO convert(User user) {
		LOGGER.info("convert was called with UserVO: {}", user);
		UserVO userVO = new UserVO();
		LOGGER.info("UserVO: {} was converted to User: {}", userVO, user);
		return userVO;
	}

}
