package com.orangeHRM;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmpListPage  extends Baseclass{
	
	
	public Map<String,Object> addEmp(String fName, String mName, String lName, boolean isUser, String uName, String pwd){
     Map<String,Object> empDetails=new HashMap<>();
	 driver.findElement(By.id("menu_pim_viewPimModule")).click();   
	 driver.findElement(By.id("btnAdd")).click();
	 driver.findElement(By.id("firstName")).sendKeys(fName);
	 driver.findElement(By.id("middleName")).sendKeys(mName);
	 driver.findElement(By.id("lastName")).sendKeys(lName);
	String empId= driver.findElement(By.id("employeeId")).getAttribute("value");
     empDetails.put("empId",empId);
     empDetails.put("firstName",fName );
     empDetails.put("middName",mName );
     empDetails.put("lastName",lName );
     if(isUser) {
    	 driver.findElement(By.id("chkLogin")).click();
	 driver.findElement(By.id("user_name")).sendKeys(uName);
	 driver.findElement(By.id("user_password")).sendKeys(pwd);
	 driver.findElement(By.id("re_password")).sendKeys(pwd);
	}
     
       driver.findElement(By.id("btnSave")).click();
	 return empDetails;
	 
}
	public void searchEmp(Map<String,Object> empDetails) throws Exception {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empDetails.get("empId").toString());
		driver.findElement(By.id("searchBtn")).click();
		WebElement searchResult=driver.findElement(By.xpath("//tr[@class='odd']/td[2]/a"));
		Util.waitForElementToVisible(searchResult);
		Util.validate(searchResult.getText(), empDetails.get("empId").toString());
	
	}
}

