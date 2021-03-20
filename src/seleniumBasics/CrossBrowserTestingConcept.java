package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTestingConcept {

	public static void main(String[] args) {
		// Selenium Suite - Selenium RC, Selenium IDE, Selenium WebDriver & Selenium Grid 
		// Environment where application will be accessed -> Browser/OS/Devices => Cross browser/Multi-platform testing
		// Cross browser testing -> testing application in various browsers (Chrome, IE, FF, Safari)
		
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
//		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebDriver driver;
		String browserName = "Safari";
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://amazon.com");
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("http://amazon.com");
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://amazon.com");
		}
		else {
			System.out.println("No driver found");
		}
			
	}

}
