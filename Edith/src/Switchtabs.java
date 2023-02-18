import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtabs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanth\\Desktop\\New folder\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("opentab")).click();
		ArrayList <String> newTb= new ArrayList<String> (driver.getWindowHandles());
		System.out.println(driver.switchTo().window(newTb.get(1)));
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		System.out.println(driver.switchTo().window(newTb.get(0)));
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
	}

}
