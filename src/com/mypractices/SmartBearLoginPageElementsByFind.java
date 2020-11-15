package com.mypractices;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class SmartBearLoginPageElementsByFind extends CommonMethods {
	
     @FindBy(id="ctl00_MainContent_username")
     public WebElement username;
     
     @FindBy(id="ctl00_MainContent_password")
     public WebElement password;
     
     @FindBy(id="ctl00_MainContent_login_button")
     public WebElement loginBtn;
     
     public SmartBearLoginPageElementsByFind () {
    	 PageFactory.initElements(BaseClass.driver, this);
    	 
     }
	
	
	
	
	
	

}
