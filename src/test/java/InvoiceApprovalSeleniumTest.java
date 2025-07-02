// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import static org.junit.Assert.*;

// public class InvoiceApprovalSeleniumTest {
// private WebDriver driver;

// @Before
// public void setUp() {
// // Set the path to your chromedriver executable here:
// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
// driver = new ChromeDriver();
// }

// @Test
// public void testInvoiceFormAutoApproved() throws InterruptedException {
// driver.get("file:///full/path/to/invoiceForm.html"); // use absolute path to
// file
// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();
// Thread.sleep(1000); // wait for result
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() throws InterruptedException {
// driver.get("file:///full/path/to/invoiceForm.html");
// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();
// Thread.sleep(1000);
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() throws InterruptedException {
// driver.get("file:///full/path/to/invoiceForm.html");
// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();
// Thread.sleep(1000);
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() {
// driver.quit();
// }
// }

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// import static org.junit.Assert.*;

// public class InvoiceApprovalSeleniumTest {
// private WebDriver driver;

// @Before
// public void setUp() {
// // Set path to chromedriver
// System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\HI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
// driver = new ChromeDriver();
// }

// @Test
// public void testInvoiceFormAutoApproved() throws InterruptedException {
// driver.get("file:///C:/Users/HI/Downloads/invoiceForm.html");
// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();
// Thread.sleep(1000);
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() throws InterruptedException {
// driver.get("file:///C:/Users/HI/Downloads/invoiceForm.html");
// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();
// Thread.sleep(1000);
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() throws InterruptedException {
// // driver.get("file:///C:/Users/HI/Downloads/invoiceForm.html");
// driver.get(
// "file:///C:/Users/HI/OneDrive/Desktop/InvoiceApprovalProject2/src/test/java/resources/invoiceForm.html");

// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();
// Thread.sleep(1000);
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() {
// if (driver != null) {
// driver.quit();
// }
// }
// }

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;

// import java.time.Duration;

// import static org.junit.Assert.*;

// public class InvoiceApprovalSeleniumTest {
// private WebDriver driver;
// private WebDriverWait wait;

// @Before
// public void setUp() {
// // Set path to chromedriver
// System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\HI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
// driver = new ChromeDriver();
// wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait timeout 10
// seconds
// }

// @Test
// public void testInvoiceFormAutoApproved() {
// driver.get("file:///C:/Users/HI/Downloads/invoiceForm.html");

// // Wait until amount input is visible
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));

// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();

// // Wait until result is visible after clicking
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));

// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() {
// driver.get("file:///C:/Users/HI/Downloads/invoiceForm.html");

// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));

// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();

// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));

// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() {
// driver.get(
// "file:///C:/Users/HI/OneDrive/Desktop/InvoiceApprovalProject2/src/test/java/resources/invoiceForm.html");

// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));

// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();

// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));

// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() {
// if (driver != null) {
// driver.quit();
// }
// }
// }

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;

// import java.time.Duration;

// import static org.junit.Assert.*;

// public class InvoiceApprovalSeleniumTest {
// private WebDriver driver;
// private WebDriverWait wait;

// // Put the file path in one place to avoid mistakes
// private static final String INVOICE_FORM_URL =
// "file:///C:/Users/HI/OneDrive/Desktop/InvoiceApprovalProject2/src/test/java/resources/invoiceForm.html";

// @Before
// public void setUp() {
// System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\HI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
// driver = new ChromeDriver();
// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// }

// @Test
// public void testInvoiceFormAutoApproved() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() {
// if (driver != null) {
// driver.quit();
// }
// }
// }

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;

// import java.time.Duration;

// import static org.junit.Assert.*;

// public class InvoiceApprovalSeleniumTest {
// private WebDriver driver;
// private WebDriverWait wait;

// // File URL of your HTML form (update this path if needed)
// private static final String INVOICE_FORM_URL =
// "file:///C:/Users/HI/OneDrive/Desktop/InvoiceApprovalProject2/src/test/java/resources/invoiceForm.html";

// @Before
// public void setUp() {
// System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\HI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
// driver = new ChromeDriver();
// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// }

// @Test
// public void testInvoiceFormAutoApproved() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() throws InterruptedException {
// if (driver != null) {
// Thread.sleep(5000); // Pause to see the browser before closing
// driver.quit();
// }
// }
// }

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;

// import java.time.Duration;

// import static org.junit.Assert.*;

// public class InvoiceApprovalSeleniumTest {
// private WebDriver driver;
// private WebDriverWait wait;

// // Put the file path here once
// private static final String INVOICE_FORM_URL =
// "file:///C:/Users/HI/OneDrive/Desktop/InvoiceApprovalProject2/src/test/java/resources/invoiceForm.html";

// @Before
// public void setUp() {
// System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\HI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
// driver = new ChromeDriver();
// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// }

// @Test
// public void testInvoiceFormAutoApproved() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() throws InterruptedException {
// System.out.println("Tests complete. Browser will remain open for
// debugging.");
// Thread.sleep(Long.MAX_VALUE); // Keeps browser open until you manually close
// it.
// // If you want to close browser automatically after a delay, replace above
// line
// // with:
// // Thread.sleep(5000); // wait 5 seconds
// // driver.quit();
// }
// }

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;

// import java.time.Duration;

// import static org.junit.Assert.*;

// public class InvoiceApprovalSeleniumTest {
// private WebDriver driver;
// private WebDriverWait wait;

// private static final String INVOICE_FORM_URL =
// "file:///C:/Users/HI/OneDrive/Desktop/InvoiceApprovalProject2/src/test/java/resources/invoiceForm.html";

// @Before
// public void setUp() {
// System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\HI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
// driver = new ChromeDriver();
// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// }

// @Test
// public void testInvoiceFormAutoApproved() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() throws InterruptedException {
// if (driver != null) {
// System.out.println("Tests complete. Browser will remain open for 30 seconds
// for debugging...");
// Thread.sleep(30000); // Wait 30 seconds before closing the browser
// driver.quit();
// }
// }
// }

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;

// import java.time.Duration;

// import static org.junit.Assert.assertEquals;

// public class InvoiceApprovalSeleniumTest {
// private WebDriver driver;
// private WebDriverWait wait;

// // Use HTTP URL served by your Python HTTP server here:
// private static final String INVOICE_FORM_URL =
// "http://localhost:9090/src/test/java/resources/invoiceForm.html";

// @Before
// public void setUp() {
// System.setProperty("webdriver.chrome.driver",
// "C:\\Users\\HI\\Downloads\\chromedriver-win64\\chromedriver.exe"); // Adjust
// path if needed
// driver = new ChromeDriver();
// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// }

// @Test
// public void testInvoiceFormAutoApproved() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
// String result = driver.findElement(By.id("result")).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() {
// if (driver != null) {
// driver.quit();
// }
// }
// }

package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.junit.Assert.*;

public class InvoiceApprovalSeleniumTest {
    private WebDriver driver;
    private WebDriverWait wait;

    // Ensure this path matches the actual location of your invoiceForm.html file
    private static final String INVOICE_FORM_URL = "file:///C:/Users/HI/OneDrive/Desktop/InvoiceApprovalProject2/src/test/java/resources/invoiceForm.html";

    @Before
    public void setUp() {
        // ✅ Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\HI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testInvoiceFormAutoApproved() {
        driver.get(INVOICE_FORM_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
        driver.findElement(By.id("amount")).sendKeys("5009");
        driver.findElement(By.id("submitBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("Auto-Approved", result);
    }

    @Test
    public void testInvoiceFormManagerApproval() {
        driver.get(INVOICE_FORM_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
        driver.findElement(By.id("amount")).sendKeys("1500000");
        driver.findElement(By.id("submitBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("Requires Manager Approval", result);
    }

    @Test
    public void testInvoiceFormReject() {
        driver.get(INVOICE_FORM_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
        driver.findElement(By.id("amount")).sendKeys("-100");
        driver.findElement(By.id("submitBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result")));
        String result = driver.findElement(By.id("result")).getText();
        assertEquals("Reject: Invalid amount", result);
    }

    @After
    public void tearDown() throws InterruptedException {
        if (driver != null) {
            System.out.println("Tests complete. Browser will remain open for 30 seconds for debugging...");
            Thread.sleep(10000); // Wait 30 seconds before closing the browser
            driver.quit();
        }
    }
}

// import org.junit.After;
// import org.junit.Before;
// import org.junit.Test;
// import org.openqa.selenium.*;
// import org.openqa.selenium.remote.*;
// import org.openqa.selenium.support.ui.*;

// import java.net.URL;
// import java.time.Duration;
// import java.util.HashMap;
// import java.util.Map;

// import static org.junit.Assert.*;

// public class InvoiceApprovalSeleniumTest {

// private WebDriver driver;
// private WebDriverWait wait;

// // ✅ Replace with a publicly accessible version of your HTML (you can use
// GitHub
// // Pages or Netlify)
// private static final String INVOICE_FORM_URL =
// "https://nikhilesh111.github.io/InvoiceApprovalProject2/";

// @Before
// public void setUp() throws Exception {
// String USERNAME = "nikhileshpatil_jTs84x";
// String AUTOMATE_KEY = "EdGzA6iqE65YVp1qp6Yd";

// String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY +
// "@hub-cloud.browserstack.com/wd/hub";

// MutableCapabilities caps = new MutableCapabilities();
// caps.setCapability("browserName", "Chrome");
// caps.setCapability("browserVersion", "latest");

// Map<String, Object> bstackOptions = new HashMap<>();
// bstackOptions.put("os", "Windows");
// bstackOptions.put("osVersion", "11");
// bstackOptions.put("buildName", "Invoice Test Build");
// bstackOptions.put("sessionName", "Invoice Form Test");

// caps.setCapability("bstack:options", bstackOptions);

// driver = new RemoteWebDriver(new URL(URL), caps);
// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// }

// @Test
// public void testInvoiceFormAutoApproved() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("5000");
// driver.findElement(By.id("submitBtn")).click();
// String result =
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
// assertEquals("Auto-Approved", result);
// }

// @Test
// public void testInvoiceFormManagerApproval() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("15000");
// driver.findElement(By.id("submitBtn")).click();
// String result =
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
// assertEquals("Requires Manager Approval", result);
// }

// @Test
// public void testInvoiceFormReject() {
// driver.get(INVOICE_FORM_URL);
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
// driver.findElement(By.id("amount")).sendKeys("-100");
// driver.findElement(By.id("submitBtn")).click();
// String result =
// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
// assertEquals("Reject: Invalid amount", result);
// }

// @After
// public void tearDown() {
// if (driver != null) {
// driver.quit(); // BrowserStack session ends
// }
// }
// }
