package seleniumBasics;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardOperation1 {
	
	// MouseKeyboardOperation -> use Action class

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("https://www.spicejet.com/");
		
		// object of action class
		Actions action = new Actions(driver);
		WebElement LoginLink = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		
		action.moveToElement(LoginLink).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("SpiceClub Members"))).build().perform();
		
		action.moveToElement(driver.findElement(By.linkText("Sign up"))).click().build().perform();
		
		System.out.println(driver.getTitle());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();

	}

}
