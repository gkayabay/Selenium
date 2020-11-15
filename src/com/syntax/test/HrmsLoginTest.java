package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsLoginTest extends CommonMethods {

	public static void main(String[] args) {
	
		setUp();
		
		LoginPage login = new LoginPage(); //create obj to reach the variables from LoginPage
                  //(element, text-->to which element you want to send text)
		sendText(login.username, ConfigsReader.getProperty("username"));//login.username-->to reach the username from loginPage
		                             //actual value of password comes from the ConfigsReader class tan getProperty methodile gelir.
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		//click(WebElement)
		click(login.loginBtn);  
		
		wait(5);
		
		tearDown();
		
 
	}

}
