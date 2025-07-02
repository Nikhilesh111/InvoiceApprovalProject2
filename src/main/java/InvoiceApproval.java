import java.util.logging.Logger;

public class InvoiceApproval {
    private static final Logger logger = Logger.getLogger(InvoiceApproval.class.getName());

    public static String approveInvoice(double amount) {
        logger.info("Approving invoice for amount: " + amount);

        if (amount < 0) {
            logger.warning("Rejecting invoice due to invalid amount");
            return "Reject: Invalid amount";
        }
        if (amount > 10000) {
            logger.info("Invoice requires manager approval");
            return "Requires Manager Approval";
        }
        logger.info("Invoice auto-approved");
        return "Auto-Approved";
    }
}
