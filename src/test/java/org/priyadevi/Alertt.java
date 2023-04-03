package org.priyadevi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertt {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		// qn:1
		WebElement btn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		btn.click();
		TargetLocator btn1 = driver.switchTo();
		Alert a = btn1.alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();

		Robot B = new Robot();
		B.keyPress(KeyEvent.VK_ENTER);
		B.keyRelease(KeyEvent.VK_ENTER);
		// qn:2
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		WebElement confirm1 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));

		confirm1.click();
		Alert d = driver.switchTo().alert();
		String text1 = d.getText();
		System.out.println(text1);
		d.accept();
//  qn:3 
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
		WebElement prompt1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		prompt1.click();
		Alert e = driver.switchTo().alert();
		e.sendKeys("priya");
		String text2 = e.getText();
		System.out.println(text2);
		e.accept();

	}

}
