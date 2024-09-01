package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninInsta 
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		
	
		driver.findElement(By.className("_aad7")).click(); 	
		Thread.sleep(3000);
		
		driver.findElement(By.className("_acan")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("8595805017");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Subham@123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		
	}

}
