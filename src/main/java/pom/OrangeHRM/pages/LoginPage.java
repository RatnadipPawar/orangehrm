package pom.OrangeHRM.pages;

import org.openqa.selenium.By;

import com.orangeHRM.Baseclass;

public class LoginPage extends Baseclass {

	public void login(String username,String password) {
		//locate userName text field
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		
		//locate userName Feild and enter username in username textfield
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		//locate password field and enter password in password textbox 
		driver.findElement(By.id("btnLogin")).click();
		
	}
	public void logout() {
		  
	}
}
