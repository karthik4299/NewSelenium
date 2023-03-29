package org.karthik;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorr extends BaseClass {

	public static void main(String[] args) {
		
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
//		urlLaunch("https://www.facebook.com/");
//		implicityWait(10);
//		maximize();
//		
		
		
		//FACE BOOK ACCOUNT
		
//		WebElement name = driver.findElement(By.id("email"));
//		
//		sendkeys(name, "karthik");
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		
//		sendkeys(pass, "111111111");
//		
//		WebElement login = driver.findElement(By.name("login"));
//		click(login);
		
		// GOOGLE ACCOUNT
		
//		urlLaunch(" https://www.google.com/ ");
//		implicityWait(10);
//    	maximize();
//		 WebElement search = driver.findElement(By.name("q"));
//		 sendkeys(search, "GreensTechnology");
//		 WebElement btn = driver.findElement(By.name("btnK"));
//		 click(btn);
//		
//		
		
		//ICICI ACCOUNT
		
//		
//		urlLaunch(" https://infinity.icicibank.com/corp/Login.jsp");
//		implicityWait(10);
//    	maximize();
//    	WebElement arrow = driver.findElement(By.xpath("(//img[@class='goahead'])[1]"));
//    	click(arrow);
//		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
//		sendkeys(name, "2222244567");
//		
//		WebElement pass = driver.findElement(By.xpath("//input[@title='Password']"));
//		sendkeys(pass, "98989689");
//		
//		WebElement login = driver.findElement(By.xpath("//input[@class='cta']"));
//		click(login);
		
		//HDFC ACCOUNT
		
//		urlLaunch(" https://netbanking.hdfcbank.com/ ");
//		//implicityWait(10);
//    	maximize();
//    	WebElement cust = driver.findElement(By.xpath("//input[@type='text']"));
//    	sendkeys(cust, "23456788");
//    	WebElement con = driver.findElement(By.xpath("(//div[@class='inputfield ibvt loginData'])[2]"));
//    	click(con);
//    	
//    	
		
		//swigy 
//		urlLaunch(" https://www.swiggy.com/");
//		implicityWait(10);
//    	maximize();
//    	WebElement location = driver.findElement(By.id("location"));
//    	sendkeys(location, "chennai");
//    	WebElement submit = driver.findElement(By.xpath("//span[text()='FIND FOOD']"));
//    	click(submit);
//		
		
    	//snapdeal
    	
//    	
//    	urlLaunch("https://www.snapdeal.com/login");
//		implicityWait(10);
//    	maximize();
//    	WebElement mobile = driver.findElement(By.id("userName"));
//    	sendkeys(mobile, "9626768155");
//    	WebElement con = driver.findElement(By.id("checkUser"));
//    	click(con);
//    	
    	
    	//INSTAGRAM ACCOUNT
		
//		urlLaunch("https://www.instagram.com/accounts/login/");
//		implicityWait(10);
//    	maximize();
//    	WebElement name = driver.findElement(By.name("username"));
//    	sendkeys(name, "karthik");
//    	WebElement pass = driver.findElement(By.name("password"));
//    	sendkeys(pass, "132434");
//    	WebElement sub = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
//    	click(sub);
    	
    	//automation 
    	
    	
//    	
//    	urlLaunch("http://demo.automationtesting.in/Register.html");
//		implicityWait(10);
//    	maximize();
//    	
//    	WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//    	sendkeys(name, "karthik");
//    	WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//    	sendkeys(last, "sk");
//    	WebElement add = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
//    	sendkeys(add, "tenkasi");
//    	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//    	sendkeys(email, "skask005@gmail.com");
//    	WebElement tell = driver.findElement(By.xpath("//input[@type='tel']"));
//    	sendkeys(tell,"9626768155");
//    	WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//    	click(male);
//    	WebElement movie = driver.findElement(By.xpath("//input[@value='Movies']"));
//    	click(movie);
//    	WebElement lan = driver.findElement(By.id("msdd"));
//    	Select s= new Select(lan);
//    	s.deselectByVisibleText("hindi");
//    	
//    	
    	
    	
    	//ADACTIN HOTEL APP
    	
    	urlLaunch("http://adactinhotelapp.com/");
		implicityWait(10);
    	maximize();
    	WebElement user = driver.findElement(By.id("username"));
    	sendkeys(user, "karthik");
    	WebElement pass = driver.findElement(By.id("password"));
    	
    	sendkeys(pass, "1111111111111");
    	
    	WebElement login = driver.findElement(By.id("login"));
    	click(login);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
	
	
}
