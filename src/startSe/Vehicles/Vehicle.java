package startSe.Vehicles;

public class Vehicle {
	private String manufacturer;
	private String model;
	private int year;
	private float price;
	
	public Vehicle(String manufacturer, String model, int year, float price) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
