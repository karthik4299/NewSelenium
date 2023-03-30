package org.nisanth;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class URL extends BaseClass {
	
		
		
		@BeforeClass 
		public static void brow() {
			browserlaunch("chrome");
//			browserlaunch("edge");
			implicityWait(10);
		}
		@AfterClass
		private void aft() {
			quit();
		}
		
		@Test
		public void test1() {
			
			
			urlLaunch("http://www.greenstechnologys.com/");
			
			urlLaunch("http://gmail.com/");
			
			urlLaunch("http://www.flipkart.com/");
			
			urlLaunch("http://greenstech.in/selenium-course-content.html");
			

		}
		
		@Test
		public void test2() {
			
			urlLaunch("https://www.facebook.com/ ");
			
			WebElement user = driver.findElement(By.id("email"));
			
			user.sendKeys("nishaanth");
			
			WebElement pass = driver.findElement(By.id("pass"));
			
			pass.sendKeys("1234567");
			
		}
		
		@Test
		private void test3() {
			urlLaunch("https://www.redbus.in/ ");
			
			WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			
			from.sendKeys("chennai");
			
			WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			
			to.sendKeys("mumbai");
			
		}
	
		@Test
		private void test4() {
			urlLaunch("https://www.google.com/");
			
			WebElement google = driver.findElement(By.xpath("//input[@class='gLFyf']"));
			
			google.sendKeys("GreensTechnology");
			
		}
		
		@Test
		private void test5() {
			urlLaunch("https://infinity.icicibank.com/corp/Login.jsp");
			
			WebElement user = driver.findElement(By.name("DUMMY1"));
			
			user.sendKeys("nishaanth");
			
		}
		@Test
		private void test6() {
			urlLaunch("https://www.amazon.in/");
			
			WebElement find = driver.findElement(By.id("twotabsearchtextbox"));
			
			find.sendKeys("iphone");
			
			WebElement search = driver.findElement(By.id("nav-search-submit-button"));
			
			search.click();
			
		}
		
		@Test
		private void test7() {
			urlLaunch("http://demo.automationtesting.in/Register.html");
			
			WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
			
			first.sendKeys("nishaanth");
			
			WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			
			last.sendKeys("R");  
			
			WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
			
			address.sendKeys("111111111111111111111");
			
			WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
			
			mail.sendKeys("cbrnishaanth@gmail.com");
			
			WebElement pn = driver.findElement(By.xpath("//input[@type='tel']"));
			
			pn.sendKeys("123456789");
			
			WebElement gender = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
							
			gender.click();
			
			WebElement id = driver.findElement(By.id("checkbox1"));
			
			id.click();
			
			WebElement lang = driver.findElement(By.xpath(""));
			
			
			
//			selectAllByIndex(e);
			
			
			
			
			
			
			
			
			

		}
}


