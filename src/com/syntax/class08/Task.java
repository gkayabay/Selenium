package com.syntax.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task extends BaseClass {

//	
//	TC 1: Table headers and rows verification
//	Open chrome browser
//	Go to “http://166.62.36.207/syntaxpractice/”
//	Click on “Table” link
//	Click on “ITable Data Search” link
//	Verify second table consist of 5 rows and 4 columns
//	Print name of all column headers 
//	Print data of all rows
//	Quit Browser

	public static void main(String[] args) {
		setUp();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr")); // tabloBody/tr
																									// =>numbers of row
		System.out.println("Number of rows is: " + rows.size());

		System.out.println("---------------------------Row Data-------------------------------");
		Iterator<WebElement> it = rows.iterator();
		while (it.hasNext()) {
			String rowText = it.next().getText();
			System.out.println(rowText);
		}

		System.out.println("-----------------------Coloumns Data--------------------------------");
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
	    System.out.println("Number of coloumns is: " + cols.size());

		for (WebElement col : cols) {
			String colText = col.getText();
			System.out.println(colText);
		}
		driver.quit();

	}

}
