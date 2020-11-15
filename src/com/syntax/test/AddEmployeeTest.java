package com.syntax.test;

import com.syntax.pages.AddEmployeePage;
import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AddEmployeeTest  extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
        //Login page elements
		LoginPageElements login = new LoginPageElements();
                     //(class.element , element Path)
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		sendText(login.password, ConfigsReader.getProperty("password"));
   
		click(login.loginBtn);

		//DashBoard elements
		DashBoardPageElements DB = new DashBoardPageElements();
		wait(3);
		click(DB.pim);
		wait(3);
		click(DB.addEmployee);
		
		
		//Add Employee page elements
		AddEmployeePage emp = new AddEmployeePage();
		
		sendText(emp.firstname, ConfigsReader.getProperty("firstname"));

		sendText(emp.lastname, ConfigsReader.getProperty("lastname"));
		
		sendText(emp.empID, ConfigsReader.getProperty("empID"));
	
		click(emp.saveBtn);
		
		tearDown();
		
		

	}

}
