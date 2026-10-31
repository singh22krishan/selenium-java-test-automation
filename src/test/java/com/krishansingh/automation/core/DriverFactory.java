package com.krishansingh.automation.core;

import java.time.Duration;
import java.util.Locale;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class DriverFactory {

    private DriverFactory() {
    }

    public static WebDriver createDriver() {
        String browser = System.getProperty("browser", "chrome").toLowerCase(Locale.ROOT);
        boolean headless = Boolean.parseBoolean(System.getProperty("headless", "false"));

        WebDriver driver = switch (browser) {
            case "firefox" -> new FirefoxDriver(firefoxOptions(headless));
            case "edge" -> new EdgeDriver(edgeOptions(headless));
            case "chrome" -> new ChromeDriver(chromeOptions(headless));
            default -> throw new IllegalArgumentException(
                    "Unsupported browser: " + browser + ". Use chrome, firefox, or edge."
            );
        };

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        return driver;
    }

    private static ChromeOptions chromeOptions(boolean headless) {
        ChromeOptions options = new ChromeOptions();
        if (headless) {
            options.addArguments("--headless=new", "--window-size=1920,1080");
        }
        return options;
    }

    private static FirefoxOptions firefoxOptions(boolean headless) {
        FirefoxOptions options = new FirefoxOptions();
        if (headless) {
            options.addArguments("-headless");
        }
        return options;
    }

    private static EdgeOptions edgeOptions(boolean headless) {
        EdgeOptions options = new EdgeOptions();
        if (headless) {
            options.addArguments("--headless=new", "--window-size=1920,1080");
        }
        return options;
    }
}
