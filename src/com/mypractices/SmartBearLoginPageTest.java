package com.mypractices;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class SmartBearLoginPageTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		
		SmartBearLoginPage login =new SmartBearLoginPage();
		
		sendText(login.username,ConfigsReader.getProperty("username"));
		
		sendText(login.password,ConfigsReader.getProperty("password"));
		
		isDisplay(login.text);
		
		click(login.loginBtn);
		
		wait(5);
		
		tearDown();
	

	}

}
