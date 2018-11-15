package uk.gergely.kiss.data.provider.administration.service;

import java.util.List;

import uk.gergely.kiss.data.provider.administration.util.domain.User;

public interface UserService {
	
	public User getUserByHostReference(String hostReference);
	public User saveUser(User user);
	public User updateUser(User user);
	public void deleteUser(User user);
	public List<User> getAllUser();
	
}
