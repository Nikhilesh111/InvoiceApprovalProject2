public class InvoiceApproval {
    public static String approveInvoice(double amount) {
        System.out.println("Approving invoice for amount123: " + amount); // 🔥 New line
        if (amount < 0)
            return "Reject: Invalid amount";
        if (amount > 10000)
            return "Requires Manager Approval";
        return "Auto-Approved";
    }

}
