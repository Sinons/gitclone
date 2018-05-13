package edu.hnust.shanon.service;

import edu.hnust.shanon.po.UserDetails;
import edu.hnust.shanon.po.Users;

public interface LoginService {
	
	public UserDetails select(Users user);
	
	public void save(UserDetails user);
}
