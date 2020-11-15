package com.syntax.class02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HwProperties {
	//CREATE A PROPERTY FILE TO STORE following configurations:
	//	browser=
	//	url=
	//	username=
	//	password=
 
	//	In your Selenum code use values from properties file to open 
	//   specifified browser, navigate to specified url and enter username and password
    static WebDriver driver;
	public static void browser(String browser) {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver = new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
		}
			
		}
		public static void main(String[] args) throws IOException {
			
			FileInputStream filePath = new FileInputStream("/Users/gulbahar/eclipse-workspace/JavaBasics/configs/HW.properties");
			
			Properties prop = new Properties();
			prop.load(filePath);
			
			String browser = prop.getProperty("browser");
			browser("google chrome");
			
			driver.get(prop.getProperty("url"));
			driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
			driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
			driver.close();

	}

}
