package org.nisanth;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseClass.BaseClasss;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Nisanth extends BaseClasss {
	public static void main(String[] args) throws AWTException {

		browserlaunch("chrome");
		urlLaunch("https://www.flipkart.com/");
		maximize();
		implicityWait(10);
		WebElement click = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		click(click);
		WebElement search = driver.findElement(By.name("q"));
		sendkeys(search, "iphone14");
		robotEnter();

	}

	private void pages() {
		Map<String, String> m = new TreeMap<String, String>();
		List<WebElement> page1 = driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
		for (int i = 1; i < page1.size(); i++) {
			for (int j = i; j <= i; j++) {
				WebElement p1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[" + i + "]"));
				String text = getText(p1);
				// System.out.println(text);
				WebElement pr1 = driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[" + j + "]"));
				String text2 = getText(pr1);
				// System.out.println(" price = "+text2);
				m.put(text2    +   j, text   +   i);
				 System.out.println(text + " ---> Prize = " + text2);
			} 
				 WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
				 next.click();
				 
			}
		
	
		
		Collection<String> values1 = m.values();
		for (String y : values1) {
			System.out.print(y);
			System.out.println();
		}
		Set<String> price = m.keySet();
		for (String x : price) {
		for(int i1=0;i1<price.size();i1++) {
		
			//if(price.remove(o)){
//				  price.replace(",", "");
			
//			if(x.contains("₹")) {
//				 x = x.replace("₹", "");
//				
////				System.out.println(x);
//			
//				int q = Integer.parseInt(x);
//				System.out.println(q);
				
				List<Integer> l=new LinkedList<>();
//				System.out.println(Collections.sort(price));
//				System.out.println(Collections.sort(l));
				System.out.println(Collections.max(price));
				
				System.out.println();
				
				System.out.println(Collections.min(price));
			}
			
				
			}
	}

}
			
			
			
		
//		System.out.println();
//		System.out.println("Key And Entry");
//		System.out.println();
//
//		Set<Entry<String, String>> e = m.entrySet();
//		for (Entry<String, String> x : e) {
//			System.out.println(x);
//
//		}
//		List<String> l=new LinkedList<String>();
//		l.addAll(price);
//		System.out.println();
//		System.out.println("Low price = "+l.get(0));
//		System.out.println("High price = "+ l.get(l.size()-1));
//		
//		
//		
//		

	