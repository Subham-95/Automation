package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingLeftRight {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dashboards.handmadeinteractive.com/jasonLove/");
		
		
		JavascriptExecutor j = (JavascriptExecutor) driver;

		for(int i=0;i<3;i++)
		{
			j.executeScript("window.scrollBy(1000,0)");
			Thread.sleep(2000);
		}

		for(int i=0;i<3;i++)
		{
			j.executeScript("window.scrollBy(-1000,0)");
			Thread.sleep(2000);
		}
		
		
		
		

	}

}
