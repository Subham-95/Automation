package javaScriptExecutor;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingtoparticularElement {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zomato.com");
		
		WebElement s = driver.findElement(By.xpath("//img[@alt='Zomato logo']"));
		Rectangle r = s.getRect();
		int x = r.getX();	
		int y = r.getY();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")");

		//OR
		
		//WebElement s = driver.findElement(By.xpath("//img[@alt='Zomato logo']"));
		//JavascriptExecutor j = (JavascriptExecutor) driver;
	//	j.executeScript("window.scrollBy("arguments[0].scrollIntoView(true/false)",s);

		

	}

}
