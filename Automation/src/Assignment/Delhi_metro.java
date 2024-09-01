package Assignment;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delhi_metro {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://delhimetrorail.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("buttonDismiss1")).click();
		driver.findElement(By.id("FromStation")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='line-stataion-show'])[2]/ancestor::div[@class='popup-result-location yellow']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//font[text()='ROHINI SECTOR - 18, 19']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ToStation")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='line-stataion-show']/ancestor::div[@class='popup-result-location red']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//font[text()='MOHAN NAGAR']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Show Route & Fare']")).click();
		
	    List<WebElement> p =driver.findElements(By.xpath("//p[text()='Total Network Length (km)']/ancestor::div[@class='counter']"));
		
	   for(int i=0;i<p.size();i++)
	   {
		   
		   System.out.println(p.get(i).getText()+"===============");
	   }
		
	}

}
