package junit;

import com.ithillel.pages.NewsPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class Hw40NewsTest extends UiTest {
    @Parameterized.Parameters(name = "theme={0},count={1}")
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{{"Front-End", 4}, {"QA", 3}, {"PM", 3}, {"Маркетинг", 7}});
    }

    @Parameterized.Parameter(0)
    public String theme;
    @Parameterized.Parameter(1)
    public int newsCount;


    private final NewsPage page = new NewsPage(driver);

    @Test
    public void disciplinesCountTest() {
        page.open();
        page.goToTheme(theme);
        Assert.assertEquals(newsCount, page.getNewsCount());
    }
}
