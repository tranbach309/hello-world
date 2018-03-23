package fsoft.service;

import fsoft.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
