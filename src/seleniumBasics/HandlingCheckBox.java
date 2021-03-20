package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		// checkBoxes
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(4000); // pauses java code execution
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		Thread.sleep(4000);
		
		
		
		driver.close();

	}

}
