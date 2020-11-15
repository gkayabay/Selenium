package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	

		setUp();  //please uncomment uitestpractice.com.url.
		String text = driver.findElement(By.xpath("//h3[text() = 'click on the below link: ']")).getText();
		System.out.println(text);
		
		/*
		 * We can switcht to a frame using 3 different methods
		 *1.By Index
		 *2.By Name or ID
		 *3.By WebElement
		 *
		 */
	
		//BY Index
		driver.switchTo().frame(0); //swithch to frame first by index 0 bexcause bu framein index i 0 dur
		
		WebElement name = driver.findElement(By.id("name")); //send the keys
		name.sendKeys("Vital");
		driver.switchTo().defaultContent(); //switch back to main window/page/default content
		//to come to main frame. defaultContent = main window
		Thread.sleep(2000);
		
		
		//By NameOrID
		driver.switchTo().frame("iframe_a");//switch method is used to switch to a frame
		name.clear();
		name.sendKeys("Sarmed");
		driver.switchTo().defaultContent(); //switch back to main window/page/ or defaultContent
		
		
		//By WebElement
		WebElement firstFrame = driver.findElement(By.xpath("//iframe [@src='/Demo.html']")); //assign it to a WebElement
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Asel");
		driver.switchTo().defaultContent();
		
		
		
		Thread.sleep(30000);
		tearDown();
		
	}

}
