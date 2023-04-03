package org.priyadevi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationss {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\driver\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	//is dislayed()	
		WebElement txt = driver.findElement(By.id("email"));
		boolean a = txt.isDisplayed();
		System.out.println(a);
	//is Enable()
		WebElement txt2 = driver.findElement(By.xpath("(// a[@role ='button'])[2]"));
		boolean b = txt2.isEnabled();
		System.out.println(b);
		txt2.click();
	//is selected()
		WebElement txt3= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean c = txt3.isSelected();
		System.out.println("before select "+c);
		txt3.click();
		System.out.println("after select "+c);
		
		
		
	}

}
