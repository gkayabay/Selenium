package com.mypractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class AmericanAirline extends CommonMethods {

	// AmericanAiline LoginPage Test

	public static void main(String[] args) {
		setUp();
        
		// select dep and destination
		driver.findElement(By.xpath("//label[@for='reservationFlightSearchForm.originAirport']/input")).clear();
		driver.findElement(By.xpath("//label[@for='reservationFlightSearchForm.originAirport']/input"))
				.sendKeys("Boston");
		driver.findElement(By.xpath("//input[@id ='reservationFlightSearchForm.destinationAirport']")).clear();
		driver.findElement(By.xpath("//input[@id ='reservationFlightSearchForm.destinationAirport']")).sendKeys("LAX");
        driver.findElement(By.id("aa-leavingOn")).click();
		// select dep date
		boolean flag = false;

		while (!flag) {
			String depMonth = driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).getText();
			System.out.println(depMonth);
			if (depMonth.equals("December 2021")) {
				List<WebElement> daysOfMonth = driver.findElements(
						By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table/tbody/tr/td"));
				for (WebElement days : daysOfMonth) {
					String dayText = days.getText();
					if (dayText.equals("10")) {
						days.click();
						flag = true;
						break;
					}
				}

			} else {
				driver.findElement(By.xpath("//a[@title = 'Next']"));
			}
		}
	}
}
