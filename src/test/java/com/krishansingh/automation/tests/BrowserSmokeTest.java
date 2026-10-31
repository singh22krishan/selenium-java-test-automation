package com.krishansingh.automation.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.krishansingh.automation.core.BaseUiTest;
import com.krishansingh.automation.pages.WebFormPage;

class BrowserSmokeTest extends BaseUiTest {

    @Test
    void opensSeleniumWebForm() {
        driver.get(WebFormPage.URL);
        assertTrue(driver.getTitle().contains("Web form"));
        assertTrue(driver.getCurrentUrl().contains("selenium.dev"));
    }
}
