package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationXML {
	
	// Parameterization in TestNG =>   1. config.properties(not just for TestNG)
									// 2. @DataProvider
									// 3. @Parameter(using xml)
	
	// Parameter in xml => <parameter name="url" value="http://demo.guru99.com/test/newtours/index.php"/>
	// In TestNG class => @Parameters({"key/name"})
	// If parameters being used from xml file => then test needs to be executed from XML file 

WebDriver driver;
	
	@BeforeMethod
	@Parameters({"url"})
	public void launchBrowser(String URL) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
	
	
	@Test 
	public void positiveSignFunctionality() {
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td")).isDisplayed());
	}
}
