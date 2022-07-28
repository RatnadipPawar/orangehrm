package com.orangeHRM;

import java.util.Map;

import pom.OrangeHRM.pages.LoginPage;

public class AddEmpTestCase extends Baseclass  {

	public static void main(String[] args) throws Exception {
	
		launchBrowser("chrome");
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
        LoginPage loginPage=new LoginPage();
        EmpListPage emplistpage=new EmpListPage();
        emplistpage.Login("Admin", "admin123");     
       Map<String,Object> empdetails=emplistpage.addEmp("Ratan", "deep", "pawar", false, null, null);
      emplistpage.searchEmp(empdetails);
	}
}
