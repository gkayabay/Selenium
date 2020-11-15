package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");

		// get the rows number --->inspect table    /table/tbody/tr
		List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class, 'su-table')]/table/tbody/tr"));// inspect
																													// table
																													// by
																													// class
																													// name
		int rowNums = rows.size();
		System.out.println("Total row number is " + rowNums);

		
		
		// get the cols number  --->inspectTable /table/tbody/tr[1]/td  //1.row gives colmuns name
		List<WebElement> cols = driver
				.findElements(By.xpath("//div[contains(@class, 'su-table')]/table/tbody/tr[1]/td"));
		int colNums = cols.size();
		System.out.println("Total number of cols is :" + colNums);

		//extracting cell data
		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 1; j <= cols.size(); j++) {
				WebElement cellData = driver.findElement(
						By.xpath("//div[contains(@class, 'su-table')]/table/tbody/tr[" + i + "]/td[" + j + "]"));
				String cellDataText = cellData.getText();                       // if the rows size changes tr[" + i + "]
				//System.out.println(cellDataText);
				if(j==2) {     //if cols contains decprition , we get the only the second coloums and print it
					System.out.println(cellDataText);
					
				}
			}

		}

	}

}
