package testDummyPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestNgDataProvider {

	// Data Driven -> basic codes to run with multiple sets of data
	
	// In TestNG -> @DataProvider annotation
	
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
	
	@Test (dataProvider = "Negative senario datas for sign in functionality test")
	public void negativeSignFunctionality(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//td[@width='112']/span")).isDisplayed());
	}
	
	// Datas
	@DataProvider (name="Positive Data for sign in functionality test")
	public Object[][] positiveSignInDatas() {
		Object[][] datas = {{"test123", "123"},{"test", "123"}, {"tom", "123"}, {"tom123", "123"}};
		return datas;
	}
	
	//Datas
	@DataProvider (name="Negative senario datas for sign in functionality test")
	public Object[][] negativeSignInDatas() {
		Object[][] datas = {{"tom123", "123"},{"harry123", "123"},{"john123", "123"}, {"test123", "123"}};
		return datas;
	}
}
