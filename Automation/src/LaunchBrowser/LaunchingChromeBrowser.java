package LaunchBrowser;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingChromeBrowser 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter 1.Chrome 2.Firefox 3.Edge"); 
		
		int a =sc.nextInt();
		switch(a)
		{
			case 1: 
			{
				ChromeDriver driver = new ChromeDriver(); // Launching chrome browser to check if Se is working properly or not
			}
			break;
			case 2:
			{
				FirefoxDriver driver = new FirefoxDriver();
			}
			break;
			case 3:
			{
				EdgeDriver driver = new EdgeDriver();
			
			}
			break;
			default:
			{
				System.out.println("Invalid");
			}
		}
		
		
		
	}

}
