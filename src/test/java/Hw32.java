import com.ithillel.driver.WebDriverFactory;
import com.ithillel.utils.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hw32 {
    public static void main(String[] args) {
        findElement();
    }

    private static void findElement() {
        WebDriver driver = WebDriverFactory.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.get(ConfigProvider.BROWSER_URL);
        driver.navigate().to(ConfigProvider.BROWSER_URL + "/courses/qa-automation-kiev");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("courses-menu")));
    }
}
