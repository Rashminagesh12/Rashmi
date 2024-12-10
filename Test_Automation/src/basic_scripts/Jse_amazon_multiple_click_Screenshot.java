package basic_scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Jse_amazon_multiple_click_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		WebElement ele = driver.findElement(By.id("nav-logo-sprites"));
		Point loc = ele.getLocation();
		int x = loc.getX();
		System.out.println(x);
		int y = loc.getY();
		System.out.println(y);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ele.getScreenshotAs(OutputType.FILE);
		
		String photo = "./photos/";
		Date d=new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		File dst=new File(photo+d2+"ele1.jpeg");
		FileHandler.copy(src, dst);
		Thread.sleep(2000);
		
		WebElement ele2 = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		Point p1 = ele2.getLocation();
		int x1 = p1.getX();
		System.out.println(x1);
		int y1 = p1.getY();
		System.out.println(y);
		
		js.executeScript("window.scrollBy("+x1+","+y1+")");
		File src1 = ele2.getScreenshotAs(OutputType.FILE);
		File dst1=new File(photo+d2+"ele2.jpeg");
		FileHandler.copy(src1, dst1);
		Thread.sleep(2000);
		
		
		
		
	
	}

}
