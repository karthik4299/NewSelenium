package org.priyadevi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

//import org.base.baseclass;
import org.baseClass.BaseClass;
import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.PageFactory;

public class Flipcart extends baseclass {
	public static void main(String[] args) {
		browserlanch("chrome");
		urllanch("https://www.flipkart.com/");
		maximize();
		implicitywait();

		WebElement loginbtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		loginbtn.click();
		WebElement srcbtn = driver.findElement(By.xpath("//input[@type='text']"));
		srcbtn.sendKeys("iphone");
		WebElement srcbtn2 = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		srcbtn2.click();
		// product name
//		
		List<WebElement> p = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List <String>pp=new ArrayList<String>();
		for (int i = 0; i < p.size(); i++) {
			WebElement product = p.get(i);
			String text = product.getText();
			pp.add(text);
			System.out.println(text);

		}
//price
		List<WebElement> pr = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		List<Integer> li = new ArrayList();
		for (int j = 0; j < pr.size(); j++) {
			WebElement price = pr.get(j);
			String text1 = price.getText();
			// System.out.println(text1);
			String rp1 = text1.replaceAll("₹", "");
			String rp2 = rp1.replaceAll(",", "");
			int rp3 = Integer.parseInt(rp2);
			li.add(rp3);
			System.out.println(rp3);

		}

		Collections.sort(li);
		System.out.println(li);
		Integer max = Collections.max(li);
		System.out.println(max);
		Integer min = Collections.min(li);
//		System.out.println(min);
//
//		Map mp = new LinkedHashMap();
//		for (int i = 0; i < pp.size(); i++) {
//			mp.put(pp.size(), li.size());
//			System.out.println(pp.get(i) + "==" + li.get(i));
//
//		}
////	}}
//	day:1, task:1-greens technology
		browserlanch("chrome");
		urllanch("http://www.greenstechnologys.com/");
//task:2-Gmail
		browserlanch("chrome");
		urllanch("https://www.google.com");
//task:3		flipcart
		browserlanch("chrome");
		urllanch("https://www.flipkart.com/");
//task:4    thambaram trining		
		browserlanch("chrome");
		urllanch("https://www.trainingintambaram.net/");
		

//selenium day 2 task 1
		browserlanch("chrome");
		urllanch("https://www.facebook.com/");
		maximize();
		implicitywait();
	WebElement username = driver.findElement(By.id("email"));
username.sendKeys("priyadevi");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		
//task 2
		browserlanch("chrome");
		urllanch("https://www.redbus.in/");
		maximize();
		implicitywait();
		WebElement frombtn = driver.findElement(By.id("src"));
		frombtn.sendKeys("chennai");
		WebElement tobtn = driver.findElement(By.id("dest"));
		tobtn.sendKeys("villupuram");
//	task3
		browserlanch("chrome");
		urllanch("https://www.google.com");
		maximize();
		implicitywait();
		WebElement srcbtn1 = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		srcbtn1.sendKeys("GreensTechnology");
//task4
		browserlanch("chrome");
		urllanch("https://secure.icicidirect.com/mobile/login");
		maximize();
		implicitywait();
		WebElement user = driver.findElement(By.xpath("txtusid"));
		user.sendKeys("priya");
		WebElement pass = driver.findElement(By.xpath("txtupass"));
		pass.sendKeys("mk");
//task6
		browserlanch("chrome");
		urllanch("https://www.swiggy.com/");
		maximize();
		implicitywait();
		WebElement loctionbtn = driver.findElement(By.id("location"));
		loctionbtn.sendKeys("chennai");
//task7
		browserlanch("chrome");
		urllanch("https://www.snapdeal.com/login");
		maximize();
		implicitywait();
		WebElement usernamep= driver.findElement(By.xpath("//input[@type='text']"));
		usernamep.sendKeys("priyadevi");
//task8
		browserlanch("chrome");
		urllanch("https://www.instagram.com/");
		maximize();
		implicitywait();
		WebElement usernamem = driver.findElement(By.xpath("//input[@name='username']"));
		usernamem.sendKeys("priya");
		WebElement pass1 = driver.findElement(By.xpath("//input[@name='password']"));
		pass1.sendKeys("devi");
//task9
		browserlanch("chrome");
		urllanch("https://demo.automationtesting.in/Register.html");
		maximize();
		implicitywait();
		WebElement first = driver.findElement(By.xpath("//input[@type='text']"));
		first.sendKeys("priya");
		WebElement last = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		last.sendKeys("devi");
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("villupuram");
		WebElement email = driver.findElement(By.xpath("//input[@type='email'"));
		email.sendKeys("priydevidinesh@");
		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("6382487102");
//task10
		browserlanch("chrome");
		urllanch("https://adactinhotelapp.com/");
		maximize();
		implicitywait();
		WebElement name= driver.findElement(By.id("username"));
		name.sendKeys("priya");
		WebElement pass2 = driver.findElement(By.id("password"));
		pass2.sendKeys("devi");
	
	
		
//day3 
//task:1
browserlanch("chrome");
urllanch("https://amazon.in/");
maximize();
implicitywait();
WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
search.sendKeys("iphone");
WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
btn.click();
//task:2
browserlanch("chrome");
urllanch("https://www.facebook.com/");
maximize();
implicitywait();
WebElement user1 = driver.findElement(By.xpath("//input[@type='text']"));
user1.sendKeys("priya");
WebElement pas = driver.findElement(By.xpath("//input[@id='pass']"));
pas.sendKeys("devi");
WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
login.click();
//task:3
browserlanch("chrome");
urllanch("https://demo.automationtesting.in/Register.html");
maximize();
implicitywait();
WebElement first1 = driver.findElement(By.xpath("//input[@type='text']"));
first1.sendKeys("priya");
WebElement last1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
last.sendKeys("devi");
WebElement address1 = driver.findElement(By.xpath("//textarea[@rows='3']"));
address1.sendKeys("no:6 villupuram 605201");
WebElement emaill = driver.findElement(By.xpath("//input[@type='email'"));
emaill.sendKeys("priydevidinesh7@");
WebElement phone1 = driver.findElement(By.xpath("//input[@type='tel']"));
phone1.sendKeys("6382487102");
WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
female.clear();
WebElement movies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
movies.clear();
WebElement lang = driver.findElement(By.xpath("//div[@id='msdd']"));
lang.sendKeys("English");
//task:4
		browserlanch("chrome");
		urllanch("https://www.cleartrip.com/trains");
		maximize();
		implicitywait();
		WebElement from = driver.findElement(By.xpath("//input[@type='text']"));
		from.sendKeys("chennai");
		WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		to.sendKeys("munnar");
//		//task:5
////		browserlanch("chrome");
////		urllanch("http://greenstech.in/selenium-course-content.html");
////		maximize();
////		implicitywait();
//		
////		
//task-6
browserlanch("chrome");
urllanch("https://www.redbus.in/");
maximize();
implicitywait();
WebElement sign = driver.findElement(By.xpath("//div[@class='fr signin-block  ']"));
sign.click();
WebElement btn1 = driver.findElement(By.xpath("//div[@id='signin-block']"));
btn1.click();
		//task:7
		browserlanch("chrome");
		urllanch("http://greenstech.in/selenium-course-content.html");
		maximize();
		implicitywait();
//task:9
		browserlanch("chrome");
		urllanch("https://www.flipkart.com/");
		maximize();
		implicitywait();
		WebElement loginbtn1= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		loginbtn1.sendKeys("123456");
		
		
//task:10
browserlanch("chrome");
urllanch("https://www.amazon.in/");
maximize();
implicitywait();
WebElement src = driver.findElement(By.xpath("//input[@type='text']"));
src.sendKeys("toys");
WebElement click = driver.findElement(By.xpath("//input[@type='submit']"));
click.click();
////task:11
browserlanch("chrome");
urllanch(" https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
maximize();
implicitywait();
WebElement btn11 = driver.findElement(By.xpath("//input[@type='text']"));
btn11.sendKeys("priya");
WebElement btn2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
btn2.sendKeys("devi");
WebElement btn3 = driver.findElement(By.xpath("//input[@type='email']"));
btn3.sendKeys("priyadevi@");
WebElement btn4 = driver.findElement(By.xpath("//input[@type='password']"));
btn4.sendKeys("12345");
WebElement btn5 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
btn5.click();
WebElement btn51 = driver.findElement(By.xpath(""));
btn51.sendKeys("");
//task:12
browserlanch("chrome");
urllanch( "https://www.snapdeal.com/");
maximize();
implicitywait();
WebElement btn12 = driver.findElement(By.xpath(""));
btn12.click();

WebElement btn6 = driver.findElement(By.xpath("//input[@id='userName']"));
btn6.sendKeys("qwer");
//task:13
browserlanch("chrome");
urllanch( "https://www.myntra.com/register?referer=https://www.myntra.com/");
maximize();
implicitywait();

WebElement b1 = driver.findElement(By.xpath(""));
b1.sendKeys("");
WebElement b2 = driver.findElement(By.xpath(""));
b2.sendKeys("");
WebElement b3 = driver.findElement(By.xpath(""));
b3.sendKeys("");
//task:14
browserlanch("chrome");
urllanch( "https:www.swiggy.com/");
maximize();
implicitywait();
WebElement c1 = driver.findElement(By.xpath("//a[@class='r2iyh']"));
c1.click();
WebElement c2 = driver.findElement(By.xpath("//input[@name='mobile']"));
c2.sendKeys("1234567798");
WebElement c3 = driver.findElement(By.xpath("//input[@name='name']"));
c3.sendKeys("priya");
WebElement c4 = driver.findElement(By.xpath("//input[@type='email']"));
c4.sendKeys("priyadevi7@");
WebElement c5 = driver.findElement(By.xpath("//a[@class='a-ayg']"));
c5.click();
		
//day:4
//task:1
browserlanch("chrome");
urllanch( "https:www.greenstechnologys.com");
maximize();
implicitywait();
WebElement c11 = driver.findElement(By.xpath("//u[contains(text(),'Greens Technologys')]"));

String text = c11.getText();
System.out.println(text);

//task:2
browserlanch("chrome");
urllanch( "https://greenstech.in/selenium-course-content.html");
maximize();
implicitywait();
WebElement c12 = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text']"));
String adayar = c12.getText();
System.out.println(adayar);

//task:3
browserlanch("chrome");
urllanch( "https://greenstech.in/selenium-course-content.html");
maximize();
implicitywait();
WebElement d1 = driver.findElement(By.xpath("//div[@class='col-md-3 short-desc-with-logo widget widget_text']"));
String omr = d1.getText();
System.out.println(omr);

//task:4
browserlanch("chrome");
urllanch( "https://greenstech.in/selenium-course-content.html");
maximize();
implicitywait();
WebElement c41 = driver.findElement(By.xpath("(//h6[@class='widget-title '])[4]"));
String navalur = c41.getText();
System.out.println(navalur);

//task:5
		browserlanch("chrome");
		urllanch("https://www.facebook.com/");
		maximize();
		implicitywait();
	WebElement username1 = driver.findElement(By.id("email"));
username.sendKeys("priyadevi");
String name1 = username1.getAttribute("value");
System.out.println(name1);

		WebElement password1 = driver.findElement(By.id("pass"));
		password1.sendKeys("12345");
		String pass11 = password.getAttribute("value");
		System.out.println(pass11);

//task:6
		browserlanch("chrome");
		urllanch("https://www.google.com");
		maximize();
		implicitywait();
		WebElement srcbtn11 = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		srcbtn11.sendKeys("greens velmurugan");
		WebElement c13 = driver.findElement(By.xpath("//div[@class='CcAdNb']"));
		c13.click();
//task:7
browserlanch("chrome");
urllanch( "https://adactinhotelapp.com/");
maximize();
implicitywait();
WebElement c14 = driver.findElement(By.xpath("//input[@name='username']"));
c14.sendKeys("priya");
String user14 = c14.getAttribute("value");
System.out.println(user14);
WebElement c22 = driver.findElement(By.xpath("//input[@name='password']"));
c22.sendKeys("devi");
String pass14 = c22.getAttribute("value");
System.out.println(pass14);
//task:8
browserlanch("chrome");
urllanch( "https:www.snapdeal.com/");
maximize();
implicitywait();
WebElement c51 = driver.findElement(By.xpath("//input[@name='keyword']"));
c51.sendKeys("umberla");
WebElement c15= driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
c15.click();
WebElement c31 = driver.findElement(By.xpath("//p[@class='product-title']"));
c31.click();
//task:9
		browserlanch("chrome");
		urllanch("https://www.flipkart.com/");
		maximize();
		implicitywait();
		WebElement loginbtnn = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		loginbtnn.sendKeys("6382487102");
//task:10
browserlanch("chrome");
urllanch( "https://www.shopclues.com/wholesale.html");
maximize();
implicitywait();
WebElement c6 = driver.findElement(By.xpath("//input[@id='autocomplete']"));
c6.sendKeys("watch");
WebElement c7 = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
c7.click();
WebElement c8 = driver.findElement(By.xpath("//h2[@class=' mii ']"));
c8.click();
//day:5
//task:1
browserlanch("chrome");
urllanch( "https://demo.guru99.com/test/drag_drop.html");
maximize();
implicitywait();
WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
WebElement drag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement drag3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
WebElement drag4 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
WebElement drop1= driver.findElement(By.xpath("//li[@class='placeholder']"));
WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
WebElement drop4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
Actions a= new Actions (driver);
a.dragAndDrop(drag1, drop1).perform();
a.dragAndDrop(drag2, drop2).perform();
a.dragAndDrop(drag3, drop3).perform();
//a.dragAndDrop(drag4, drop4).perform();
//task:4
		browserlanch("chrome");
		urllanch( "http://www.flipkart.com/");
		maximize();
		implicitywait();
		Actions b =new Actions(driver);
		WebElement log = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		log.click();
////task:5
		browserlanch("chrome");
		urllanch( "https://greenstech.in/selenium-course-content.html");
		maximize();
		implicitywait();
		Actions c =new Actions(driver);
		WebElement course = driver.findElement(By.xpath("//div[@title='Courses']"));
	c.click(course).perform();
	WebElement software = driver.findElement(By.xpath("//div[@title='Software Testing']"));
	c.moveToElement(software).perform();
//task:6
	browserlanch("chrome");
	urllanch( "https://greenstech.in/selenium-course-content.html");
	maximize();
	implicitywait();
	Actions u =new Actions(driver);
	WebElement coursee = driver.findElement(By.xpath("//div[@title='Courses']"));
u.click(coursee).perform();
WebElement drop = driver.findElement(By.xpath("//div[@title='Oracle']"));
u.moveToElement(drop).perform();
WebElement sql = driver.findElement(By.xpath("//span[text()='SQL Certification Training']"));
u.moveToElement(sql).perform();
//task:7
browserlanch("chrome");
urllanch( "https://greenstech.in/selenium-course-content.html");
maximize();
implicitywait();
Actions y=new Actions(driver);
WebElement course1 = driver.findElement(By.xpath("//div[@title='Courses']"));
y.click(course1).perform();
WebElement data = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
y.moveToElement(data).perform();
WebElement data1 = driver.findElement(By.xpath("//span[text()='DataStage Certification Training']"));
y.moveToElement(data1).perform();
//task:8
browserlanch("chrome");
urllanch( "https://greenstech.in/selenium-course-content.html");
maximize();
implicitywait();
Actions l =new Actions(driver);
WebElement courseee = driver.findElement(By.xpath("//div[@title='Courses']"));
l.click(courseee).perform();
WebElement rpa = driver.findElement(By.xpath("//div[@title='RPA']"));
l.moveToElement(rpa).perform();
WebElement blue = driver.findElement(By.xpath("//span[text()='Blue Prism Certification Training']"));
l.moveToElement(blue).perform();
		//task:9
		browserlanch("chrome");
		urllanch( "https://www.homedepot.com/");
		maximize();
		implicitywait();
		Actions m =new Actions(driver);
		WebElement f1 = driver.findElement(By.xpath("//a[@class='ShoppingLinks__link']"));
		m.click().perform();
		//task:10
		browserlanch("chrome");
		urllanch( "https://www.amazon.com/");
		maximize();
		implicitywait();
		Actions v =new Actions(driver);
		WebElement signn = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		c.click(signn).perform();
		
		
		
		







	
		
		
		
		
		
		
	}}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
		
		
