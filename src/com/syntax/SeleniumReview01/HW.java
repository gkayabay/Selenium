package com.syntax.SeleniumReview01;
import com.syntax.utils.BaseClass;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW extends BaseClass {

//	HW1   Go to facebook.com
//	Verify “Create a new account” is Displayed
//	Fill out First name, lastname, email, new password
//	Select your birthday from given dropdowns
//	Select gender
//	Click sign up
//	

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
	
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ali@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
				WebElement CreateaNewAccount = driver.findElement(By.partialLinkText("Create New Account"));
				System.out.println(" if Create a new Account is displayed " + CreateaNewAccount.isDisplayed());
				driver.navigate().back();
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ali");
				driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Aydin");
				driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("5208965478");
				driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("1453Istanbul");
				WebElement dobM = driver.findElement(By.xpath("//select[@id='month']"));
				Select selectM = new Select(dobM);
				List<WebElement> listM = selectM.getOptions();
				for (WebElement Mlist : listM) {
					String monthText = Mlist.getText();
					// System.out.println(monthText);
					if (monthText.equals("Jul")) {
						Mlist.click();
					}
					WebElement dobD = driver.findElement(By.xpath("//select[@id='day']"));
					Select selectD = new Select(dobD);
					Thread.sleep(2000);
					selectD.selectByIndex(10);
					WebElement dobY = driver.findElement(By.xpath("//select[@id='year']"));
					Select selectY = new Select(dobY);
					selectY.selectByValue("1996");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@id='u_0_6']")).click();
					driver.findElement(By.xpath("//button[@name='websubmit']")).click();
				}
			}
}
