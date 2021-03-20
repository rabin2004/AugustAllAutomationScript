package testDummyPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Verification Vs Validation ???
	// Verification -> If-Else condition -> tell did test case passed or failed???
	// Validation -> Assertion -> not just checking condition -> tell pass/fail ???
	// Assertion -> 
		// 1. assertEquals() -> compare "expected result" vs "actual result"
		// 2. assertTrue() -> going check if output of the condition is true or not
		// 3. assertFalse() -> going check if output of the condition is false or not

	// Keywords -> 1. priority => help to manipulate test execution sequence
				// 2. enabled => false (test executing) / true (will execute)
				// 3. dependsOnMethods => create dependency between test cases

public class AssertionConcept {
	
WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
	
	// Sequence of Test case execution - Alphabetic order
	
	@Test (priority = 0)
	public void clickSignOnLink() {
		driver.findElement(By.linkText("SIGN-ON")).click();
		
		String ActualSignOnPageTitle = driver.getTitle();
		String ExpectedSignOnPageTitle = "Sign-on: Mercury Tours"; // from requirement docs (BRDs/FRDs)
		
		// validation point -> Assertions
		Assert.assertEquals(ExpectedSignOnPageTitle, ActualSignOnPageTitle);
	}
	
	@Test (priority = 1, enabled = false)
	public void clickRegisterLink() {
		driver.findElement(By.linkText("REGISTER")).click();
		String ActualRegisterPageTitle = driver.getTitle();
		String ExpectedRegisterPageTitle = "Register: Mercury Tours";
		
		Assert.assertEquals(ActualRegisterPageTitle, ExpectedRegisterPageTitle);
	}
	
	@Test (priority = 2, enabled = false)
	public void clickSupportLink() {
		driver.findElement(By.linkText("SUPPORT")).click();
		String ActualSupportPageTitle = driver.getTitle();
		String ExpectedRegisterPageTitle = "Support: Mercury Tours";
		
		Assert.assertEquals(ActualSupportPageTitle, ExpectedRegisterPageTitle);
	}
	
	@Test (priority = 3, enabled = true, dependsOnMethods = "submitBtnEnableAfterCredentials")
	public void submitBtnEnable() {
		WebElement submitBtn = driver.findElement(By.name("submit"));
		
		Assert.assertTrue(submitBtn.isEnabled()); // requirement = submit needs to be enabled all the time
	}
	
	@Test (priority = 4, enabled = true)
	public void submitBtnEnableAfterCredentials() {
		// requirement = submit needs to be enabled only after typing username and password
		
		WebElement submitBtn = driver.findElement(By.name("submit"));
		
		Assert.assertFalse(submitBtn.isEnabled());
		
		driver.findElement(By.name("userName")).sendKeys("test123");
		driver.findElement(By.name("password")).sendKeys("123");
		
		Assert.assertTrue(submitBtn.isEnabled());	
	}
	
	//Assignemnt:
//		1. Test demo tours/ any app
//		2. create 10 -> test cases based on TestNG framework
//		3. execute them using keywords
//		4. generate report, post report
//		5. use annotations
	
	
	
	
	

}
