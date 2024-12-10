package scroll_screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Multiple_SS {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//a[.='Sell on Amazon']"));
		Point p = ele.getLocation();
		int x = p.getX();
		System.out.println(x);
		int y = p.getY();
		System.out.println(y);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,'yaxis')");
		Thread.sleep(2000);
		
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\DELL\\Desktop\\Selenium\\Screenshots\\amzn.jpeg");
		
		
		String photo = "./photos/";
		Date d=new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		File dst1=new File(photo+d2+".jpeg");
		FileHandler.copy(src, dst1);
		
		//ele.click();
		
		Thread.sleep(2000);
		//driver.quit();
	}

}

	


