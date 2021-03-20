package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTagName {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the browser size
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		// findElements() - to identify more than one element with that locator
		List<WebElement> tagsInHomePage = driver.findElements(By.tagName("a")); // tagName - used to identify more than one elements
		System.out.println("Number of links in HomePage: "+tagsInHomePage.size());
		
		List<WebElement> inputInHomePage = driver.findElements(By.tagName("input"));
		System.out.println("Number of input field: "+inputInHomePage.size());
		
		List<WebElement> imagesInHomePage = driver.findElements(By.tagName("img"));
		System.out.println("Number of images in HomePage: "+imagesInHomePage.size());

		driver.close();
		
		// Assignment:
//			1. Use tagName to identify multiple elements & store as List
//			2. Get the size
//			3. Get all the values of the elements stores
	}

}
