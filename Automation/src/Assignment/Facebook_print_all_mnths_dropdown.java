package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_print_all_mnths_dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement s = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		s.click();
		
		Select p = new Select(driver.findElement(By.id("month")));
		
	    List<WebElement> options = p.getOptions();
	    
	    for(WebElement opt: options)
	    {
	    	System.out.println(opt.getText());
	    }
		

	}

}
