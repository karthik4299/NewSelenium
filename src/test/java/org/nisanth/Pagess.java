package org.nisanth;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.baseClass.BaseClasss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pagess extends BaseClasss {

	public static void main(String[] args) throws AWTException, InterruptedException {

		browserlaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		maximize();
		implicityWait(10);
		WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click(click);
		WebElement search = driver.findElement(By.name("q"));
		sendkeys(search, "iphone14");
		robotEnter();
		pages();

	}

	public static void pages() throws InterruptedException {
		Map<String, String> m = new TreeMap<String, String>();
		List<WebElement> page1 = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
		for (int k = 1; k <= 3; k++) {
			for (int i = 1; i < page1.size(); i++) {
				for (int j = i; j <= i; j++) {
					WebElement p1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[" + j + "]"));
					String text = getText(p1);
					// System.out.println(text);
					WebElement pr1 = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[" + j + "]"));
					String text2 = getText(pr1);
					// System.out.println(" price = "+text2);
					m.put(text2 + j, text + i);
					System.out.println(text + " ---> Prize = " + text2);
				
			}
			
			}
			Thread.sleep(2000);
			WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
			next.click();
			System.out.println();
			
		}
	}
}
