package basic_scripts;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ascending_using_Treeset {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");
		
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		TreeSet<String> set=new TreeSet<String>();
		
		List<WebElement> opt = s.getOptions();
		for(WebElement we:opt)
		{
			String text = we.getText();
			set.add(text);
		}
		for(String t1:set)
		{
			System.out.println(t1);
		}
	}

}
