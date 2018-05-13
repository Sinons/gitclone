package edu.hnust.shanon.mapper.login;

import edu.hnust.shanon.po.UserDetails;
import edu.hnust.shanon.po.Users;

public interface LoginMapper {
	
	//用户登录验证
	public UserDetails select(Users users);
	
	//用户注册
	public void save(UserDetails user);
	
}
