package com.syntax.test;

import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		LoginPageElements login = new LoginPageElements();
                     //(class.element , element Path)
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
       
		isDisplay(login.logo); //is logo displayed?    
		
		click(login.loginBtn);

		DashBoardPageElements dashboard = new DashBoardPageElements();
         
		sendText(dashboard.welcome,"Welcome Admin");
		
	}
}
