import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jayanth\\Desktop\\New folder\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Click Here")).click();
		ArrayList <String> newTb= new ArrayList <String> (driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		Thread.sleep(500);
		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		Thread.sleep(500);
		driver.switchTo().window(newTb.get(0));
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	}

}
