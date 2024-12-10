package childbrowser_pop_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adress_of_only_parent_B {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String ele = driver.getWindowHandle();
		String ele1 = driver.getTitle();
		System.out.println(ele);
		System.out.println(ele1);
		
	
	}

}
