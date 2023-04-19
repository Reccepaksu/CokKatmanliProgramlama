package oopWithNLayeredApp.entities;

public class product {

	private int id;
	private String isim;
	private double unitPrice;
	
	public product() {
		
	}

	public product(int id, String isim, double unitPrice) {
		super();
		this.id = id;
		this.isim = isim;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
}
