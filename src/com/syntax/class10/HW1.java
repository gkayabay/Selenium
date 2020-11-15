package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

public class HW1 {
//	TC 1: Drag and Drop verification
//	Open chrome browser
//	Go to “http://www.uitestpractice.com/”
//	Click on “Droppable” link
//	Using mouse drag “Drag me to my target” to the “Drop Here”
//	Close the browser
	public static void main(String[] args) throws InterruptedException {
		String url= "http://www.uitestpractice.com/";
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	
		//inspect drag element
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		
		//inspect drop element
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//create an obj of Action Class and pass the webdriver in the constructor
		Actions action = new Actions(driver);
		//1st long way
		action.clickAndHold(drag).moveToElement(drop).release().perform();
		
		//2nd way
		//use dragAnddrop() method to drag and drop element
		//action.dragAndDrop(drag, drop).perform();

		
		//take screenshot of draganddrop page
        TakesScreenshot ts = (TakesScreenshot)driver; 
        //gives a return type of File
        File screen = ts.getScreenshotAs(OutputType.FILE); //driver go get the screenshot as a output type File
        //to work with Files we have to have jar files for Files
        try {
			FileUtils.copyFile(screen, new File("screenshots/SAMPLES/DragandDrop.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(5000);
		driver.close();;
		

	}

}
