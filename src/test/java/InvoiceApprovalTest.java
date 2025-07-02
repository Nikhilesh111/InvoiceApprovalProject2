// import static org.junit.Assert.assertEquals;
// import org.junit.Test;

// public class InvoiceApprovalTest {

//     @Test
//     public void testAutoApproval() {
//         assertEquals("Auto-Approved", InvoiceApproval.approveInvoice(5000));
//     }

//     @Test
//     public void testManagerApproval() {
//         assertEquals("Requires Manager Approval", InvoiceApproval.approveInvoice(20000));
//     }

//     @Test
//     public void testRejectInvalid() {
//         assertEquals("Reject: Invalid amount", InvoiceApproval.approveInvoice(-100));
//     }
// }

// import org.junit.Test;
// import static org.junit.Assert.*;
// import org.junit.runner.RunWith;
// import org.junit.runners.Parameterized;
// import java.util.*;

// @RunWith(Parameterized.class)
// public class InvoiceApprovalTest {

//     private double amount;
//     private String expected;

//     public InvoiceApprovalTest(double amount, String expected) {
//         this.amount = amount;
//         this.expected = expected;
//     }

//     @Parameterized.Parameters
//     public static Collection<Object[]> data() {
//         return Arrays.asList(new Object[][] {
//                 { -100.0, "Reject: Invalid amount" },
//                 { 5000.0, "Auto-Approved" },
//                 { 20000.0, "Requires Manager Approval" }
//         });
//     }

//     @Test
//     public void testApproveInvoice() {
//         assertEquals(expected, InvoiceApproval.approveInvoice(amount));
//     }
// }

// import static org.junit.Assert.assertEquals;

// import java.util.Arrays;
// import java.util.Collection;

// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.junit.runners.Parameterized;

// @RunWith(Parameterized.class)
// public class InvoiceApprovalTest {

//     private double amount;
//     private String expectedResult;

//     public InvoiceApprovalTest(double amount, String expectedResult) {
//         this.amount = amount;
//         this.expectedResult = expectedResult;
//     }

//     @Parameterized.Parameters
//     public static Collection<Object[]> data() {
//         return Arrays.asList(new Object[][] {
//                 { 20000.0, "Requires Manager Approval" },
//                 { -100.0, "Reject: Invalid amount" },
//                 { 5000.0, "Auto-Approved" }
//         });
//     }

//     @Test
//     public void testApproveInvoice() {
//         String result = InvoiceApproval.approveInvoice(amount);
//         assertEquals(expectedResult, result);
//     }
// }

import static org.junit.Assert.*;
import org.junit.Test;

public class InvoiceApprovalTest {

    @Test
    public void testNegativeAmount() {
        assertEquals("Reject: Invalid amount", InvoiceApproval.approveInvoice(-100));
    }

    @Test
    public void testAmountOver10000() {
        assertEquals("Requires Manager Approval", InvoiceApproval.approveInvoice(15000));
    }

    @Test
    public void testAmountUnder10000() {
        assertEquals("Auto-Approved", InvoiceApproval.approveInvoice(5000));
    }
}

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

// ✅ Replace with a publicly accessible version of your HTML (you can use
GitHub
// Pages or Netlify)
private static final String INVOICE_FORM_URL =
"https://nikhilesh111.github.io/InvoiceApprovalProject2/";

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
String result =
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
assertEquals("Auto-Approved", result);
}

@Test
public void testInvoiceFormManagerApproval() {
driver.get(INVOICE_FORM_URL);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
driver.findElement(By.id("amount")).sendKeys("15000");
driver.findElement(By.id("submitBtn")).click();
String result =
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
assertEquals("Requires Manager Approval", result);
}

@Test
public void testInvoiceFormReject() {
driver.get(INVOICE_FORM_URL);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount")));
driver.findElement(By.id("amount")).sendKeys("-100");
driver.findElement(By.id("submitBtn")).click();
String result =
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result"))).getText();
assertEquals("Reject: Invalid amount", result);
}

@After
public void tearDown() {
if (driver != null) {
driver.quit(); // BrowserStack session ends
}
}
}
