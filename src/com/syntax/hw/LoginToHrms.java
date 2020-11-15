package com.syntax.hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginToHrms {
  
	public static WebDriver driver; //we made instance variable as static to access also inside other methods and to all classes within the same class
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String filePath =System.getProperty("user.dir")+ "/configs/configuration.properties";//dynamically "user.dir"+/configs/configuration.properties"
		
		FileInputStream fis = new FileInputStream(filePath);//to make connections to read
		
		Properties prop = new Properties();//To handle properties files we need Properties class. call the properties class and has its own metods. 
		
		prop.load(fis); //loaded file. this variable refers key and values. it is loading our inputstream
		
		String browser = prop.getProperty("browser");//getting the browser 
	
//		 WebDriver driver = null;  or we can keep inside main method but have to initialize by null.
		 
		switch(browser.toLowerCase()) { //converted browser to the lowercase
		case "chrome":       //If the browser chrome, open chrome driver
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver = new ChromeDriver();
			break;
		case "firefox":      
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		    driver = new FirefoxDriver();
			break;
		}
		 
		driver.get(prop.getProperty("url"));
		Thread.sleep(30000); //to close the execution
		
		driver.close();
		 
		
	}

}
