package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingTestNG {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://facebook.com");
		
		//Login functionality:
		// 1. Positive login test - failed - execution stops
		
		// 2. Negative login test both invalid credential - 
		
		// 3. Negative login test both invalid username and valid password - 
		
		// 4. Negative login test both valid username and invalid password
		
		
		// TestNG -> automation framework
			// Advantages: 
				// 1. all test case will execute no matter passing or failing of earlier test case
				// 2. clarity in automation script, clear demarcation
				// 3. Automation Report/ Console output change
				// 4. Annotations - starts with @Test, @BeforeTest, @AfterTest, @DataProvider
				// 5. XML file - multiple test classes can be executed in one click, parallel testing, manipulation execution, group of test case execution
				// 6. Validation point - "Assertions"
		

	}

}
