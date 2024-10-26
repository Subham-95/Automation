package WebDrivermethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithgettitle
{
		public static void main(String [] args)
		{
			WebDriver driver = new ChromeDriver();//to launch browser
			driver.manage().window().maximize();//to maximise the app to be launched
			driver.get("https://www.youtube.com/");//to launch application
			
			//To fetch title
			String title = driver.getTitle();
			System.out.println("Title is: "+title);
			String actual_title ="YouTube";
			if(title.equals(actual_title))
				System.out.println("Equal");
			else
				System.out.println("Not equal");
			
		}

}



