package com.orangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends Baseclass{

	public static void main(String[] args) {
		
		launchBrowser("chrome");
		
		driver.get("https://realestateautomation.agilecrm.com/login");
		
		driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Test1234");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
       WebElement signInButton= driver.findElement(By.xpath("//input[@value='Sign In']"));
        
       JavascriptExecutor js=(JavascriptExecutor)driver;
       
       js.executeScript("arguments[0].click();",signInButton);
       //1 Apporach reguler method
      // System.out.println(driver.getCurrentUrl());
       //2 Approch using JSE method get current Domain
       System.out.println(js.executeScript("return document.domain;" ));
       
     // using JSE method get current URL
       System.out.println(js.executeScript("return document.URL;" ));
       //Apply wait by using any element on current page id
       Util.waitForElementToClick(By.id("add-portlet"));
       //Perform scrolldown operation by using jse interface
      js.executeScript("window.scrollBy(0,1000);");
    
       Util.waitForElementToClick(By.id("add-portlet"));
       js.executeScript("window.scrollBy(0,-1000);");
       
       driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/a/span/img")).click();
       
       driver.findElement(By.xpath("//*[@id=\"fatMenuModal\"]/div[2]/div/div/div/div[3]/div/a ")).click();
       
       
       
       //js.executeScript("window.scrollTo(0, document.body.scrollHeight)",signInButton);
       
       
       
       
       
       
       
       
       
       
        
        
	}

}
