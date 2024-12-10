package basic_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_like 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='search-input']")).sendKeys("women fitness");
		//driver.findElement(By.id("search")).sendKeys("women fitness");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("video-title")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-hidden='true']")).click();
		
		//driver.findElement(By.xpath("//yt[text()='25 MIN FULL BODY HIIT for Beginners - No Equipment - No Repeat Home Workout']")).click();
		
		
	}

}
