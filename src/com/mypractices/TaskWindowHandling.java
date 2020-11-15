package com.mypractices;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class TaskWindowHandling extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
	
		//TC 1: Windows Handling 


		
		setUp();
		driver.findElement(By.linkText("Alerts & Modals")).click();
		driver.findElement(By.linkText("Window Popup Modal")).click();
		
		String mainPageHandle = driver.getWindowHandle(); //Ana sayfanin handle i kayedildi
		
		System.out.println(mainPageHandle);
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		
		Set <String>  handles=  driver.getWindowHandles();
		
//		int i =1;
//		for(String handle:handles) {
//			System.out.println("Window "+i+":"+handle);
//			i++;
//		}
		
		
		//2nd way with using iterator
		Iterator<String> handleIt = handles.iterator();
	    String window1 = handleIt.next();
	    String window2 = handleIt.next();
		
	    driver.switchTo().window(window2); //main windowdan , window 2 ya gegis
	    
	    String expTitle = "Syntax Technologies @syntaxtech)Instagram photos and videos";
	    
		String actTitle =driver.getTitle();
		
		System.out.println(actTitle);
		
		if(expTitle.contentEquals(actTitle)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test fail");
		}
		
		Thread.sleep(3000);
		
		tearDown();
		
	}

}
