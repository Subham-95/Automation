package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClearMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
	WebElement s= driver.findElement(By.id("small-searchterms"));
	s.sendKeys("Books");
	Thread.sleep(2000);
	s.clear();
	Thread.sleep(2000);
	s.sendKeys("Computers");
		
		

	}

}
