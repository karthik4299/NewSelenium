package org.priyadevi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;;

public class webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome Driver",
				"C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> table = driver.findElements(By.tagName("table"));
		WebElement table1 = table.get(1);
//qn:1		//to get all content
		String text = table1.getText();
		System.out.println(text);
//qn:2		
		List<WebElement> row = table1.findElements(By.tagName("tr"));
		// for(int i=0; i<row.size(); i++) {
		WebElement row1 = row.get(0);
		String text2 = row1.getText();
		System.out.println(text2);
//qn:3
		
		int size = row.size();
		System.out.println(size);
//qn:4	
		WebElement row2 = row.get(1);
		String text3 = row2.getText();
		
		 List<WebElement> data = row2.findElements(By.tagName("td"));
		 WebElement data1 = data.get(1);
		 String text4 = data1.getText();
		 System.out.println(text4);
//qn:5	
		 List<WebElement>  rows = table1.findElements(By.tagName("tr"));
		 for(int i=0; i<rows.size(); i++) {
			 String text5 = rows.get(i).getText();
			 if (i%2==1) {
				 
				 System.out.println(text5);
				 
			 }
		 }
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
