import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class pract1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jayanth\\Desktop\\New folder\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		System.out.println(driver.findElement(By.linkText("ProtoCommerce")).getText());
		driver.findElement(By.xpath("//ul[@class='navbar-nav']/li[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='navbar-nav']/li[2]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.name("name")).sendKeys("Even dead i'm the hero");
		Thread.sleep(500);
		driver.findElement(By.name("email")).sendKeys("rajamohanreddy880@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("RAgNAR");
		Thread.sleep(500);
		// Actions ac=new Actions(driver);

		driver.findElement(By.id("exampleCheck1")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for='exampleCheck1']")).getText());
		Thread.sleep(500);
		WebElement elem = driver.findElement(By.cssSelector("select#exampleFormControlSelect1"));
		Select se = new Select(elem);
		se.selectByVisibleText("Female");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#inlineRadio1")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#inlineRadio2")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input#inlineRadio3")).isEnabled();
		Thread.sleep(500);
		driver.findElement(By.name("bday")).sendKeys("21-05-1997");
		
		
	}

}
