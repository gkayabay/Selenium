package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {

	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.setUp();
		
		
		driver.switchTo().frame("FrameOne");  //switch to frameOne by name 
		boolean logoIsDis = driver.findElement(By.id("hide")).isDisplayed(); //frame 1 in icindeki frame is it displayed or not
		System.out.println("Logo inside frame is displayed : "+logoIsDis);
		driver.switchTo().defaultContent(); //back to main window (or parent content)
		
		driver.switchTo().frame("FrameTwo");
		boolean enrolBtnisEnabled = driver.findElement(By.className("enroll-bttn")).isEnabled(); //is it enabled(clcikable or NOT)
		System.out.println("Enrol Button inside frame 2 is enabeld: "+ enrolBtnisEnabled);

		BaseClass.tearDown();
		
		
	}

}
