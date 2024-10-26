package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_isEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement s = driver.findElement(By.name("username"));
		
		if(s.isEnabled())
		{
			s.sendKeys("Admin");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		WebElement logo = driver.findElement(By.cssSelector("img[alt='orangehrm-logo']"));
		
		if(logo.isDisplayed())
		{
			System.out.println("Is displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
		
	}

}
