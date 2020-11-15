package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args){
	     
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");//key: comes from the console , value: from the chromedriver location)
		//1st step-->To open the browser
		WebDriver driver = new ChromeDriver();//go ahead and open Chrome Browser

		driver.get("https://www.amazon.com");  //actual url aynizamanda 
		
		//this method will fetch the current url
		String actualUrl = driver.getCurrentUrl(); //actual url(coming from the website)
		
		String expectedUrl = "https://www.facebook.com/"; //this is the expected url we created
		
		if(actualUrl.equalsIgnoreCase(expectedUrl)) {
			String title = driver.getTitle();//Return the current title of web application
			System.out.println(title);
		}else {
			System.out.println("Wrong url is returned");
		}
		
	    driver.close();//to close Terminate the session/browser (it is is destroying the object above).
			 	
				
			}

		}  
		   
		   
		   
	
