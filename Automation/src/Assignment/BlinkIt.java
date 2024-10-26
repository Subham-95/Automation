package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.tracing.Tracing.RequestMemoryDumpResponse;

public class BlinkIt {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://blinkit.com/");
		WebElement s=driver.findElement(By.xpath("//button[@class='btn location-box mask-button']"));
		s.click();
		
		
		WebElement item = driver.findElement(By.xpath("//img[@alt='2 - Dairy, Bread & Eggs']"));
		item.click();
		
		WebElement milk = driver.findElement(By.xpath("//img[@alt='Amul Gold Milk']"));
		milk.click();
		
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.xpath("//div[@class='AddToCart__UpdatedButtonContainer-sc-17ig0e3-0 lmopxc']"));
		select.click();
		
		for(int i=1;i<=7;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 dtDpfZ']")).click();
		}
		
		WebElement cart = driver.findElement(By.xpath("//div[@class='CartButton__Button-sc-1fuy2nj-5 joEvaa']"));
		cart.click();
		
		for(int i=1;i<=7;i++)
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[@class='AddToCart__AddMinusIcon-sc-17ig0e3-9 einkXt'])[2]")).click();
		}
		
		WebElement login = driver.findElement(By.xpath("//div[@class='CheckoutStrip__TitleText-sc-1fzbdhy-9 CheckoutStrip__CTAText-sc-1fzbdhy-13 bSZmbn hOjela']"));
		login.click();
		
		WebElement num = driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']"));
		num.sendKeys("888888888888888");
		

	}

}
