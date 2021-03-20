package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IdentifyingWebElementsHandlingDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the browser size
		driver.get("http://demo.guru99.com/test/newtours/index.php");

		System.out.println("Title of homepage: "+driver.getTitle()); // extract the page title
		System.out.println("Url of the website: "+driver.getCurrentUrl()); // to extract current url for validation
		
		driver.findElement(By.linkText("Flights")).click();
		System.out.println("Flight's page title: "+driver.getTitle());
		
		// handling radio button
		//using xpath
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		// using Css selector
		driver.findElement(By.cssSelector("input[value='Business']")).click();
		
		
		// handling dropDownList
		WebElement passangerCount = driver.findElement(By.name("passCount"));
		Select select1 = new Select(passangerCount); // creating object of select class for to handle drop downs
		select1.selectByVisibleText("4");
		
		WebElement airlinePreference = driver.findElement(By.name("airline"));
		Select select2 = new Select(airlinePreference);
		select2.selectByIndex(1);
		
		Select select3 = new Select(driver.findElement(By.name("fromPort")));
		select3.selectByValue("New York");
		
//		driver.close(); // close the active browser
	}

}
