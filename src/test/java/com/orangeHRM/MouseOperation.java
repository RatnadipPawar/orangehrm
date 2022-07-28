package com.orangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation extends Baseclass {

	public static void main(String[] args) throws AWTException {
		
		launchBrowser("chrome");
        
		driver.get("https://www.amazon.in/");
		
	WebElement bestseller=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));	
	
	Actions act=new Actions(driver);
	//right click where mouse
	//act.contextClick().build().perform();
   //right click choose web element
	act.contextClick(bestseller).build().perform();
	
	//act.keyDown(Keys.ARROW_DOWN).build().perform();
	
	Robot robot=new Robot();
	
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	String parentTabId=driver.getWindowHandle();
	System.out.println(parentTabId);
	Set<String> windowId=driver.getWindowHandles();
	System.out.println(windowId);
	//String childTabId=driver.getWindowHandle();
	//System.out.println(childTabId);
	//System.out.println(driver.getTitle());
	
	
	
	

	}

}
