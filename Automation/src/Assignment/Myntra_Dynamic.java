package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Dynamic {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/shop/men");
		
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Jeans",Keys.ENTER);
		
		WebElement p = driver.findElement(By.xpath("(//h3[text()='Marks & Spencer']/ancestor::div[@class='product-productMetaInfo']/descendant::span[@class='product-discountedPrice'])[1]"));
		System.out.println("The price of jeans is: "+p.getText());
	}

}
