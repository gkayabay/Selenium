package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsLogin {

	public static void main(String[] args) {
        String url = "https://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//windows user add .exe
		
		WebDriver driver = new ChromeDriver();//to open chrome browser
		driver.get(url);
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");//find element by classname

		driver.findElement(By.name("txtPassword")).sendKeys("Admin123");
		
	
		driver.findElement(By.className("button")).click(); //link below username
		driver.close();
		
		   
		
	}	
}
