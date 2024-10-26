package WebElementMethods;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetSize_GetLocation {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		WebElement search = driver.findElement(By.name("q"));
		
		Dimension size = search.getSize();
		System.out.println(size);
		Point location = search.getLocation();
		System.out.println(location);
		
		org.openqa.selenium.Rectangle r = search.getRect();
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		

	}

}
