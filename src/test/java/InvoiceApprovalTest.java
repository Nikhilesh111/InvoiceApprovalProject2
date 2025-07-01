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

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InvoiceApprovalTest {

    private double amount;
    private String expectedResult;

    public InvoiceApprovalTest(double amount, String expectedResult) {
        this.amount = amount;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 20000.0, "Requires Manager Approval" },
                { -100.0, "Reject: Invalid amount" },
                { 5000.0, "Auto-Approved" }
        });
    }

    @Test
    public void testApproveInvoice() {
        String result = InvoiceApproval.approveInvoice(amount);
        assertEquals(expectedResult, result);
    }
}
