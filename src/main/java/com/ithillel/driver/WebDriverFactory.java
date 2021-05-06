package com.ithillel.driver;

import com.ithillel.utils.ConfigProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    private static final String BROWSER = System.getProperty("browser");
    private static WebDriver driver;

    public static WebDriver getDriver() {
        String browserType = BROWSER != null ? BROWSER : ConfigProvider.BROWSER;
        WebDriver driver = null;
        try {
            driver = getDriver(Browser.valueOf(browserType.toUpperCase()));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Runtime.getRuntime().addShutdownHook(new Thread(new CloseDriveHook(driver)));
        return driver;
    }

    public static WebDriver getDriver(Browser browser) throws IllegalAccessException {
        switch (browser) {
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            case OPERA:
                return getOperaDriver();
            case SAFARI:
                return getSafariDriver();
            default:
                throw new IllegalAccessException("Wrong brouser type provided");

        }
    }

    private static WebDriver getChromeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    private static WebDriver getSafariDriver() {
        if (driver == null) {
            driver = new SafariDriver();
        }
        return driver;
    }

    private static WebDriver getOperaDriver() {
        if (driver == null) {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
        }
        return driver;
    }

    private static WebDriver getFirefoxDriver() {
        if (driver == null) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;

    }


}