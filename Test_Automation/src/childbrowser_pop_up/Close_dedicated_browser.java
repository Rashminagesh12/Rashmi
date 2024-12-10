package childbrowser_pop_up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_dedicated_browser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("NewWindow")).click();

		String p_id = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		String title = driver.getTitle();
		for(String childwind:allwin)
		{
			driver.switchTo().window(childwind);
			String title1 = driver.getTitle();
			System.out.println(title1);
			
		}
		if((title.equals("Browser Windows")))
		driver.close();
	}

}
