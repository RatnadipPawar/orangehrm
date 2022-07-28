package com.orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

//parent class created
public class Baseclass
{
	//globally variable declared(webDriver....class name)
	public static WebDriver driver;

	//Launch browser non static method created......browser name stored
	public static void launchBrowser(String browserName) {

		//pass browsername parameter in switch
		switch(browserName) {
		//case for chrome browser
		case "chrome" :
			System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			//case for firefox browser
		case "mozilla":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			//case for edge browser	
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			//case for default browser
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
	}
   
    public void Login(String userName,String password)
    
    { driver.findElement(By.id("txtUsername")).sendKeys(userName);
   
    driver.findElement(By.id("txtPassword")).sendKeys(password);
    
    driver.findElement(By.id("btnLogin")).click();
    }
}	
		
		
		
		
		
	







