package WebElementMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.swiggy.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='restaurants curated for samosa']"))));
		
		
		//Explicit typecasting
		TakesScreenshot t = (TakesScreenshot)driver;
		
		//use getScreenshotAs()
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("./Screenshot/swiggy.png");
		
		Files.copy(src, dst);
		
		//Single ss
		
		WebElement samosa = driver.findElement(By.xpath("//img[@alt='restaurants curated for samosa']"));
		File src1 = samosa.getScreenshotAs(OutputType.FILE);
		
		File dst1 = new File("./Screenshot/samosa.png");
		
		Files.copy(src1, dst1);
		
		

	
	}


}
