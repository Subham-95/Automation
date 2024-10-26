package Assignment;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InspectElementByKeyboard {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://dribbble.com/tags/login-page");
	
		Actions click = new Actions(driver);
		
		click.contextClick().perform();
		
		Robot s = new Robot();
		
		for(int i=0;i<11;i++)
		{
			s.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
		}
		

		s.keyPress(KeyEvent.VK_ENTER);


	}

}
