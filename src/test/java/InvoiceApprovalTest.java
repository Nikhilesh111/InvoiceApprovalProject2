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
