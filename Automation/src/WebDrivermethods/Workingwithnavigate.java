package WebDrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithnavigate
{
	public static void main(String [] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();//to launch browser
		driver.manage().window().maximize();//to maximise the app to be launched
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.swiggy.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
	}

}
