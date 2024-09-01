package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_dynamic_findelements {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Laptops",Keys.ENTER);
		
		List<WebElement> pro = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> val = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		for(int i=0;i<pro.size();i++)
		{
			for(int j =i;j<=i;j++)
			{
				
				System.out.println(pro.get(i).getText()+"========>>>"+val.get(j).getText());
				
			}
			
		}
		
		

	}

}
