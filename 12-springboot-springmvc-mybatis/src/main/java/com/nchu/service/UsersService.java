package com.nchu.service;

import java.util.List;

import com.nchu.pojo.Users;

public interface UsersService {
	void addUser(Users users);

	List<Users> findUsersAll();
	
	Users findUsersById(int id);
	
	void updateUsers(Users user);
	
	void deleteUserById(int id);
}
