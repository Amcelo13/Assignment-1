import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement; 
public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Chetan");
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Patel");
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("QA Engineer");
        WebElement education = driver.findElement(By.id("radio-button-2"));
        education.click();

        WebElement sex = driver.findElement(By.id("checkbox-1"));
        sex.click();

        WebElement experience = driver.findElement(By.cssSelector("option[value='1']"));
        experience.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("06/15/2024");
        date.sendKeys(Keys.RETURN);
        
        Thread.sleep(2000); // Just to see the datepicker in action, can be removed
        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();

        driver.quit();
    }
}
