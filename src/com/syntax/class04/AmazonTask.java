package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTask {
	//TC 1: Amazon link count: 
	//	Open chrome browser
	//	Go to “https://www.amazon.com/”
	//	Get all links
	//	Get number of links that has text
	//	Print to console only the links that has text

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//give me the links on the website a is a a tag(Link)
		
		System.out.println("Size of all Links on Amazon:: "+allLinks.size());
		
		System.out.println(allLinks.size());
		
		int count = 0;
		
		for(WebElement link: allLinks) {
			String text = link.getText();//getText ile inner textleri gormek icin kullanilir
			
			if(!text.isEmpty()) {
				System.out.println(text);
				count++;
			}
		}
		System.out.println("Total number of links with text is: "+count);
		driver.quit();
		

	}

}
