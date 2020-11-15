package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;

public class HrmsLogoDislayTest extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		LoginPage login = new LoginPage();
		isDisplay(login.logo);     //if Syntax logo su display oldu ise pass degilse fails.
		wait(3);
		
		

	}

}
