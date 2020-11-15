package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionClassAmazonDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = BaseClass.setUp();// Amazon.com
		WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));// inspect Account & List
																								// link

		// create action class and pass the driver
		Actions action = new Actions(driver);
		action.moveToElement(account).perform(); // move the account element

		// Hover the mouse over menu
		WebElement element = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']")); // start now ile yazan
																									// get the text
																									// inside the
																									// acocuntlists

		// validate the menu is popped up
		if (element.getText().contains("Start")) {
			System.out.println("Menu Displayed");
		} else {
			System.out.println("Menu did NOT displayed");
		}

		// How to rightclick on a element
		action.contextClick(element).perform();

		// searchBox inspect
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		// hOw to doubleclick on a element
		action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();

		// keysUp-->to hold something (Hold the key and use shift, send thekeys "movie"
		// and perform
		// action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movie").perform();

		Thread.sleep(5000);
		BaseClass.tearDown();

	}

}
