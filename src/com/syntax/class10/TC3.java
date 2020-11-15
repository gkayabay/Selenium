package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class TC3 {

	public static void main(String[] args) {
//		TC 3: HRMS Login
//		Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
//		Login to the application by writing xpath based on “parent and child relation”

		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth";

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

//		// using Advanced Xpath indentifying element by parent/child relationship
//		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin"); // parent/child
//		driver.findElement(By.xpath("//div[@id='divPassword']/input")).sendKeys("Hum@nhrm123");
//		driver.findElement(By.xpath("//input[@id='btnLogin']/..")).click(); // child/parent relation

		System.out.println("-----2nd Way by Advanced Xpath indentifying element by following and preceding relationship ");

		// using Advanced Xpath indentifying element by following and preceding
		// relationship
		driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input[1]")).sendKeys("Admin"); // preceding
																													// sibling
		driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");
		WebElement login= driver.findElement(By.xpath("//div[@id='divLoginButton']/input")); // child/parent relation
     
		//using JavascriptExecutor to click the login button
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click()", login);
		
		
	}

}
