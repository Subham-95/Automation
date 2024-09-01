package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm 
{
	public static void main(String [] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		driver.findElement(By.id("srcCode")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='Dr08x']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("text-box")).sendKeys("Mumbai");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='_6lfK8'])[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("destCode")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='Dr08x']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("text-box")).sendKeys("Kolkata");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_6lfK8'])[1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("departureDate")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='calendar__day'][1]")).click();
		//Thread.sleep(1000);
		driver.findElement(By.id("numPax")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("(//p[@role='button'])[4]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("flightSearch")).click();

		
	}

}
