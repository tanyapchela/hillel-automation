package com.ithillel.pages;

import org.openqa.selenium.WebDriver;

abstract public class Page {
    protected final WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public abstract void open();

    public abstract void ensureOpened();
}
