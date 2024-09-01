package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistara 
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?utm_source=bing&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=:G:s&s_kwcid=AL!596!3!!e!!o!!air%20vistara%20booking&s_kwcid=AL!596!3!!e!!o!!air%20vistara%20booking&msclkid=90d08b0bd32c154d1803eda4b5d02e29&utm_term=air%20vistara%20booking&utm_content=Brand");
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='trip-details'])[2]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("Delhi");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("Kolkata");
		Thread.sleep(2000);
		driver.findElement(By.id("ui-id-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-date='5']")).click();
		
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.id("adds_adult")).click();
		}
		
		Thread.sleep(2000);
		for(int i=1;i<=2;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.id("adds_child")).click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='premium-economy']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("book-flight-widget")).click();
		
	
	}

}
