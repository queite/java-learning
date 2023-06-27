package startSe.Invoices;

public class RunInvoice {
	
	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "something", -3, 25.0f);
		
		System.out.println("Total " + invoice.getInvoiceAmount());
	}
}
