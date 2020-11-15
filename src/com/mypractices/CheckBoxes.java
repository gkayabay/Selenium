package com.mypractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class CheckBoxes extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/basic-checkbox-demo.html");
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class = cb-element']"));
		
		for(WebElement list: checkboxes) {
			list.click();
			Thread.sleep(2000);
		}
		
		
		

	}

}
