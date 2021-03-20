package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardOperation2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		WebElement userNameTxtField = driver.findElement(By.name("userName"));
		
		userNameTxtField.sendKeys("test123");
		
		Actions action = new Actions(driver);
		
		Thread.sleep(5000);
		action.moveToElement(userNameTxtField).doubleClick().build().perform();
		Thread.sleep(5000);
		userNameTxtField.sendKeys(Keys.DELETE);
//		action.keyDown(Keys.DELETE).build().perform(); // IllegalArgumentException: Key Down / Up events only make sense for modifier keys.
//		action.keyUp(Keys.DELETE).build().perform();
//		action.release().build().perform();

	}

}
