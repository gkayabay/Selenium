package com.mypractices;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class WebTables  extends BaseClass {

	public static void main(String[] args) {
		setUp();
	
		 driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		 
		 //identifying the number of row and coloms
		 List<WebElement> rows = driver.findElements(By.xpath("//table[ @id='task-table' ]/tbody/tr")); //number of rows
		 System.out.println("Number of rows "+ rows.size());//7
		 
		 //columns (HEADERS)
		 List<WebElement> cols = driver.findElements(By.xpath("//table[ @id='task-table' ]/thead/tr/th")); //number of cols
		 System.out.println("Number of cols "+ cols.size());//7
		 
		 
		 
		 //name of columns
		 for(int i=0; i<cols.size(); i++) {
		 String nameofCols =  cols.get(i).getText();
		 System.out.println("Name of columns are :"+nameofCols); //# ,task assigness, status,...
		
		 
		 }
		
		
		 //name of the rows
		 Iterator<WebElement> rowIt = rows.iterator();
		 while(rowIt.hasNext()) {
		 String	rowData =  rowIt.next().getText();
		 System.out.println(rowData);
		 }
		 
		 
		 
		 //finding all cells (all data)
		List<WebElement> cells =  driver.findElements(By.xpath("//table[ @id='task-table' ]/tbody/tr/td	"));//to reach all cells
		                                                                           //tum table body den all cellsler
		 for(WebElement cell: cells) {
			 String cellVal = cell.getText();
			 System.out.println(cellVal);
			 
			 
		 }
		 tearDown();
		 
		

	}

}
