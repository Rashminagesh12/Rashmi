package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("rashmi");
		//Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		Alert a=driver.switchTo().alert();  //to switch from main page to pop up page or parent browser to child browser
		System.out.println(a.getText());
		a.accept();  //method to click on ok/yes
		//Thread.sleep(2000);
		a.dismiss(); //method used to click on cancel
		//driver.quit();
		
		
	}
}
