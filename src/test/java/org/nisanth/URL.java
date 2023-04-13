package org.nisanth;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
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
		private void test7() throws InterruptedException {
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
			
			WebElement lang = driver.findElement(By.xpath("//ul[@style='list-style:none;max-height: 230px;overflow: scroll;']"));
			
			Select s=new Select(lang);
			boolean u = s.isMultiple();
			s.selectByIndex(3);
			
			WebElement skills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
			Select s1= new Select(skills);
			s1.selectByIndex(2);
			
			WebElement country = driver.findElement(By.xpath("(//select[@type='text'])[2]"));
			Select s2=new Select(country);
			s2.selectByIndex(4);
			
			WebElement hobbies = driver.findElement(By.xpath("//ul[@class='select2-results__options']]"));
			Select s6=new Select(hobbies);
			s2.selectByIndex(4);
						
			WebElement year = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
			Select s3=new Select(year);
			s3.selectByVisibleText("1918");
						
			WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
			Select s4=new Select(month);
			s3.selectByVisibleText("April");
						
			WebElement date = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
			Select s5=new Select(date);
			s3.selectByVisibleText("23");
						
			WebElement code = driver.findElement(By.xpath("//input[@id='firstpassword']"));
			code.sendKeys("123456");
			
			WebElement code1 = driver.findElement(By.xpath("//input[@id='secondpassword']"));
			code1.sendKeys("123456");
						
			WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
			submit.click();
						
			Thread.sleep(3000);
		}
			
			@Test
			private void test8() {
				driver.get("http://greenstech.in/selenium-course-content.html");
				
				WebElement id = driver.findElement(By.id("interview-question-accordion"));
				
				id.click();
				
				WebElement cts = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div/ul/li[6]/a"));
				
				cts.click();
				
				driver.switchTo().window(getWindowHandle());
				
			}
			@Test
			private void test9() {
			
				urlLaunch("https://www.redbus.in/");
				
				WebElement id = driver.findElement(By.id("sign-in-icon-down"));
				
				id.click();
				
				WebElement sign = driver.findElement(By.className("hid-config-sign hide"));
				
				sign.click();
				
				WebElement num = driver.findElement(By.id("mobileNoInp"));
				num.sendKeys("7200866554");
			
				WebElement robo = driver.findElement(By.className("recaptcha-checkbox-border"));
				
				robo.click();
				WebElement otp = driver.findElement(By.id("otp-container"));
				
				otp.click();
				
//				WebElement otp1 = driver.findElement(By.id("otp"));
//				otp1.sendKeys("111111");
				
				

				
			}
				

			}
			
			
			
			
			
			
					
			
//			selectAllByIndex(e);
			
			
			
			
			
			
			
			
			


		


