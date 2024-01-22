package arj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver Cd = new ChromeDriver();
		Cd.get("https://practicetestautomation.com/");
		Cd.manage().window().maximize();
		Cd.get("https://practicetestautomation.com/");
		Cd.manage().window().maximize();
		Cd.findElement(By.linkText("PRACTICE")).click();
		Cd.findElement(By.linkText("Test Login Page")).click();
		Cd.findElement(By.id( "username")).sendKeys("student");
		Cd.findElement(By.id("password")).sendKeys("password456");
		Cd.findElement(By.id("submit")).click();
	//Takescreenshot	
	    TakesScreenshot TS = (TakesScreenshot) Cd;
		File Src= TS.getScreenshotAs(OutputType.FILE);
		File Des = new File(".//Sample//Image.png");
		FileUtils.copyFile(Src, Des);
	}
}
