package synchronization;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Explicit_wait2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		
		driver.findElement(By.xpath("//a[text()='With Element']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("2");
		WebElement start = driver.findElement(By.xpath("//button[text()='Start']"));
		start.click();
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='Do you like Automation']"));
		String photo="./photos/";
		Date d=new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+".jpeg");
		FileHandler.copy(src, dst);
		
		
		

	}

}
