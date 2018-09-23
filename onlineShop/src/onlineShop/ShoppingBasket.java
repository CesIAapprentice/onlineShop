package onlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
	
	private Map<String, Purchase> shoppingBasket;
	
// ---------------------------------------------------------------------------------------
// CONSTRUCTOR		
	
	public ShoppingBasket() {
		this.shoppingBasket = new HashMap<String, Purchase>();
	}
	
// ---------------------------------------------------------------------------------------
// METHODS	
	
	public void add (String product, int price) {
		if(!this.shoppingBasket.containsKey(product)) {
			Purchase thisPurchase = new Purchase(product, 1, price);
			this.shoppingBasket.put(product, thisPurchase);
		} else {
			this.increaseAmount(product);
		}
	}
	
	public int price() {
		Integer result = 0;
		for (Purchase purchase : this.shoppingBasket.values()) {
			result += purchase.price();
		}
		return result;
	}
	
	public void print() {
		for(Purchase purchase : this.shoppingBasket.values()) {
			System.out.println(purchase);
		}
	}
	
	public void increaseAmount(String product) {
		this.shoppingBasket.get(product).setAmount(this.shoppingBasket.get(product).getAmount()+1);
	}
	
// ---------------------------------------------------------------------------------------
// GETTERS & SETTERS		

	public Map<String, Purchase> getShoppingBasket() {
		return shoppingBasket;
	}

	public void setShoppingBasket(Map<String, Purchase> shoppingBasket) {
		this.shoppingBasket = shoppingBasket;
	}
}