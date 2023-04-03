package org.priyadevi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framess {
	public static void main(String[] args) throws AWTException  
	{System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.get("https://netbanking.hdfcbank.com/netbanking/");
//	
//	driver.switchTo().frame(0);
//	WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
//	txtuser.sendKeys("priya");
//	WebElement loginbtn = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
//	loginbtn.click();
//	Robot r = new Robot();
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	driver.switchTo().frame(0);
//	driver.switchTo().frame(0);
//	driver.switchTo().frame(0);
//	
//	WebElement pass = driver.findElement(By.name("fldPassword"));
//	pass.sendKeys("1111111");
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
	driver.get("//netbanking.canerabank.in/entry/ENU");
	
		
		
	}

}
