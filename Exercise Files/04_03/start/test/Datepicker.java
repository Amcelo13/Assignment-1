import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateField = driver.findElement(By.id("datepicker"));
        dateField.click();

        // Simulate typing a date
        dateField.sendKeys("01/01/2026");

        Thread.sleep(1000);  // Pause to see the date entered
        dateField.sendKeys(Keys.RETURN);   // Close the datepicker? - Ans =

        driver.quit();
    }
}