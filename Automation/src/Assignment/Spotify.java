package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://open.spotify.com/");
		
		driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 gugdZL encore-inverted-light-set']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("subhambanerjee.work@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Alliswell@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='Text__TextElement-sc-if376j-0 hMjkY encore-text-body-medium-bold sc-jSUZER sc-gKPRtg hJfyeq hgatVV']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='LegacyChipInner__ChipInnerComponent-sc-1qguixk-0 ezAFoO encore-inverted-light-set']")).click();
		
		
		
		
		
		
	}

}
