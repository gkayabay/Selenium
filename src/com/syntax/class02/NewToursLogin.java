package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewToursLogin {
	//Task C 2: Mercury Tours Registration: 
	//Open chrome browser
	//Go to “http://newtours.demoaut.com/”
	//Click on Register Link
	//Fill out all required info
	//Click Submit
	//User successfully registered
	//(Create 2 scripts using different locators)
 
	
	public static void main(String[] args) {
        String nUrl = "http://newtours.demoaut.com/create_account_success.php";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//windows user add .exe
		
		WebDriver driver = new ChromeDriver();//to open chrome browser
		driver.get(nUrl);
		String url = driver.getCurrentUrl();
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Gulbahar");
		driver.findElement(By.name("lastName")).sendKeys("K");
		//driver.findElement(By.id("userName")).sendKeys("g.kayabay@gmail.com");
		driver.findElement(By.name("adress")).sendKeys("17 box dr");
		driver.findElement(By.name("postalCode")).sendKeys("01460");
		
		driver.close();
		
		
	}

}
