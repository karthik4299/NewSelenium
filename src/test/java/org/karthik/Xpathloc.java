package org.karthik;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathloc extends BaseClass{
 
	
	public static void main(String[] args) {
		

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
//		urlLaunch("https://www.amazon.in/");
//		implicityWait(10);
//    	maximize();
//		WebElement name = driver.findElement(By.name("field-keywords"));
//		sendkeys(name, "iphone 13");
//		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
//		click(submit);
//		
//		
		//FACEBOOK
//		
//		urlLaunch("https://www.facebook.com/");
// 		implicityWait(10);
//     	maximize();
//     	
//     	WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
//		sendkeys(user, "karthik");
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		
//		sendkeys(pass, "111111111");
//		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
//		click(submit);
//		
		
		
		// GREENS 
//		urlLaunch("http://greenstech.in/selenium-course-content.html");
// 		implicityWait(10);
//     	maximize();
//     	WebElement inter = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
//     	click(inter);
//     	WebElement cts = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
//     	click(cts);
     	
     	
     	//REDBUS     **************pending
//		
//    	urlLaunch("https://m.redbus.in/signin-iframe");
// 		implicityWait(10);
//     	maximize();
//     	WebElement num = driver.findElement(By.xpath("//input[@type='number']"));
//     	sendkeys(num, "9626768155");
//     	WebElement ro = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
//     	click(ro);
//     	WebElement sub = driver.findElement(By.xpath("//div[@data-autoid='signin-send-otp']"));
//     	click(sub);
//     	
     	
		
		//trip
     	
//     	
//    	
//    	urlLaunch("https://www.cleartrip.com/trains");
// 		implicityWait(10);
//     	maximize();
//     	WebElement from = driver.findElement(By.xpath("//input[@title='From station']"));
//     	sendkeys(from, "chennai");
//     	WebElement to = driver.findElement(By.xpath("//input[@title='To station']"));
//     	sendkeys(to, "tenkasi");
//     	WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
//     	click(sub);
//     	
//     	
//     	
//     	
//     	//    GREENS
//     	
//		urlLaunch("http://greenstech.in/selenium-course-content.html");
// 		implicityWait(10);
//     	maximize();
//     	WebElement model = driver.findElement(By.xpath("//div[@title='Model Resumes']"));
//		click(model);
//		WebElement one = driver.findElement(By.xpath("//a[text()='Resume Model-2 ']"));
//		click(one);
//		
		
		//flipkart
		
//		urlLaunch(" https://www.flipkart.com/");
// 		implicityWait(10);
//     	maximize();
//     	 WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		 click(close);
//		 
//		 WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
//		 click(login);
//		 WebElement mo = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//		sendkeys(mo, "9361796406");
//		WebElement sub = driver.findElement(By.xpath("//button[text()='Request OTP']"));
//		click(sub);
//		
		
		
		//AMAZON PRODUCT
		
//		
//		urlLaunch(" https://www.amazon.in/");
// 		implicityWait(10);
//     	maximize();
//     	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
//		sendkeys(search, "facewash");
//		WebElement sub = driver.findElement(By.xpath("//input[@type='submit']"));
//		click(sub);
		
		
		
		
		//
		
		urlLaunch(" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
 		implicityWait(10);
     	maximize();
		WebElement first = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		sendkeys(first,"mkk");
		WebElement sec = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		sendkeys(sec, "skkk");
		WebElement lo = driver.findElement(By.xpath("//input[@type='email']"));
		sendkeys(lo, "mkkskk");
		WebElement fnp = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		sendkeys(fnp, "1111111");
		WebElement fnk = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		sendkeys(fnk, "11111111");
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
