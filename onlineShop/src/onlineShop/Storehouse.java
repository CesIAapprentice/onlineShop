package onlineShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
	private Map<String, Integer> prices;
	private Map<String, Integer> stock;
	
// ---------------------------------------------------------------------------------------
// CONSTRUCTOR
	
	public Storehouse() {
		this.prices = new HashMap<String, Integer>();
		this.stock = new HashMap<String, Integer>();
	}
	
// ---------------------------------------------------------------------------------------
// METHODS	

	
	public void addProduct(String product, Integer price, Integer stock) {
		this.stock.put(product, stock);
		this.prices.put(product, price);
	}
	
	public Integer price (String product) {
		return this.prices.get(product);
	}
	
	public Integer stock (String product) {
		return this.stock.get(product);
	}
	
	public boolean take(String product) {
		if(this.stock.get(product) > 0) {
			this.stock.put(product, this.stock(product) - 1);
			return true;
		} return false;
	}
	
	public Set<String> products (){
		return this.stock.keySet();
	}
	
// ---------------------------------------------------------------------------------------
// GETTERS & SETTERS		

	public Map<String, Integer> getPrices() {
		return prices;
	}

	public void setPrices(Map<String, Integer> prices) {
		this.prices = prices;
	}

	public Map<String, Integer> getStock() {
		return stock;
	}

	public void setStock(Map<String, Integer> stock) {
		this.stock = stock;
	}
}
