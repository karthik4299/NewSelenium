package org.karthikkumar;

import java.sql.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {

	public static WebDriver driver;

	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterClass
	private void afterClass() {
		driver.quit();
	}

	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date(10);
		System.out.println(d);

	}

	@AfterMethod
	private void afterMethod() {
		
	}

	@Test
	private void test1() {
		driver.get(" http://www.greenstechnologys.com/");

	}

	@Test
	private void test2() {
		driver.get(" http://gmail.com/");
	}

	@Test
	private void test3() {
		driver.get("http://www.flipkart.com/");
	}

	@Test
	private void test4() {
		driver.get("http://greenstech.in/selenium-course-content.html");
	}

}
