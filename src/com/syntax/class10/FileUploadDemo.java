package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class FileUploadDemo {

	public static void main(String[] args) throws InterruptedException {

		// Path of the file to upload
		String filePath = "/Users/syntax/Desktop/myFile.png";

		// open browser and navigate to the-internet.herokuapp.com
		String url = "https://the-internet.herokuapp.com/";
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		// click on file Upload link
		driver.findElement(By.linkText("File Upload")).click();

		// clcik on choose file inspect et choose u
		// driver.findElement(By.id("file-upload")).click();
		// we simply use sendKeys() method to upload the file.Locate the choose element and send() path of file to it.
		// sendKeys---> filepath that the file adress w want to upload (
		driver.findElement(By.id("file-upload")).sendKeys(filePath); // sendKeys(upload edecegimiz file in adressi) veya
																		// nerde bulundugu

		// mavi Upload linki we inspect right after the file was upload
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
