package my_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensions {

	public static void main(String[] args) throws InterruptedException 
	{
		
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Dimension d=new Dimension(300, 700);
			driver.manage().window().setSize(d);
			Thread.sleep(2000);
			Point p=new Point(500, 10);
			driver.manage().window().setPosition(p);
			driver.manage().window().maximize();
			
			driver.navigate().to("https://www.youtube.com/results?search_query=women+fitness");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.navigate().forward();
			Thread.sleep(1000);
			driver.navigate().refresh();
			
			driver.navigate().to("https://www.facebook.com/");
			WebElement ele = driver.findElement(By.id("email"));
			int hight = ele.getSize().getHeight();
			int width = ele.getSize().getWidth();
			System.out.println(hight);
			System.out.println(width);
			driver.navigate().to("https://demoapps.qspiders.com/ui/toggle?sublist=0");
			
			
			
	}

}
