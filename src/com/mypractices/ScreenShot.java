package com.mypractices;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class ScreenShot  extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    WebElement password	= driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		String userName = "Admin";
		String welcomeText = driver.findElement(By.id("welcome")).getText();  //welcome text inin oldugu yere git ordan bana text i getir
		if(welcomeText.contains(userName)) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		
		
		//Lets take a screenshot of the test case
		
		//Downcast the driver to TakeScreenShot
		TakesScreenshot ts = (TakesScreenshot) driver;//convert screenshot as takesscreenshot
		
		//getScreenshotAs() outputType
		File screen = ts.getScreenshotAs(OutputType.FILE);   //bu sreenshotin bana file olarak dondurmesini istiyorum
		

		//FileUtils Library
		//commons.io 2.6 --->takesscreenshot i burdan yardim alarak kullaniyorum
		FileUtils.copyFile(screen, new File ( "screenshots/ORANGE/ValidLogin.png")); //create screenshot ve gidecegi yeri 
	                     //source    //destination :screenshots dosyasinin altinda ORANGE/bunuda altinda ValidLogin isminde png uzantili dosyada screensshot etti


	}
	
}
