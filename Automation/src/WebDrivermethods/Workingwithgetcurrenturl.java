package WebDrivermethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithgetcurrenturl 
{
		public static void main(String [] args)
		{
			WebDriver driver = new ChromeDriver();//to launch browser
			driver.manage().window().maximize();//to maximise the app to be launched
			driver.get("https://www.youtube.com/");//to launch application
			
			
			//to fetch URL
			String actual_URL = driver.getCurrentUrl();
			System.out.println("URL is: "+actual_URL);
			String expected_URL ="https://www.youtube.com/?themeRefresh=1";
			if(actual_URL.equals(expected_URL))
				System.out.println("Equal");
			else
				System.out.println("Not equal");
			
		}

	


}
