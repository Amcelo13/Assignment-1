import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {
        // Disable Selenium and ChromeDriver logging
        System.setProperty("webdriver.chrome.silentOutput", "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        
        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
            "--remote-allow-origins=*",
            "--disable-logging",
            "--log-level=3"
        );
        
        // Suppress the CDP version warning
        System.setProperty("webdriver.chrome.verboseLogging", "false");
        
        // Create ChromeDriver instance
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Meaghan Lewis");

        WebElement button =  driver.findElement(By.id("button"));
        System.out.println(button.getText()); // Print button text before clicking
        button.click();

        driver.quit();
    }
}
