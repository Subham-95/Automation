package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingisSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		
		Thread.sleep(2000);
		
		WebElement box = driver.findElement(By.id("domain1"));
		box.click();
		
		if(box.isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
	}

}
