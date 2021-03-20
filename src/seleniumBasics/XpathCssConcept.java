package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCssConcept {
	
	// Absolute Xpath("/"): /html/body/div[3]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input
	// Absolute Css selector(">"): body > div:nth-child(6) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2) > td:nth-child(3) > form > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(4) > td:nth-child(2) > div > input[type=submit]
	// Answer??????? = customization of Xpath or Css selector
	
	// Relative Xpath or Css selector
	//Customization of Xpath & Css Selector
		// Common syntax for Xpath		  = //tagName[@attribute='value'] or //*[@attribute='value']
		// Common syntax for Css Selector = tagName[attribute='value'] or [attribute='value']
	
	//E.g <input type="submit" value="Submit" style="background-color">
		// Customized Xpath = //input[@type='submit'] or //*[@type='submit'], //input[@value='Submit'] or //*[@value='Submit']
		// Customized Css = input[type='submit'] or [type='submit']
	
	// Validation of customized xpath or css selector:
		// 1. Chropath plugin - 3rd party tool
		// 2. Chrome Development tool - Console - xpath => $x("//input[@type='submit']")
											//	- css => $("input[type='submit']")

	// using more than 1 attribute for customization
		//1. <input type="submit" value="Submit" style="background-color">
		//2. <input type="submit" style="background-color">
		//3. <input value="Submit" style="background-color">
				// xpath = //input[@type='submit'][@value='Submit'][@attribute='value']...
				// Css = input[type='submit'][value='Submit']....
	
	// using text as an attribute
		//<font face="Arial, Helvetica, sans-serif" size="2" xpath="1">Registered 
		//users can <b>sign-in here</b> to find the lowest fare on participating
    	//airlines.</font>
				// xpath => //font[text()='Registered users can sign-in here to find the lowest fare on participating airlines.']
	
	// Using "contains" keyword for long attribute values - xpath (Css selector -> *)
		// <input type="submitisgoingtoclicksubmitbutton" value="submitisgoingtoclicksubmitbutton">
			// xpath => //input[contains(@type,'clicksubmitbutton')]
			// css => input[type*='clicksubmitbutton']
	
			// xpath for text with contains => //font[contains(text(),'Registered users can sign-in')]
			
	// Using parent/child tag for customization
		// parent tag xpath => //tr/td/font[text()='Registered users can sign-in here to find the lowest fare on participating airlines.']
		// parent tag xpath =>  //tr/td/font[contains(text(),'Registered users can sign-in')]
	
		// child tag xpath =>//table[@width='100%']/tbody/tr[1]/td/font
	
		// E.g //table[@width='192']/tbody/tr[4]/td/table/tbody/tr[1]
		// css selectors - use '>' instead of '/'
	
	// using xpath to identify child element but with xpath of both parent & child
		// parentXpath/childXpath
		// Eg //div[@class='textbox123']/input[@value='search']
		// //li[@id='gh-p-2']/a[@class='gh-p']
			
	// Find parent element but by using child xpath  ------> can't do with css Selector
		// Eg childXpath/parent::parentTagName
		// //li[@id='gh-p-2']/parent::ul
		// //li[@id='gh-p-1']/parent::ul
	
	// Find sibling element using next sibing xpath - following sibling gives you next sibling
		// Eg 1stSiblingXpath/following-sibling::siblingTagName[index]
		// //li[@id='gh-p-1']/following-sibling::li[1]
		// //li[@id='gh-eb-My']/following-sibling::li[1]
	
		// preceding-sibling gives you before sibling
			//li[@id='gh-eb-My']/preceding-sibling::li[1]
	
	// unique for Css selector
		// if id -> tagName#id or #id
		// if className -> tagName.ClassName or .className
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();


	}
	
	// Assignment:
//		1. HomePage, Flights Page & Register page
//		2. Identify all the element with customized xpath or css selector

}
