package com.ithillel.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.awaitility.Awaitility.await;

public class Button {
    private final WebElement button;

    public Button(WebDriver driver, String xpath) {
        button = driver.findElement(By.xpath(xpath));
    }

    public Button(WebElement elem) {
        button = elem;
    }

    public Button(WebDriver driver, By locator) {
        button = driver.findElement(locator);
    }

    public void stubbornClick() {
        while (button.isDisplayed()) {
            button.click();
        }
    }

    public void click() {
        await().atLeast(500, TimeUnit.MILLISECONDS).until(button::isDisplayed);
        button.click();

    }

    public void doubleClick() {
        button.click();
        button.click();
    }

    public boolean isClickable() {
        return new AtomicBoolean(button.isDisplayed() && button.isEnabled()).get();
    }
}
