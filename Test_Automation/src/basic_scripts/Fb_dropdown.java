package basic_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_dropdown {

	

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/r.php");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement ele = driver.findElement(By.id("year"));
			Select s=new Select(ele);
			List<WebElement> year = s.getOptions();
			System.out.println(year.size());
			
			
			
	}

}
