package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithtagname 
{
	public static void main(String [] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		
		WebElement SearchtextField = driver.findElement(By.tagName("Input"));
		SearchtextField.sendKeys("books");
	}

}
