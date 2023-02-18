import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyColumnValue {

    public static void main(String[] args) {
        
         //Database details
        String dbUrl = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "password";
        String query = "SELECT column_name FROM mytable WHERE id = 1";
        
         //Expected value from database
        String expectedValue = null;
        try {
            Connection con = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                expectedValue = rs.getString("column_name");
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
         //Launch browser and navigate to page
        System.setProperty("webdriver.chrome.driver", "pathtochromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("httpexample.com");

         //Retrieve actual value from UI
        WebElement element = driver.findElement(By.id("element-id"));
        String actualValue = element.getText();
        
         //Compare expected and actual values
        if (expectedValue.equals(actualValue)) {
            System.out.println("Value is verified successfully.");
        } else {
            System.out.println("Value verification failed.");
        }
        
         //Close the browser
        driver.quit();
    }

}