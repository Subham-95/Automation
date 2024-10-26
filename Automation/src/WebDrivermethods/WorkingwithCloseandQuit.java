package WebDrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCloseandQuit 
{
	public static void main(String [] args)
	{
	WebDriver driver = new ChromeDriver();//to launch browser
	driver.manage().window().maximize();//to maximise the app to be launched
	driver.get("https://omayo.blogspot.com/");//to launch application
	
	//clicking an open popup
	driver.findElement(By.linkText("Open a popup window")).click();
	
	//close()
	//driver.close();
	
	//quit()
	driver.quit();
	}

}
