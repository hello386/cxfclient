package com.huilan.eps.webservice.service.test;

import java.util.ArrayList;
import java.util.List;

import com.huilan.eps.webservice.service.Login;
import com.huilan.eps.webservice.service.Login.Param;
import com.huilan.eps.webservice.service.Login.Param.Entry;
import com.huilan.eps.webservice.service.LoginProperty;
import com.huilan.eps.webservice.service.PageWSService;
import com.huilan.eps.webservice.service.SiteInfos;
import com.huilan.eps.webservice.service.SiteWSService;
import com.huilan.eps.webservice.service.UserInfo;
import com.huilan.eps.webservice.service.UserInfos;
import com.huilan.eps.webservice.service.UserMgrSite;
import com.huilan.eps.webservice.service.UserWSService;
import com.huilan.eps.webservice.service.impl.PageWSServiceImplService;
import com.huilan.eps.webservice.service.impl.SiteWSServiceImplService;
import com.huilan.eps.webservice.service.impl.UserWSServiceImplService;


public class TestUserService {

	static LoginProperty property = new LoginProperty("admin","admin"); //登陆验证
	static UserWSServiceImplService service=new UserWSServiceImplService();
	static UserWSService userService=service.getUserWSServiceImplPort();
	
	/**
	 * param 参数不知道怎么设置  运行不出来
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Param param=new Param();
		Entry USERNAME = new Entry("USERNAME", "admin");//标题
		param.getEntry().add(USERNAME);
		UserInfos userinfos =  userService.login(property, param);
		System.out.println("-----"+userinfos.getUserInfo().getPassword());*/
	}

	
	
    
}
