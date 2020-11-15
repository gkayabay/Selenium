package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");//key: comes from the console , value: from the chromedriver location)
		//1st step-->To open the browser
		WebDriver driver = new FirefoxDriver();//go ahead and open Chrome Browser

		driver.get("https://www.redfin.com");
		
		String actualUrl = driver.getCurrentUrl(); //actual url(coming from the website)
		
		String expectedUrl = "https://www.redfin.com/"; //expected url
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			String title = driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong url is returned");
		}
	 
		   driver.close();//to close the browser
	}

	}

