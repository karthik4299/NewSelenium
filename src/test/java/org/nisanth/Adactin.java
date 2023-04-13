package org.nisanth;

import java.awt.SecondaryLoop;
import java.util.List;

import org.baseClass.BaseClasss;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Adactin extends BaseClasss {
	
public static void main(String[] args) {
	
	browserlaunch("Chrome");
	urlLaunch("https://adactinhotelapp.com/");
	implicityWait(10);
	Daataa a=new Daataa();
	sendkeys(a.getName(), "hemagayathri090697");
	sendkeys(a.getPass(), "lathakumar@123");
	click(a.getLogin());
	selectByIndex(a.getLocation(), 4);
	selectByIndex(a.getHotel(), 3);
	selectByIndex(a.getRoom(), 3);
	selectByIndex(a.getNumroom(), 5);
	sendkeys(a.getCheckin(), "13/04/2023");
	sendkeys(a.getCheckout(), "15/4/2023");
	sendkeys(a.getNumadult(), "5");
	sendkeys(a.getNumchild(), "1");
	click(a.getSubmit());
	click(a.getBtn());
	click(a.getCntnew());
	sendkeys(a.getFstnm(), "nishaanth");
	sendkeys(a.getLstnm(), "r");
	sendkeys(a.getAddress(), "address");
	sendkeys(a.getCard(), "123456789123456789");
	selectByIndex(a.getCtype(), 3);
	selectByIndex(a.getExpmon(), 10);
	selectByIndex(a.getExpyr(), 8);
	sendkeys(a.getCvv(), "1234");
	click(a.getBooknow());
	click(a.getItinerary());
	
	List<WebElement> table = driver.findElements(By.tagName("table"));
	WebElement table1 = table.get(4);
	
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	WebElement row = rows.get(4);
	
	click(a.getCheckall());
	click(a.getCancelall());
		
	Alert b= driver.switchTo().alert();
	b.accept();
			












}


}
