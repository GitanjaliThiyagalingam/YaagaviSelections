package com.yaagavi.selections.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.yaagavi.selections.model.User;

@Service
public interface UserService {
		public abstract void createUser(User user);
	   public abstract void updateUser(String id, User user);
	   public abstract void deleteUser(String id);
	   public abstract Collection<User> getAllUsers();
	   public abstract User getUserById(String id);
	   public abstract User findByUsername(String username);
	   public void save(User user);
}
