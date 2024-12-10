package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_pop_up {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Html%20files/popup.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\DELL\\Desktop\\DDT testdata.csv");
		//ele.sendKeys("C:\\Users\\DELL\\Desktop\\api jar files");
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\DELL\\Desktop\\api files");

		//driver.navigate().back();
		
		/*driver.navigate().to("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.findElement(By.id("customButton")).sendKeys("C:\\Users\\DELL\\Desktop\\DDT testdata1.csv");*/
		
		
	}

}
