package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsinggetCssValue {


		
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
			String details = logo.getCssValue("color");
			System.out.println(details);
			
			System.out.println(logo.getAttribute("alt"));
			
			

		}

}
