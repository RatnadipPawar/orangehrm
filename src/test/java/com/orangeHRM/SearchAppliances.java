package com.orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchAppliances extends Baseclass {

	public static void main(String[] args) {
	
		launchBrowser("chrome");    
		
		//nevigate website
		driver.get("https://www.amazon.in/");
		
		WebElement serchDropdown= driver.findElement(By.id("searchDropdownBox"));
		
        Select s1=new Select(serchDropdown);
        
        s1.selectByVisibleText("Shoes & Handbags");
        
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");

	    driver.findElement(By.id("nav-search-submit-button")).click();
	    
	  List<WebElement> result=driver.findElements(By.xpath("//div[@id=\"a-popover-sp-info-popover-B09C3YM7KW\"]/following::span[2]")); 
	
	for(WebElement ee: result)
		
	{String name=ee.getText();
	
	System.out.println(name);
	
	}
	  
	  
	  
	}

}  
