package org.priyadevi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import zmq.Options;

public class selectt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//qn:1	
//		driver.get("https://www.facebook.com/");
//		WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		btn.click();
////		WebElement day = driver.findElement(By.id("day"));
////		Select a=new Select(day);
////		a.selectByIndex(6);
//		WebElement month1 = driver.findElement(By.id("month"));
//		Select b=new Select(month1);
//		List<WebElement> options = b.getOptions();
//		for(int i=0; i<options.size(); i++) {
//			System.out.println(options.get(i).getText());
//		}
	//	WebElement year = driver.findElement(By.id("year"));
		
	//	Select c=new Select(year);
	//qn:7	
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//	    WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
//	    country.click();
//		Select c= new Select(country);
//	List<WebElement> options1 = c.getOptions();
//		for (int i=0; i<options1.size(); i++) {
//			WebElement d = options1.get(i);
//		System.out.println(d.getText());
//		System.out.println(d.getAttribute());	
	//	
//		driver.get("http://output.jsbin.com/osebed/2");
	//	driver.get("http://adactin.com/HotelApp/");
//qn:5		 driver.get("https://www.facebook.com/");
//		 WebElement btn1 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		 btn1.click();
//      WebElement day = driver.findElement(By.id("day"));
//		Select d=new Select(day);
//		List<WebElement> options3 = d.getOptions();
//		for(int i=0; i<options3.size(); i++) {
//			if(i%2==1) {
//			WebElement g = options3.get(i);
//			System.out.println(g.getText());
	//qn:3	
//		driver.get("https://www.facebook.com/");
//		 WebElement btn1 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		 btn1.click();
//		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
//		
//		Select  f= new Select(year);
//		List<WebElement> options4 = f.getOptions();
//		for(int i=0; i<options4.size(); i++) {
//			WebElement h = options4.get(i);
//			System.out.println(h.getAttribute("innerText"));
//		}
//qn:10		
//		driver.get("https://output.jsbin.com/osebed/2");
//	WebElement m = driver.findElement(By.id("fruits"));
//	Select s= new Select(m);
//	s.selectByIndex(0);
//	s.selectByValue("apple");
//	s.deselectByVisibleText("Orange");
//	s.selectByIndex(2);
//	List<WebElement> options7 = s.getOptions();
//	for(int i=0; i<options7.size(); i++) {
//	if( i%2==0 ) {
//		System.out.println(options7.get(i).getText());
//		options7.size();
//qn:11		
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement m = driver.findElement(By.id("fruits"));
		Select s= new Select(m)
		
		
		
		
	}
		
		
		
	
     
		
		}
		

		
		
		
		
		
	


