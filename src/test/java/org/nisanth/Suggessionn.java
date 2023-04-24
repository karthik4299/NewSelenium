package org.nisanth;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseClass.BaseClasss;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Suggessionn extends BaseClasss {

	public static void main(String[] args) {
		browserlaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		implicityWait(10);
//		Alert a= driver.switchTo().alert();
//		a.dismiss();
		WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click(click);
		WebElement search = driver.findElement(By.name("q"));
		sendkeys(search, "iphone14");
		phone();
	}
	
	public static void phone() {
		List<WebElement> b = driver.findElements(By.xpath("//li[@class='Y5N33s']"));
		for(int i=0;i<b.size();i++) {
//		String txt = getAttribute(b.get(i), null);
			String text = getText(b.get(i));
			System.out.println(text);
		}
	}
}
		
		
