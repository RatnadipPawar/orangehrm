package com.orangeHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class LoginTestcase extends Baseclass
{
	public static void main(String[] args) 
	{
		Baseclass.launchBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");


			try {
				//locate your forgot password with the with the help of partial linkdriver.findElement(null)

				driver.findElement(By.partialLinkText("Forgot your")).click();

				WebElement forgot=driver.findElement(By.id("securityAuthentication_userName"));

				forgot.sendKeys("test@test.com");

				WebElement button=driver.findElement(By.id("btnSearchValues"));
 
				button.click();
			}
			catch(StaleElementReferenceException | ElementNotVisibleException e) 
			{
				driver.navigate().refresh();
			}
		
	}
}