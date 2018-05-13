package edu.hnust.shanon.controller;

import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.hnust.shanon.po.Result;
import edu.hnust.shanon.po.UserDetails;
import edu.hnust.shanon.po.Users;
import edu.hnust.shanon.serviceImpl.login.LoginServiceImpl;

@Controller
public class LoginController {
	
	private String successStatus = "success";
	private String failedStatus = "failed";
	private String successCode = "1";
	private String failedCode = "0";
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	//��¼��֤
	@RequestMapping(value="/login/check",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Result loginCheck(@RequestBody Users user){

		UserDetails details = loginServiceImpl.select(user);
		
		if(details==null) {
			return new Result(failedStatus, successCode, "�û������������");
		}
		
		return new Result(successStatus, failedCode, "��¼�ɹ�");	
	}
	
	//ע��
	@RequestMapping(value="/register/save",method=RequestMethod.POST,produces="application/json")
	@ResponseBody
	public Result register(@RequestBody UserDetails user){
		if(loginServiceImpl.select(new Users(user.getPhone(),user.getPassword()))!=null) {
			return new Result(failedStatus, failedCode, "���ֻ����ѱ�ע�ᣬ����������");
		}
		user.setCreate_date(new Date());
		
		loginServiceImpl.save(user);
		return new Result(successStatus, successCode, "ע��ɹ�");
	}
	
}
