package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninFB 
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.className("_6lti")).click(); 
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.name("firstname"));
		search.sendKeys("Subham");
		Thread.sleep(1000);
		WebElement last = driver.findElement(By.name("lastname"));
		last.sendKeys("Banerjee");
		Thread.sleep(1000);
		WebElement mail = driver.findElement(By.name("reg_email__"));
		mail.sendKeys("8595805017");
		Thread.sleep(1000);
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("Subham@123");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
	}

}
