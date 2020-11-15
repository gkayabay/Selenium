package com.syntax.hw;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.ConfigsReader;

public class HW2ndway {

//	TC 4: Radio Buttons Practice  
//	Open chrome browser
//	Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//	Click on “Input Forms” links
//	Click on “Radio Buttons Demo” links
//	Click on any radio button in “Radio Button Demo” section.
//	Verify correct radio is clicked
//	Click on any radio button in “Group Radio Buttons Demo” section.
//	Verify correct checkbox is clicked
//	Quit browser
//	 

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
	
		setUp();
		driver.findElement(By.xpath("//[@class= 'dropdown-toggle']")).click();
		driver.findElement(By.xpath("//[@contains(text(), 'Radio Buttons Demo']")).click();

		List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type=radio']"));

		for (WebElement radioButton : allRadioButtons) {

			if (radioButton.isEnabled()) {
				String value = radioButton.getAttribute("value");
				if (value.equalsIgnoreCase(ConfigsReader.getProperty("genderSelected"))) {
					radioButton.click();
					System.out.println("Correct radio is checked");
				}
				if (value.equalsIgnoreCase(ConfigsReader.getProperty("ageSelected"))) {
					radioButton.click();
					System.out.println("Correct radio is checked");
					break;
				}

			}

		}
	}
}
	
