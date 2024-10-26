package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_Birthdate {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement s = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		s.click();
		
		Thread.sleep(2000);
		//WebElement dropdown = driver.findElement(By.id("day"));
		Select drop = new Select(driver.findElement(By.id("day")));
		
		drop.selectByIndex(29);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		
		m.selectByValue("10");
		Thread.sleep(2000);
		WebElement yr = driver.findElement(By.id("year"));
		Select year = new Select(yr);
		year.selectByVisibleText("1995");
		
		
		

	}

}
