package ui.tests.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class SessionHelper {

    public WebDriver wd;
    private NavigationHelper navigationHelper;
    private BaseHelper baseHelper;
    private Properties properties;


    public WebDriver initChromeWebDriver() {
        this.wd = new ChromeDriver();
        this.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return wd;
    }


    public Properties initProperties() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream("src/test/resources/config.properties"));

        return properties;
    }

    public NavigationHelper goTo() {
        navigationHelper = new NavigationHelper(this.wd);
        return navigationHelper;
    }


}