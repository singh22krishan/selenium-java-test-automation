package com.krishansingh.automation.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public abstract class BaseUiTest {
    protected WebDriver driver;

    @BeforeEach
    void setUpDriver() {
        driver = DriverFactory.createDriver();
    }

    @AfterEach
    void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
