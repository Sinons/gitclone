package edu.hnust.shanon.mapper.login;

import edu.hnust.shanon.po.UserDetails;
import edu.hnust.shanon.po.Users;

public interface LoginMapper {
	
	//�û���¼��֤
	public UserDetails select(Users users);
	
	//�û�ע��
	public void save(UserDetails user);
	
}
