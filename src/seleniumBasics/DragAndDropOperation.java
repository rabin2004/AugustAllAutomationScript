package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
		driver.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement bankToBeDragged = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement bankDropLocation = driver.findElement(By.id("bank"));
		WebElement fiveThouToBeDragged = driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]"));
		WebElement fivThouDropLocation = driver.findElement(By.id("amt7"));
		
		Actions action = new Actions(driver);
		
		// Option 1 - using dragAndDrop()
//		action.dragAndDrop(bankToBeDragged, bankDropLocation).build().perform();
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
//		action.dragAndDrop(fiveThouToBeDragged, fivThouDropLocation).build().perform();
		
		
		// Option 2 - for drag and drop without using dragAndDrop()
		action.clickAndHold(bankToBeDragged).moveToElement(bankDropLocation).release().build().perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		action.clickAndHold(fiveThouToBeDragged).moveToElement(fivThouDropLocation).release().build().perform();
		
		// more methods in mouse/keyboard Operation
//		action.doubleClick();
//		action.contextClick();
//		action.keyDown(Keys.CONTROL);
//		action.keyUp(Keys.CONTROL);
//		action.release();
//		action.sendKeys(Keys.PAGE_DOWN);
//		action.sendKeys(Keys.PAGE_UP);
	}
	

}
