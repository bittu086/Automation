import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Eone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jayanth\\Desktop\\New folder\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//button[text()='Practice']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[value='radio2']")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='radio2'")).getText());
		Thread.sleep(500);
		driver.findElement(By.id("autocomplete")).sendKeys("ni");
		Thread.sleep(500);
		List<WebElement> autosuggs = driver.findElements(
				By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li"));
		for (WebElement autosugg : autosuggs)
			if (autosugg.getText().equalsIgnoreCase("Estonia")) {
				autosugg.click();
				System.out.println("Option is Selected successfully");
				break;
			} else {
				System.out.println("The option you're looking is not found");
			}
		Thread.sleep(500);
		driver.findElement(By.id("dropdown-class-example")).click();
		WebElement stdropdown =driver.findElement(By.id("dropdown-class-example"));
		Select se= new Select(stdropdown);
		se.selectByValue("option3");
		Thread.sleep(500);
		se.selectByValue("option1");
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.xpath("//legend[text()='Switch To Alert Example']")).getText());
		driver.findElement(By.cssSelector("input#name")).sendKeys("BJORN");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#confirmbtn")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(500);
		a.accept();
		System.out.println(driver.findElement(By.xpath("//legend[text()='Element Displayed Example']")).getText());
		
		WebElement caps=driver.findElement(By.cssSelector("input.displayed-class"));
		Actions ac=new Actions(driver);
		ac.moveToElement(caps).click().keyDown(Keys.SHIFT).sendKeys("edith").build().perform();
		ac.keyUp(Keys.SHIFT);
		Thread.sleep(500);
//		driver.findElement(By.id("hide-textbox")).click();
//		Thread.sleep(500);
//		driver.findElement(By.cssSelector("input.displayed-class")).isEnabled();
//		Thread.sleep(500);
//		driver.findElement(By.id("hide-textbox")).click();
//		driver.findElement(By.cssSelector("input.displayed-class")).isEnabled();
		System.out.println(driver.findElement(By.cssSelector("input.displayed-class")).getAttribute("style"));
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println(driver.findElement(By.cssSelector("input.displayed-class")).getAttribute("style"));
		if (driver.findElement(By.cssSelector("input.displayed-class")).getAttribute("style").contains("block"))
{
		System.out.println("Element is disabled");
}
		else {
			System.out.println("Element is not disabled");
		}
		Thread.sleep(500);
		ac.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		Thread.sleep(300);
		driver.findElement(By.xpath("//a[text()='Top']")).click();
		driver.switchTo().frame(0);
//		driver.findElement(By.linkText("https://courses.rahulshettyacademy.com/courses")).click();
		
		
		
		
		
		
		
		
	}

}
