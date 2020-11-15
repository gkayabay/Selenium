package com.mypractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeysActions  extends BaseClass {

	public static void main(String[] args) {

		setUp();
		
		WebElement userN = driver.findElement(By.id("txtUsername"));
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.SHIFT).click(userN).sendKeys("hello").perform();
		password.sendKeys("merhaba", Keys.SHIFT); //How o use keyyboards methods: Action class in icin de birsuru keyboard metodlari var onalri kullanirim. 
		
		
		

	}

}
