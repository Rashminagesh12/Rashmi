package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_login {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("login-username")).sendKeys("rashminagesh124");
		//Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login-passwd")).sendKeys("Bhavik@2023");
		//Thread.sleep(2000);
		driver.findElement(By.name("verifyPassword")).click();
		//driver.findElement(By.xpath("//a[.='Not now']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.id("ybarMailLink")).click();
		//driver.findElement(By.className("icon mail")).click();
		//Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@role='button']"));
		//Thread.sleep(2000);
		ele.click();
		
		
		
		//driver.findElement(By.id("tpa-google-button")).click();
		//driver.findElement(By.xpath("//div[text()='rashminagesh129@gmail.com']"));
	}

}
