package com.syntax.SeleniumReview01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class AmazonTask extends BaseClass {
	
//	 Go to amazon.com
//	 * select books from the search dropdown
//	 * type Harry potter
//	 * and click on Search
//	 * check Unofficial CookBook checkbox on the left under Book Series

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox")); //inspect All 
		
		Select selectDD = new Select(searchDropDown); //located  searchDropDown
		
		List <WebElement>  ddOptions = selectDD.getOptions();
		//loop through each options 
		for(WebElement option : ddOptions) {
			String optionText = option.getText();
			System.out.println(optionText);
		}
		
		// select books from the search dropdown
		selectDD.selectByVisibleText("Books");
		
		WebElement searchTextbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox")); //search box is inspection
		searchTextbox.sendKeys("Harry Potter");
		WebElement searchButton = driver.findElement(By.xpath("//input[@type= 'submit'][@class= 'nav-input']"));
		searchButton.click(); //click on the searchbox
		
		List<WebElement> bookSeriesCheckBoxes= driver.findElements(By.className("a-spacing-micro")); //burda birsuru checkbox var 
		
		for(WebElement  bookSeriesCheckBox : bookSeriesCheckBoxes) {
			String checkboxText = bookSeriesCheckBox.getText();
			if(checkboxText.equals("Unofficial Cookbook") && !bookSeriesCheckBox .isSelected()) {
				
				Thread.sleep(2000);  //Before it clicks it is good to have wait time to see it 
				bookSeriesCheckBox.click();     //clisk the Unoffical cookbook box and break
				break;
			}
		}
		
		
		
		
		

	}

}
