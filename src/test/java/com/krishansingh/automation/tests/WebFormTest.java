package com.krishansingh.automation.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krishansingh.automation.core.BaseUiTest;
import com.krishansingh.automation.pages.WebFormPage;

class WebFormTest extends BaseUiTest {

    @Test
    void submitsWebFormAndDisplaysConfirmation() {
        WebFormPage page = new WebFormPage(driver)
                .open()
                .enterText("Selenium portfolio test");

        page.submit();

        assertEquals("Received!", page.confirmationText());
    }
}
