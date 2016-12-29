package com.niit.UserDAO.Impl;

import com.niit.ShoppingCart.UserDAO.UserDAO;

public class UserDAOImpl implements UserDAO {
	
	public boolean isValidCredentials(String id, String password)
	{
	if(id.equals("simcon") && password.equals("1234"))
	{
	 return true;	
	}
	
	else
	{
	return false;
	}
	}

}
