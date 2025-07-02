package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.support.ui.*;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class InvoiceApprovalSeleniumTest {

    private WebDriver driver;
    private WebDriverWait wait;

    private static final String INVOICE_FORM_URL = "https://nikhilesh111.github.io/InvoiceApprovalProject2/";

    @Before
    public void setUp() throws Exception {
        String USERNAME = "nikhileshpatil_jTs84x";
        String AUTOMATE_KEY = "EdGzA6iqE65YVp1qp6Yd";

        String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY +
                "@hub-cloud.browserstack.com/wd/hub";

        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("browserName", "Chrome");
        caps.setCapability("browserVersion", "latest");

        Map<String, Object> bstackOptions = new HashMap<>();
        bstackOptions.put("os", "Windows");
        bstackOptions.put("osVersion", "11");
        bstackOptions.put("buildName", "Invoice Test Build");
        bstackOptions.put("sessionName", "Invoice Form Test");

        caps.setCapability("bstack:options", bstackOptions);

        driver = new RemoteWebDriver(new URL(URL), caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testInvoiceFormAutoApproved() {
        driver.get(INVOICE_FORM_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
        driver.findElement(By.id("amount")).sendKeys("5000");
        driver.findElement(By.id("submitBtn")).click();
        String result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
        assertEquals("Auto-Approved", result);
    }

    @Test
    public void testInvoiceFormManagerApproval() {
        driver.get(INVOICE_FORM_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
        driver.findElement(By.id("amount")).sendKeys("15000");
        driver.findElement(By.id("submitBtn")).click();
        String result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
        assertEquals("Requires Manager Approval", result);
    }

    @Test
    public void testInvoiceFormReject() {
        driver.get(INVOICE_FORM_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
        driver.findElement(By.id("amount")).sendKeys("-100");
        driver.findElement(By.id("submitBtn")).click();
        String result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
        assertEquals("Reject: Invalid amount", result);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // BrowserStack session ends
        }
    }
}
