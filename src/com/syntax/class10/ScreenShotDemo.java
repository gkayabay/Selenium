package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		//http://166.62.36.207/humanresources/symfony/web/index.php/dashboard
		setUp();
        //Login to HRM Application
		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));// find element by classname
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.className("button")).click(); // link below username

		Thread.sleep(2000);
		//Create an object of TakesScreenshot interface and cast the Webdriver with it.
		//1.convert downcasting for TakesScreenshot first
		TakesScreenshot ts = (TakesScreenshot)driver; // downcasting becusae Webdriver is parent, takesscreenshot is
														// child
		//use getScreenshotAs() method to take the screenshot(int the constructor pass Type.File
		File sourceFile  = ts.getScreenshotAs(OutputType.FILE);
		
		//3. Call the FileUtils class , store it into a location(place). //calling the constructor of new obj
		//new File will be creaed. inside the screenshots folder HRMS folder will be created and inside this dashboard
        // and store as an image or png
     
		//Copy the file from source to a another destination 
		try {
		FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/dashboard.png")); //if this location is not avaliable throw exception
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot was taken");
		}
		tearDown();

	}

}
