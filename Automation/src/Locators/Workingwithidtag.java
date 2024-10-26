package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithidtag 
{
	public static void main(String [] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Identify email text field
		WebElement emailTextField = driver.findElement(By.id("email"));
		emailTextField.sendKeys("8595805017");
		
		//Identify password text field
		driver.findElement(By.name("pass")).sendKeys("Subham@123");
		
		//Identify the login button
		driver.findElement(By.className("_4jy1")).click();
		
		
	}

}
