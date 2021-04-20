package com.ithillel.driver;

import org.openqa.selenium.WebDriver;

public class CloseDriveHook implements Runnable {
    private final WebDriver driver;

    public CloseDriveHook(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void run() {
        this.driver.quit();
    }
}
