package childbrowser_pop_up;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_app {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser");
		
		driver.findElement(By.xpath("//a[text()='New Window']")).click();
		driver.findElement(By.id("browser link1")).click();
		Set<String> allwin = driver.getWindowHandles();
		ArrayList<String> t=new ArrayList<String>(allwin);
		
		String p1 = t.get(0);
		String p2 = t.get(1);
		
		driver.switchTo().window(p2);
		
		driver.findElement(By.id("email")).sendKeys("rash@gmail.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		driver.switchTo().window(p1);
		driver.findElement(By.xpath("//a[text()='New Window']")).click();
		driver.close();
		
		driver.switchTo().window(p1);
		driver.findElement(By.xpath("//a[text()='New Window']")).click();
		
		
		
		
	}

}
