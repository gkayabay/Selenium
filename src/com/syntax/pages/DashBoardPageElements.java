package com.syntax.pages;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.syntax.utils.BaseClass;

	public class DashBoardPageElements {

		@FindBy(id="welcome")   //welcome text on the upper right handcorner 
		public WebElement welcome;
		
		// DashBoard Page  or PIM in oldugu page 
		@FindBy(xpath="//a[@id='menu_pim_viewPimModule']/b")   //go to PIM link
		public WebElement pim;
		
		//addemp
		@FindBy(id="menu_pim_addEmployee")
		public WebElement addEmployee;
		
	
		public DashBoardPageElements() {
			PageFactory.initElements(BaseClass.driver, this);  //driver comes form C=BaseClass. this-->objct of this class I initialize
		}
	}
	
	

