package edu.hnust.shanon.serviceImpl.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hnust.shanon.mapper.login.LoginMapper;
import edu.hnust.shanon.po.Result;
import edu.hnust.shanon.po.UserDetails;
import edu.hnust.shanon.po.Users;
import edu.hnust.shanon.service.LoginService;

@Service("loginImpl")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginMapper loginMapper;
	public UserDetails select(Users user) {
		
		return loginMapper.select(user);
	}
	
	public void save(UserDetails user) {
		
		loginMapper.save(user);
	}
}
