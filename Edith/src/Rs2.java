import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rs2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jayanth\\Desktop\\New folder\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		System.out.println(driver.findElement(By.cssSelector("div[class='brand greenLogo']")).getText());
		String	logo = driver.findElement(By.cssSelector("div[class='brand greenLogo']")).getText();
		String[] words=logo.split("K");
		System.out.println(words[0] +"-K"+ words[1]);
		
//		List <WebElement> items=driver.findElements(By.cssSelector("h4[class='product-name']"));
//		for (WebElement item : items)
//			if (item.getText().contains("Tomato")) {
//				item.click();
//				
//			}
		
		
		
		
		
	}

}
