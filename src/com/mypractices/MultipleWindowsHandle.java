package com.mypractices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;
public class MultipleWindowsHandle extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Window Popup Modal")).click();
		
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		Set<String> handles = driver.getWindowHandles();//Multiples windows icin
		
		Iterator<String> handleIt = handles.iterator();
		
		String mainWindow = handleIt.next(); // for Main window (en alttaki window)
		
		String popup1= handleIt.next();
		
		String popup2= handleIt.next();
		
		String mainTitle = driver.getTitle(); //main sayfanin title icin
		
		driver.switchTo().window(popup1);   //dikkati window popup1 a gecmek icin
		
		String popup1Title = driver.getTitle(); //popup1 windowun title i
		

		driver.switchTo().window(popup2);   //dikkati window popup2 a gecmek icin
		
		String popup2Title = driver.getTitle();  //popup2 ttitle i
		
		 Thread.sleep(3000);
		 
		 tearDown();
		 
		
		
		

	}

}
