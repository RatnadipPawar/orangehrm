package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestCasePim {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		//Launch the browser
	WebDriver driver=new ChromeDriver();
	//window maximize
	driver.manage().window().maximize();
   //Enter orange HRM url
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
   WebElement username= driver.findElement(By.id("txtUsername"));
   WebElement password=driver.findElement(By.id("txtPassword"));
   WebElement login=driver.findElement(By.id("btnLogin"));
	//Login with invalid username&valid password
   username.sendKeys("cyber");
	password.sendKeys("admin123");
	login.click();
	//Login with valid username&invvalid password
	
    username.sendKeys("Admin");
	password.sendKeys("Success123");
    login.click();
	

	
	//Login With valid username&password
	  username.sendKeys("Admin");
	  password.sendKeys("admin123");
	    //Click on login button
	  login.click();
	  
	//Click on pim module
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	driver.findElement(By.id("btnAdd")).click(); 
	String firstName="Ratna";
	String lastName="Deep";
	
	driver.findElement(By.id("firstName")).sendKeys(firstName);
	driver.findElement(By.id("lastName")).sendKeys(lastName);
	driver.findElement(By.id("employeeId")).sendKeys("0285");
	driver.findElement(By.id("btnSave")).click();
	

	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	
	driver.findElement(By.id("empsearch_id")).sendKeys("0285");
	
	
	//locate search button & click on the same
	driver.findElement(By.id("searchBtn")).click();
	
	driver.findElement(By.id("ohrmList_chkSelectRecord_64")).click();
	
	driver.findElement(By.id("btnDelete")).click();
	
	driver.findElement(By.id("dialogDeleteBtn")).click();


	}

}
