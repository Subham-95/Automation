package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_my_trip {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|M|DF|B|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|&s_kwcid=AL!1631!3!!e!!o!!makemytrip%3F&ef_id=:G:s&msclkid=0c47ef59a7ea10b9a24b898b4017095d");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("(//span[@class='headerIconTextAlignment chNavText darkGreyText'])[5]")).click();
		
		driver.findElement(By.id("fromCity")).click();
		
		driver.findElement(By.xpath("//span[text()='Kolkata Howrah Junction']/ancestor::div[@class='calc50']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
		
		driver.findElement(By.xpath("//span[text()='NDLS']")).click();
		
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']")).click();
		driver.findElement(By.xpath("//li[text()='Third AC']")).click();
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
		
	    List<WebElement> list = driver.findElements(By.xpath("//div[@class='train-name']"));
		
		for(WebElement train:list)
		{
			
			System.out.println(train.getText());
			System.out.println("====================");
		}
		
		
	}

}
