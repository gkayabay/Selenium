package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginPageElements {
            //inpect or identify element
			@FindBy(id="txtUsername")        //@FindBy("element inspect")   , public WebElement username-->stores in a variable
			public WebElement username;   //store the element inside the WebElement
			
			@FindBy(name="txtPassword")
			public WebElement password;
			
			@FindBy(css="input#btnLogin")
			public WebElement loginBtn;
			
			@FindBy(xpath="//div[@id='divLogo']/img")
			public WebElement logo;
			
			//create a constructor of this class and initialize our variables
			public LoginPageElements() {            
				PageFactory.initElements(BaseClass.driver, this); //initialize all elements all at once
			                                                //this--> refers to the current class and all the objects from the current class
			
			}
		}


