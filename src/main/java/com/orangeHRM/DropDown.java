package com.orangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Baseclass{

	public static void main(String[] args)  {
		
		launchBrowser("chrome");
		
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	DropDown drop=new DropDown();
	
	drop.Login("Admin", "admin123");
	 
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	
	driver.findElement(By.id("empsearch_employee_status")).click();
	
	WebElement empStatus=driver.findElement(By.id("empsearch_employee_status"));
	
	Select select=new Select(empStatus);
	
	//select.selectByIndex(1);
	
	select.selectByVisibleText("Freelance");
	
	//selectByValue("2");
	
	//deselect operation will be never perform without text Box
	
	//select.deselectAll();
	
	//select.deselectByIndex(2);
	
	//select.deselectByValue(value of the attribute );
	
	//select.deselectByVisibleText(value of the text );
	
	List<WebElement> allDropDownvalues = select.getAllSelectedOptions();
	 
    for(WebElement abc:allDropDownvalues)
    {
    	System.out.println(abc.getText());	
    }
	
	List<WebElement> allDropDownOptions=select.getOptions();
	
	for (WebElement xyz:allDropDownOptions)
	{System.out.println(xyz.getText());
	
	}
	
	
	
	
	}

}
