package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Title_Contains {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up")); // specifying the contains title condition id it satisfies then 
																						//it willpass the data to the element
		//wait.until(ExpectedConditions.urlContains("https://www.facebook.com/")); // specifying the urlcontains title condition id it satisfies then 
																					//it willpass the data to the element
		
		WebElement ele = driver.findElement(By.id("email"));
		
		wait.until(ExpectedConditions.visibilityOf(ele)); // it will check weather the element is visible or not if yes send data else throws exception
	
		ele.sendKeys("rashmi@gmail.com");
		
		

	}

}
