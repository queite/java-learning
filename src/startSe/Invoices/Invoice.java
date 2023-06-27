package startSe.Invoices;

public class Invoice {
	private int id;
	private String description;
	private int qty;
	private float price;

	public Invoice(int id, String description, int qty, float price) {
		this.setId(id);
		this.setDescription(description);
		this.setQty(qty);
		this.setPrice(price);
	}

	public double getInvoiceAmount() {
		return (double) this.getQty() * this.getPrice();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = (qty < 0) ? 0 : qty;
		;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = (price < 0) ? 0 : price;
	}
}
