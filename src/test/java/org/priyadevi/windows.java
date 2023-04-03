package org.priyadevi;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome Driver",
				"C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("iphones 7");
		WebElement sbtn = driver.findElement(By.className("searchTextSpan"));
		sbtn.click();
		
		WebElement mobile = driver.findElement(By.xpath("//img[@class='product-image ']"));
		mobile.click();
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		Set<String>allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		for(String x:allwindowid) {
			if(!parentid.equals(x)) {
				driver.switchTo().window(x);
			}}
		WebElement addcart = driver.findElement(By.xpath("(//div[@shippingcharges='0'])[2]"));
		addcart.click();
		WebElement m = driver.findElement(By.xpath("//div[@class='you-pay']"));
		String text = m.getText();
		System.out.println(text);
		
			
		
		
		
		
		
		
	}
	

}
