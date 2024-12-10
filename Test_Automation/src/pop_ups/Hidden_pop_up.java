package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_pop_up {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='21']")).click();
		
		String ele = driver.getCurrentUrl();
		System.out.println(ele);
		driver.quit();
		
		
	}

}
