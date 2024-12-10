package childbrowser_pop_up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_title_of_browsers {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		for(String wind:allwin)
		{
			System.out.println(wind);
			driver.switchTo().window(wind);
		}
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
