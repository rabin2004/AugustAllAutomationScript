package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationConcept {
	
	// Synchronization - (waits) -> letting automation script to wait for desired element to perform some action
	// 3 types: -> Static wait => Thread.sleep(4000); - pause the java execution
		// 1. Implicit wait - global wait (define once, applicable for all the elements, once found will perform action doesn't wait for full duration) -> implicitlyWait()
		// 2. Explicit wait - not a global wait, will be defined for specific element, once found will perform action doesn't wait for full duration -> WebDriverWait class
		// 3. Fluent wait - manipulate frequency of searching element (polling)

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		
		driver.get("http://amazon.com");
		
		// 10 secs
		driver.findElement(By.linkText("Careers")).click(); // NoSuchElementFoundExecption
		
		// 25 secs
//		driver.findElement(By.linkText("Careers2")).click();
		
		// 100 elements -> 30 seconds (25 seconds)
		// some elements -> 1 - 50 second, 2 - 150 second
		
		// explicit wait
		WebDriverWait explicitWait = new WebDriverWait(driver, 120);
		WebElement amazonPrimeVideo = driver.findElement(By.name("Amazon Video"));
		
		explicitWait.until(ExpectedConditions.elementToBeClickable(amazonPrimeVideo)).click();
		explicitWait.until(ExpectedConditions.elementToBeSelected(By.name("Amazon Video")));
		amazonPrimeVideo.click();
		
		explicitWait.until(ExpectedConditions.presenceOfElementLocated(By.name("Amazon Video"))).click();
		
		
		
		System.out.println(driver.getTitle());
		
//		driver.close();

	}

}
