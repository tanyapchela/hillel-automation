package com.ithillel.utils;

import java.io.IOException;
import java.util.Properties;

import static java.lang.System.getProperty;

public class ConfigProvider {
    private static final String CONFIG_PATH = "config.properties";
    private static final Properties prop = initProperties();

    public static final String BROWSER = prop.getProperty("browser");
    public static final String BROWSER_URL = prop.getProperty("base.url");
    private ConfigProvider() {

    }

    private static Properties initProperties() {
        Properties prop = new Properties();
        try {
            prop.load(ClassLoader.getSystemResourceAsStream(CONFIG_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }return prop;
    }
}

