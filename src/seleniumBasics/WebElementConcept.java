package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	// WebElements/WebObject/GUI(Graphical User Interface) object - elements in the web application page
		// Types of webElement -
		// 1. Text field/Text area - user can type something -> can perform action -> click & type -> letters can be visible or masked
		// 2. Button - enter or click action -> enabled or disabled
		// 3. Link/hyperLink - click action -> take user to page of same application or foreign application
		// 4. CheckBox - click action -> one click, object gets selected , double click object gets deselected -> user would be able to select one or more option
		// 5. RadioButton - click action -> user can only select one option -> default selection
		// 6. List Box/DropDown box - click action -> more options will displayed and can be selected with click action
		// 7. Table - interactive table or informative table -> interactive table - click or type actions
		// 8. Menus - click action
		// 9. Images - interactive image or informative image -> interactive image -> click action
	
		// WebElement locating Strategy -
			// 1. Name - 1st choice, most common, mostly unique in nature
			// 2. ID - 1st choice, most common, mostly unique in nature
			// 3. ClassName - not unique, used with some other attribute
			// 4. LinkText - for links
			// 5. Partial LinkText - part of link if linkText is very long
			// 6. Xpath - common and very useful strategy if other strategy don't work, cutomization
			// 7. Css selector - common and very useful strategy if other strategy don't work, cutomization
			// 8. TagName - not specific, used to identify group of elements
	
		// Each webElement will have - 
				// 1. TagName
				// 2. Attributes
				// 3. Attributes will have values
				// 4. Text, not all the time
	
	// Eg. for userName Text field = <input type="text" name="userName" size="10">
			// input - TagName
			// type, name, size = Attributes
			// "text", "userName", "10" = values
			
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		// using name 
//		driver.findElement(By.name("userName")).click();
//		driver.findElement(By.name("password")).click();
		
		// sending values into the text field => sendKeys()
//		driver.findElement(By.name("userName")).sendKeys("test123");
//		driver.findElement(By.name("password")).sendKeys("123");
//		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.id("email")).sendKeys("Tom");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();
		
		// using id 
//		driver.findElement(By.id("test")).click();
//		//using className
//		driver.findElement(By.className("test")).click();
//		// using TagName
//		driver.findElement(By.tagName("img")).click();
//		// using xpath
//		driver.findElement(By.xpath("xpath")).click();
//		// using css select
//		driver.findElement(By.cssSelector("css")).click();
		// using linkText
//		driver.findElement(By.linkText("REGISTER")).click();
		// using partialLinkText
//		driver.findElement(By.partialLinkText("vacation destinations")).click();
		

		
		// Assignment: 
//			Pre-requisite - setProperty, browser object, load Url
//			1. Any 2-3 applications, load - different class for different application
//			2. location 5-10 elements - txtField/buttons/linkText
//			3. perform action - click() & sendKeys()
			
	}

}
