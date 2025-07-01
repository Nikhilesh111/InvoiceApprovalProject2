public class InvoiceApproval {
    public static String approveInvoice(double amount) {
        if (amount < 0) return "Reject: Invalid amount";
        if (amount > 10000) return "Requires Manager Approval";
        return "Auto-Approved";
    }
}

// Add a simple print statement inside a method or test, for example:

System.out.println("Test change to verify Jenkins build!");
