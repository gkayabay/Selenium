package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {
//HW 5/19/20
	
	//addEmployee page
	
	@FindBy(id="firstName")
    public WebElement firstname;
	
	@FindBy(id="lastName")
	public WebElement lastname;
	
	@FindBy(id="employeeId")
    public WebElement empID;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	
	public AddEmployeePage ()  {
    PageFactory.initElements(BaseClass.driver, this);
	
	
	}	
	
}
