package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_movecursorto {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=bing_cpc&utm_campaign=dms_bing_Brand_BMM_Desktop&utm_source=bing&msclkid=616b839e389e19a9d071e570a564d3ac&utm_term=.myntra&utm_content=Myntra_Generic");
		
		Thread.sleep(2000);
		WebElement opt = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(opt).perform();
		
		driver.findElement(By.xpath("//a[@class='desktop-categoryLink' and @data-reactid='31']")).click();

	
	}

}
