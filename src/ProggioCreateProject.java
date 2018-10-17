
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProggioCreateProject {

    public static void main(String[] args) {

        // Basic set up to use Chrome browser
        System.setProperty("webdriver.chrome.driver", "E:\\Program Files (x86)\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to the specified url
        driver.get("https://app.proggio.com/login");

        // Finding element by id and sendKey(input) new value
        WebElement emailElement = driver.findElement(By.id("input-email"));
        WebElement passwordElement = driver.findElement(By.id("input-password"));
        emailElement.sendKeys("");
        passwordElement.sendKeys("");

        // WebDriverWait required
        // Figured out I need to "wait" between web reloads
        // "Create Project" and "New Project" by class/cssSelector
        WebElement createProject = driver.findElement(By.cssSelector("input[class='sc-bdVaJa laHbOK]"));
        createProject.click();

        driver.quit();
    }

}
