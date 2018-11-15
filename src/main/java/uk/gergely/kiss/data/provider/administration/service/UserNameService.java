package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;

public interface UserNameService {
	
	public String saveUserName(String userName);

	public List<String> getAllUserName();

	public void deleteUserName(String userName);
}
