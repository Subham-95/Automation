package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato 
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		
		
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.cssSelector("input[placeholder='Search for restaurant, cuisine or a dish']"));
		s.sendKeys("Biriyani");
		Thread.sleep(2000);
		s.click();
		
		Thread.sleep(2000);
		WebElement p = driver.findElement(By.cssSelector("p[class='sc-1hez2tp-0 sc-bLJvFH isBcSC']"));
		p.click();
		
	}

}
