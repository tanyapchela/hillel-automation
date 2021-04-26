package com.ithillel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JavaBasic {
    private final WebDriver driver;

    public JavaBasic(WebDriver driver) {
        this.driver = driver;
    }

    public String getCourseTitle() {
        WebElement element = driver.findElement(By.className("course-descriptor_header-text"));
        return element.getText();
    }

    public String getCourseRate() {
        WebElement element = driver.findElement(By.className("course-rating_average"));
        return element.getText();
    }

    public String getCourseDescription() {
        List<WebElement> elements = driver.findElements(By.className("course-description_p"));
        StringBuilder description = new StringBuilder();
        for (WebElement element :
                elements) {
            description.append(element.getText()).append("\n");
        }
        return description.toString();
    }

    public String getCourseGoals() {
        List<WebElement> elements = driver.findElement(By.className("unordered-list")).findElements(By.tagName("li"));
        StringBuilder goals = new StringBuilder();
        for (WebElement element :
                elements) {
            goals.append(element.getText()).append("\n");
        }
        return goals.toString();
    }
}
