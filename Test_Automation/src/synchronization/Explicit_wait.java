package synchronization;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Explicit_wait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		
		
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		driver.findElement(By.xpath("//section[text()='Page Loading']")).click();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		Set<String> ele = driver.getWindowHandles();
		for(String win:ele)
		{
			driver.switchTo().window(win);
		}
		
		driver.findElement(By.id("email")).sendKeys("rashmi");
		driver.findElement(By.xpath("//button[text()='Subscribe']")).click();
	}

}
