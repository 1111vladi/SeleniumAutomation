
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProggioCreateProject {

    public static void main(String[] args) {

        String proggioLogin = "https://app.proggio.com/login";

        // Basic set up to use Chrome browser
        System.setProperty("webdriver.chrome.driver", "E:\\Program Files (x86)\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);

        // Navigate to the specified url
        driver.get(proggioLogin);

        // Complete Login
        WebElement emailElement = driver.findElement(By.id("input-email"));
        WebElement passwordElement = driver.findElement(By.id("input-password"));
        emailElement.sendKeys("");
        passwordElement.sendKeys("");
        WebElement signIn = driver.findElement(By.id("button-login"));
        signIn.click();

        // TODO - Check how to efficiently wait between actions
        // TODO - Fix the action collision below
        // use xpath at a last resort
        // Open new Project
        WebElement newProg = (wait).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"My Projects\"]/div[3]/div[1]/div[2]/div")));
        newProg.click();

        // Click on the avatar icon and sign out
        WebElement avatarClick = (wait).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"button-user-profile\"]/div/div")));
        avatarClick.click();
        WebElement signOut = driver.findElement(By.id("link-profile-sign-out"));
        signOut.click();



        //driver.quit();
    }

}
