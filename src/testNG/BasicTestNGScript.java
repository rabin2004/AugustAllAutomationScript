package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNGScript {
	
	// Annotations:
		// 1. @Test - test automation scripts are written
		// 2. Pre-requisite annotations - @BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod, @BeforeGroups
		// 3. Post-requisite annotations - @AfterSuite, @AfterTest, @AfterClass, @AfterMethod, @AfterGroups
	
	// @BeforeMethod & @AfterMethod -> if block of codes needs to be executed before and after every test methods
		 /*	@BeforeMethod
				@Test - 1
			@AfterMethod
			@BeforeMethod
				@Test - 2
			@AfterMethod */
	
	@BeforeMethod
	public void beforeTestMethod() {
		System.out.println("Executing before each test method/case");
	}
	
	@AfterMethod
	public void afterTestMethod() {
		System.out.println("Executing after each test method/case");
	}
	
	@Test
	public void test1() {
		System.out.println("Test case 1");
//		Assert.assertTrue(false);
	}
	
	@Test
	public void test2() {
		System.out.println("Test case 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test case 3");
	}

}
