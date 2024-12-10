package basic_scripts;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Treeset_descending {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		TreeSet<String> t=new TreeSet<String>(Collections.reverseOrder());
		List<WebElement> opt = s.getOptions();
		for(WebElement we:opt)
		{
			String text = we.getText();
			t.add(text);
			
		}
		for(Object t1:t)
		{
			System.out.println(t1);
		}
		
	}
	
	}


