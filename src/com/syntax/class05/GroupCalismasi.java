package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class GroupCalismasi  extends BaseClass {

	public static void main(String[] args) {
		setUp();
		WebElement from = driver.findElement(By.xpath(" //input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		WebElement to= driver.findElement(By.xpath("(//input[ @name='searchEntry' ] )[1]"));
		from.click();
		from.sendKeys("MIA");

	}

}
