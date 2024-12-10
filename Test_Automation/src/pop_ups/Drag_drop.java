package pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Drag_drop {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/drag?sublist=2");
		driver.manage().window().maximize();
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\DELL\\Desktop\\DDT testdata1.csv");
		Action a=new Action() {
			
			@Override
			public void perform() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
