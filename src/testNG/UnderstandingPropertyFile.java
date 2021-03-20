package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UnderstandingPropertyFile {
	
	// Properties class => bring global variable data from config.properties file
	
WebDriver driver;
Properties prop;
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		
		// Connecting config.properties file
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\User\\Desktop\\eclipse\\Aug2ndBatch\\src\\testNG\\config.properties");
		prop.load(file);
			
		System.setProperty(prop.getProperty("chromeDriverKey"), prop.getProperty("chromeDriverPath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
	

	@Test 
	public void positiveSignFunctionality() {
		driver.findElement(By.name("userName")).sendKeys(prop.getProperty("validUserName"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td")).isDisplayed());
	}
	
	@Test
	public void negativeSignFunctionality() {
		driver.findElement(By.name("userName")).sendKeys(prop.getProperty("invalidUserName"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("invalidPassword"));
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//td[@width='112']/span")).isDisplayed());
	}

}
