package com.syntax.SeleniumReview01;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
         
		//webpage deki yeni bir tab i tikladi.
		WebElement newBrowswerTabButton = driver.findElement(By.xpath("//button[text() ='New Browser Tab']"));

		newBrowswerTabButton.click();

		// getting parent window ID and close
		String parentWindow = driver.getWindowHandle(); // i get the ID of parent window
		Thread.sleep(2000);
		driver.close();

		//getting the all window handles
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator(); // --->iterating through the windows
		// checking if there is any other window handle coming up
		while (it.hasNext()) { // if there is any elemment go inside the loop
			String childWindow = it.next();
			// compare parent window with child window
			if (!parentWindow.equals(childWindow)) { // anytime when you swtch to window you have to compare
				driver.switchTo().window(childWindow);
			}
		}

		WebElement header = driver.findElement(By.xpath("//strong[contains(text(), 'Agile Testing')]"));
		String headerText = header.getText();
		System.out.println(headerText); // NoSuchWindowException

	}

}
