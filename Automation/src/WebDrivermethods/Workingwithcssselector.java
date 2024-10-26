package WebDrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithcssselector {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		WebElement p =driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		p.sendKeys("8595805017");
		Thread.sleep(2000);
		WebElement s =driver.findElement(By.cssSelector("input[placeholder='Password']"));
		s.sendKeys("Subham@123");
		Thread.sleep(2000);
		WebElement q =driver.findElement(By.cssSelector("button[name='login']"));
		q.click();
		//driver.findElement(By.name("login")).click();
	}

}
