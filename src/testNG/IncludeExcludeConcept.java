package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IncludeExcludeConcept {
WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@AfterMethod
	public void closeBroswer() {
		driver.close();
	}
	
	// dataProvider = "Positive Data for sign in functionality test" or name of method
	@Test (dataProvider = "Positive Data for sign in functionality test")
	public void positiveSignFunctionality(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//table[@width='492']/tbody/tr[1]/td")).isDisplayed());
	}
	
	@Test
	public void positiveRegisterLinkFunctionality() {
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	}
	
	@Test (dataProvider = "Negative senario datas for sign in functionality test")
	public void negativeSignFunctionality(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//td[@width='112']/span")).isDisplayed());
	}
	
	@Test (dataProvider = "Positive Data for sign in functionality test")
	public void negativeRegisterLinkFunctionality() {
		driver.findElement(By.linkText("REGISTER")).click();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
	}
	
	// Datas
	@DataProvider (name="Positive Data for sign in functionality test")
	public Object[][] positiveSignInDatas() {
		Object[][] datas = {{"test123", "123"}};
		return datas;
	}
	
	//Datas
	@DataProvider (name="Negative senario datas for sign in functionality test")
	public Object[][] negativeSignInDatas() {
		Object[][] datas = {{"tom123", "123"}};
		return datas;
	}
}

	//Assignment:
//		1. Use same testNg class -> config.properties, parameterXML, customization of XML (include/exclude), execution by groups



