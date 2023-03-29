package org.karthik;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Karthik extends BaseClass{
	
	
	public static void main(String[] args) {
		
		
	//	WebDriverManager.edgedriver().setup();
	//	driver = new EdgeDriver();
		
	 //   urlLaunch("http://www.greenstechnologys.com/");
	//	urlLaunch(" http://gmail.com/");
	//	urlLaunch("http://www.flipkart.com/");
		//urlLaunch("http://greenstech.in/selenium-course-content.html");
		
		maximize();
		
		//firefox browser
		
		WebDriverManager.firefoxdriver().setup();
		 WebDriver driver=new FirefoxDriver();
		urlLaunch("http://www.greenstechnologys.com/");
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
	
	


