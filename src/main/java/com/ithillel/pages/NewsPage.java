package com.ithillel.pages;

import com.ithillel.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewsPage extends Page {

    private static final String URL = "https://blog.ithillel.ua";
    @FindBy(id = "news")
    WebElement news;
    @FindBy(className = "page-header")
    WebElement header;
    @FindBy(className = "main-navigation-bottom__item")
    List<WebElement> themes;

    public NewsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @Override
    public void open() {
        driver.get(URL);
    }

    @Override
    public void ensureOpened() {
        WaitUtils.waitUntilElementIsVisible(driver, header);
    }

    public void goToTheme(String theme) {
        for (WebElement element :
                themes) {
            if (element.getText().equalsIgnoreCase(theme)) {
                element.click();
                break;
            }
        }
    }

    public int getNewsCount() {
        String newsCount = news.findElement(By.className("tags__filter-type-value")).getText();
        return Integer.parseInt(newsCount);
    }
}
