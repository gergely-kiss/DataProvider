package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;

import uk.gergely.kiss.data.provider.administration.model.UserNameVO;

public interface UserNameVOService {

	public UserNameVO saveUserNameVO(UserNameVO userNameVO);

	public List<UserNameVO> getAll();
}