package org.karthikkumar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {
	public static WebDriver driver;

	@BeforeClass
	private void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	private void afterClass() {
		driver.quit();
	}

	@BeforeMethod
	private void beforeMethod() {

	}

	@AfterMethod
	private void aftermethod() {

	}

	@Test
	private void test1() {
		driver.get(" https://www.facebook.com/ ");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("karthik kumar");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("123456");

	}

	@Test
	private void test2() {
		driver.get("https://www.redbus.in/ ");
		WebElement txtfrom = driver.findElement(By.id("src"));
		txtfrom.sendKeys("chennai");
		WebElement txtTo = driver.findElement(By.id("dest"));
		txtTo.sendKeys("tenkasi");

	}

	@Test
	private void test3() {
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java program");
	}
	@Test
	private void test4() {
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp\r\n");
		WebElement user = driver.findElement(By.id("DUMMY1"));
		user.sendKeys("karthik");
		WebElement num = driver.findElement(By.xpath("//input[@name='DUMMY2']"));
		num.sendKeys("123");
	}
	@Test
	private void test5() {
		driver.get("https://netbanking.hdfcbank.com/ \r\n");
		WebElement frame3 = driver.findElement(By.xpath("//frame[@marginwidth='0']"));
		driver.switchTo().frame(frame3);
		WebElement txtuserid = driver.findElement(By.name("fldLoginUserId"));
		txtuserid.sendKeys("182679");

	}

	@Test
	private void test6() {
		driver.get("https://www.swiggy.com/");
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys("chennai");
	}

	@Test
	private void test7() {
		driver.get("https://www.snapdeal.com/login");
		WebElement mobile = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		mobile.sendKeys("7500217476");

	}

	@Test
	private void test8() {
		driver.get(" https://www.instagram.com/accounts/login/?hl=en) login page \r\n");
		WebElement txtuser = driver.findElement(By.xpath("//input[@name='username']"));
		txtuser.sendKeys("karthik kumar");
		WebElement txtpass = driver.findElement(By.xpath("//input[@name='password']"));
		txtpass.sendKeys("3456765");
	}
	@Test
	private void test9() {
		driver.get("http://demo.automationtesting.in/Register.html\r\n");
		WebElement txtfirstname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtfirstname.sendKeys("karthik");
		WebElement txtlastname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtlastname.sendKeys("kumar");
		WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("234567890fghjkbnm");
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("karthikkumar45687@gmail.com");
		WebElement phonenu = driver.findElement(By.xpath("//input[@type='tel']"));
		phonenu.sendKeys("3456789987");

	}
	@Test
	private void test10() {
		driver.get(" http://adactinhotelapp.com");
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("karthik kumar");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("2345678rfghj");
	}

}
