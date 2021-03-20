package seleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class TakeScreenShotConcept {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://demo.guru99.com/test/newtours/index.php");

		driver.findElement(By.name("userName")).sendKeys("test123");
		
		// taking screen
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\User\\Desktop\\eclipse\\Aug2ndBatch\\src\\seleniumBasics\\demoTours.png"));
		
		driver.close();
	}

}
