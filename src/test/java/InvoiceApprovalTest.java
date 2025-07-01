import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class InvoiceApprovalTest {

    @Test
    public void testAutoApproval() {
        assertEquals("Auto-Approved", InvoiceApproval.approveInvoice(5000));
    }

    @Test
    public void testManagerApproval() {
        assertEquals("Requires Manager Approval", InvoiceApproval.approveInvoice(20000));
    }

    @Test
    public void testRejectInvalid() {
        assertEquals("Reject: Invalid amount", InvoiceApproval.approveInvoice(-100));
    }
}
