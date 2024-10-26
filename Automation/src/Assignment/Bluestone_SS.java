package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Bluestone_SS {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
		driver.get("https://www.bluestone.com/");
		WebElement s = driver.findElement(By.id("search_query_top_elastic_search"));
		s.click();
		Thread.sleep(2000);
		WebElement p = driver.findElement(By.id("search_query_top_elastic_search"));
		p.sendKeys("rings");
		
		Thread.sleep(2000);
		WebElement q = driver.findElement(By.xpath("//input[@value='Search']"));
		q.click();
		
		WebElement image = driver.findElement(By.xpath("(//img[@class='main-logo'])[1]"));
		File src1 = image.getScreenshotAs(OutputType.FILE);
		
		File dst1 = new File("./Screenshot/blue.png");
		
		Files.copy(src1, dst1);
		

	}

}
