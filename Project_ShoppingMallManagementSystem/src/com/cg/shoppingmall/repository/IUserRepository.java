package com.cg.shoppingmall.repository;

import com.cg.shoppingmall.entities.User;

public interface IUserRepository 
{
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(int id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
