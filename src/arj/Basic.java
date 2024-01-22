package arj;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.CDATASection;

public class Basic { 

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver Cd = new ChromeDriver();
		Cd.get("https://practicetestautomation.com/");
		Cd.manage().window().maximize();
		Cd.findElement(By.linkText("PRACTICE")).click();
		Cd.findElement(By.linkText("Test Login Page")).click();
		Cd.findElement(By.id( "username")).sendKeys("student");
		Cd.findElement(By.id("password")).sendKeys("password456");
		Cd.findElement(By.id("submit")).click();
		
		//File src=((TakeScreenshot)Cd).getScreenshotAs(OutputType.File);
		
		TakesScreenshot TS = (TakesScreenshot) Cd;
		
		File Src= TS.getScreenshotAs(OutputType.FILE);
		
		File Des = new File(".//Screenshots//Image.png");
		
		FileUtils.copyFile(Src, Des);
		
		
		
		
		
	//WebElement username = Cd.findElement(By.id("email"));
		//username.sendKeys("superadmin@gmail.com");
	//	WebElement pwd = Cd.findElement(By.name("password"));
		//pwd.sendKeys("Admin@123");
	//	WebElement signBtn = Cd.findElement(By.className("btn"));
	//	signBtn.click();
		
	//	Thread.sleep(4000);
	//Cd.navigate().back();
	//Thread.sleep(3000);
	//Cd.navigate().forward();
		//Thread.sleep(3000);
		//Cd.navigate().refresh();
	//	Cd.navigate().back();
	//Thread.sleep(2000);
		//Cd.navigate().to("https://selenium143.blogspot.com/");
	//	Thread.sleep(4000);
	//	Cd.navigate().back();
	//	System.out.println(Cd.getTitle());
	//	Actions act =new Actions(Cd);
	//	act.moveToElement(Cd.findElement(By.id("Selenium-By-Arun"))).moveToElement(Cd.findElement(By.xpath("https://selenium-by-arun.blogspot.com/2012/11/what-is-selenium.html")));
	//	String ActualValue=Cd.getTitle();
	//	String ExpectedValue="Selenium-By-Arun";
		
	//	if(ExpectedValue.equals(ActualValue));
		System.out.println("navigate to particular page");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	}


