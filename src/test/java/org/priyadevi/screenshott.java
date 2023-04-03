package org.priyadevi;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshott {
	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("http://www.greenstechnology.com/");
//		driver.get("https://www.facebook.com/");
//		driver.get("https://www.flipkart.com/");
//		TakesScreenshot tk = (TakesScreenshot) driver;
		// getscreenshots
//		WebElement txt = driver.findElement(By.id("email"));
//		File img = txt.getScreenshotAs(OutputType.FILE);
//		File win = tk.getScreenshotAs(OutputType.FILE);

//		File f = new File("C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\screenshot\\facebookUserName.png");

//		FileUtils.copyFile(img, f);
//		long time = System.currentTimeMillis();
//		
//		File f1=new File("C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\screenshot\\facebook"+time+"png");
//		FileUtils.copyFile(win, f1);
//		
//		
//		File screen = tk.getScreenshotAs(OutputType.FILE);
//		System.out.println(screen);
//		File g= new File ("C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\screenshot\\greens.png");
//		FileUtils.copyDirectory(screen, g);
		
//qn:9
//		driver.get("https://www.flipkart.com/");
//		WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//         btn.click();
//         WebElement sc = driver.findElement(By.xpath("//input[@type='text']"));
//         sc.sendKeys("iphone");
//          Robot r = new Robot();
//          r.keyPress(KeyEvent.VK_ENTER);
//          TakesScreenshot tk = (TakesScreenshot)driver;
//          //get screen shot
//          File screen = tk.getScreenshotAs(OutputType.FILE);
//          System.out.println(screen);
//          File f = new File ("C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\screenshot\\iphone.png");
//          FileUtils.copyFileToDirectory(screen, f);
 //qn:11  
//		driver.get("https://www.flipkart.com/");
//		WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//        btn.click();
//       Actions a= new Actions(driver);
//       WebElement btn1 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
//       a.moveToElement(btn1);
//       TakesScreenshot tk = (TakesScreenshot)driver;
//       File screen1 = tk.getScreenshotAs(OutputType.FILE);
//       System.out.println(screen1);
//       File f1= new File("C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\screenshot\\women.png");
//       FileUtils.copyFileToDirectory(screen1, f1);
// qn:2  
//       driver.get("https:toolsqa.com/");
      
       JavascriptExecutor js =(JavascriptExecutor)driver;
//      WebElement btn2 = driver.findElement(By.xpath("//div[@class='heading__articles']"));
//       js.executeScript("arguments[0].scrollIntoView(true)",btn2);
//qn:3  
//       WebElement btn3 = driver.findElement(By.xpath("//div[@class='testimonials__heading']"));
//       
//       js.executeScript("arguments[0].scrollIntoView(true)", btn3);
//       TakesScreenshot tk = (TakesScreenshot)driver;
//       File screen2 = tk.getScreenshotAs(OutputType.FILE);
//       System.out.println(screen2);
//       File f2= new File("C:\\Users\\Admin\\Desktop\\oooo\\seleniumtask5\\screenshot\\selenium.png");
//       FileUtils.copyFileToDirectory(screen2, f2);
       
//qn:4
       driver.get("hppt://www.greenstechnologys.com/");
       
		
          
          
		   

	}

}
