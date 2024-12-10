package scroll_screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic_Photo {

	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.name("email"));
		String name = ele.getAttribute("name");
		System.out.println(name);
		Thread.sleep(2000);
		
		//Generic_Photo.getPhoto(driver);
		
	}

}
