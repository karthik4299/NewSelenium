package org.priyadevi;

import java.util.Date;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.base.baseclass;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import org.pom.pomclass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ntestng extends baseclass  {
	@BeforeClass
	private void beforeclass() {
		browserlanch("chrome");
		maximize();
		implicitywait();
		System.out.println("beforeclass");
	}
@AfterClass
private void afterclass() {
	quit();
	System.out.println("afterclass");
}
@BeforeMethod
private void beforemethod() {
	Date d= new Date();
	System.out.println("start time.....+d");
	System.out.println("beforemethod");

}
@AfterMethod
private void aftermethod() {
	Date d =new Date();
	System.out.println("end time .....+d");
}
@Test 
private void test1() {
	
	urllanch("https://www.facebook.com/");
 String cu = getcurrenturl();
 boolean c = cu.contains("facebook");
 Assert.assertTrue(c);
 
	
	
	
	pomclass a=new pomclass();
	sendkeys(a.getTxtuser(), "priya devi");
	String user = getAttribute(a.getTxtuser());
	Assert.assertEquals(user, "priya devi");
	
	sendkeys(a.getTxtpass(), "12345");
	String pass = getAttribute(a.getTxtpass());
	Assert.assertEquals(pass, "12345");
	
	webelementclick(a.getLoginbtn());
	String click = getcurrenturl();
	boolean clickbtn = click.contains("privacy_mutation_token");
	Assert.assertTrue(clickbtn);
	System.out.println("..............");
	
	System.out.println("test");
} 
@Test
private void test2() {
	browserlanch("https://www.facebook.com/");
	pomclass a=new pomclass();
	sendkeys(a.getFirstname(), "priya");
	sendkeys(a.getLastname(),"devi");
	sendkeys(a.getEmail(), "priyadevidinesh7@");
	sendkeys(a.getNewpass(), "MK");
	webelementclick(a.getFemale());
	selectbyvalue(a.getDay(), "9");
	selectbyvalue(a.getMonth(), "3");
	selectbyvalue(a.getYear(), "1995");
}
}

