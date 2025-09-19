import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSample {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
        
        // Add ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        
        // Create a new instance of ChromeDriver with options
        WebDriver driver = new ChromeDriver(options);

        try {
            // Visit Google
            driver.get("http://www.google.com");

            // Find the search box by name
            WebElement element = driver.findElement(By.name("q"));

            // Type something and submit
            element.sendKeys("Apple By Issac");
            element.submit();

            // Print the title
            System.out.println("Page title is: " + driver.getTitle());
            
            // Keep the browser open until user presses Enter
            System.out.println("Press Enter to close the browser...");
            System.in.read();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser when user presses Enter
            if (driver != null) {
                driver.quit();
            }
        }
    }
}