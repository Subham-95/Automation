package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import WebElementMethods.TakingScreenshot;
import WebElementMethods.UsingGetSize_GetLocation;

public class Practise_SS {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.get("https://www.myntra.com/?utm_source=dms_bing&utm_medium=dms_bing_cpc&utm_campaign=dms_bing_Brand_BMM_Desktop&utm_adgroup=Myntra_Generic&keyword=myntra%20%5C&matchtype=e&utm_source=bing&msclkid=0f45d68119e511909700b0787e385b84&utm_term=myntra%20%5C&utm_content=Myntra_Generic");
		//Thread.sleep(5000);
		
		//TakesScreenshot t = (TakesScreenshot) driver;
		
        //File src1 = ((TakesScreenshot) t).getScreenshotAs(OutputType.FILE);
		//File dst1 = new File("./Screenshot/flip.png");
		//Files.copy(src1, dst1);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;

		//for(int i=0;i<3;i++)
		//{
		//	j.executeScript("window.scrollBy(0,1000)");
		//	Thread.sleep(2000);
		//}
		//for(int i=0;i<3;i++)
	//	{
		//	j.executeScript("window.scrollBy(0,-1000)");
		//	Thread.sleep(2000);
		//}

		WebElement size = driver.findElement(By.xpath("//div[text()=' KEEP IN TOUCH ']"));
		org.openqa.selenium.Rectangle r = size.getRect();
		
		int x=r.getX();
		int y=r.getY();
		System.out.println(x);
		System.out.println(y);
		
		j.executeScript("window.scrollBy("+x+","+y+")");
	}

}
