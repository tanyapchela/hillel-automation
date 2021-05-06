import com.ithillel.driver.WebDriverFactory;
import com.ithillel.utils.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Hw31TeachersList {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver();
        driver.get(ConfigProvider.BROWSER_URL);
        toProgramming(driver);
    }

    private static void toProgramming(WebDriver driver) {
        WebElement element = driver.findElement(By.className("course-cat-bar_body"));
        element.click();
        findFrontEnd(driver);
    }

    private static void findFrontEnd(WebDriver driver) {
        List<WebElement> elements = driver.findElements(By.className("profession-bar_title"));
        for (WebElement e : elements) {
            if (e.getText().equals("Front-End Basic")) {
                e.click();
                scrollToTeachers(driver);
                break;
            }
        }
    }

    private static void scrollToTeachers(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("modal-quiz-trigger")));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,3100);");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("coach-card_content")));
        printTeachers(driver);
    }

    private static void printTeachers(WebDriver driver) {
        List<WebElement> elements = driver.findElement(By.id("swiper-coaches")).findElements(By.className("coach-card_name"));
        for (WebElement e : elements
        ) {
            System.out.println(e.getAttribute("textContent"));
        }
    }
}
