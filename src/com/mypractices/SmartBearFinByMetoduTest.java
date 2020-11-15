package com.mypractices;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class SmartBearFinByMetoduTest extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		SmartBearLoginPageElementsByFind login = new SmartBearLoginPageElementsByFind();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		

	}

}
