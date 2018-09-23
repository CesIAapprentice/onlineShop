package onlineShop;

public class Purchase {
	
	private String product;
	private Integer amount, unitPrice;

// ---------------------------------------------------------------------------------------
// CONSTRUCTOR	
	
	public Purchase(String product, Integer amount, Integer unitPrice) {
		this.product = product;
		this.amount = amount;
		this.unitPrice = unitPrice;
	}

// ---------------------------------------------------------------------------------------
// METHODS
	
	public int price() {
		return this.amount * this.unitPrice;
	}
	
	public String toString() {
		return this.product + " : " + this.amount;
	}

// ---------------------------------------------------------------------------------------
// GETTERS & SETTERS		
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
}