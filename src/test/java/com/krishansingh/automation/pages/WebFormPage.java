package com.krishansingh.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebFormPage {

    public static final String URL = "https://www.selenium.dev/selenium/web/web-form.html";

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final By textInput = By.name("my-text");
    private final By submitButton = By.cssSelector("button[type='submit']");
    private final By confirmationMessage = By.id("message");

    public WebFormPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebFormPage open() {
        driver.get(URL);
        wait.until(ExpectedConditions.titleContains("Web form"));
        return this;
    }

    public WebFormPage enterText(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(textInput)).sendKeys(value);
        return this;
    }

    public void submit() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public String confirmationText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage)).getText();
    }
}
