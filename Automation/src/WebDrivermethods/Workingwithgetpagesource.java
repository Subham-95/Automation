package WebDrivermethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Workingwithgetpagesource 
{

	public static void main(String [] args)
	{
			WebDriver driver = new ChromeDriver();//to launch browser
			driver.manage().window().maximize();//to maximise the app to be launched
			driver.get("https://www.youtube.com/");//to launch application
			
			
			
			//to get PageSource code
			System.out.println(driver.getPageSource());
	}

	


}
