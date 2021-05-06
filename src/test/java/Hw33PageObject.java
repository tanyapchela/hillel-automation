import com.ithillel.driver.WebDriverFactory;
import com.ithillel.pages.JavaBasic;
import com.ithillel.utils.DataProvider;
import org.openqa.selenium.WebDriver;

public class Hw33PageObject {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver();
        driver.get("https://ithillel.ua/courses/introduction-kiev");
        JavaBasic javaPage = new JavaBasic(driver);
        System.out.println(javaPage.getCourseTitle());
        System.out.println(javaPage.getCourseRate());
        System.out.println(javaPage.getCourseDescription());
        System.out.println(javaPage.getCourseGoals());
    }
}
