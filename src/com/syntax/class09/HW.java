package com.syntax.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class HW extends BaseClass {
//	TC 1: Calendar headers and rows verification
//	Open chrome browser
//	Go to “https://www.aa.com/homePage.do”
//	Enter From and To
//	Select departure as July 14 of 2020
//	Select arrival as November 8 of 2020
//	Close browser
//	Depart Month Year Xpath: "//div[contains(@class, 'ui-corner-left')]/div"
//	Depart Month Days Xpath: //div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td
//	Next Button Xpath: //a[@title='Next']
//	Return Month Xpath: //span[@class='ui-datepicker-month']
//	Return Days Xpath: //table[@class='ui-datepicker-calendar']/tbody/tr/td
//	You can put the logic the way you want.

	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).click();

		String month = driver.findElement(By.xpath(
				"//div[contains(@class, 'ui-corner-left')]/div")).getText();

		// inspect month
		while (!month.equals("July 2020")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
			month = driver.findElement(By.xpath(
					"//div[contains(@class, 'ui-corner-left')]/div")).getText();
		}
		List<WebElement> days = driver.findElements(
				By.xpath("//div[contains(@class, 'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
		for (WebElement day : days) {
			String dayText = day.getText();

			if (day.equals("14")) {
				day.click();
				break;
			}
		}
		
		WebElement returnTo = driver.findElement(By.xpath("input#aa-returningFrom"));
		returnTo.click();
		//retunmMonth
		String depMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	
		while(!depMonth.equals("November 2020")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			Thread.sleep(2000);
			depMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		}
		List<WebElement> returnDays = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		
		for(WebElement returnDay : returnDays) {
			String rDay = returnDay.getText();
			if(rDay.equals("8")) {
				returnDay.click();
				break;
			}
		}
		Thread.sleep(2000);
		
	}
}
