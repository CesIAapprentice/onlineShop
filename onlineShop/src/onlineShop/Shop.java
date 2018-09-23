package onlineShop;

import java.util.Scanner;

public class Shop {
	
	private Storehouse store;
	private Scanner reader;
	
// ---------------------------------------------------------------------------------------
// CONSTRUCTOR		
	
	public Shop(Storehouse store, Scanner reader) {
		this.store = store;
		this.reader = reader;
	}
	
// ---------------------------------------------------------------------------------------
// METHODS
	
	public void manage(String customer) {
		ShoppingBasket basket = new ShoppingBasket();
		System.out.println("Welcome to our shop " + customer);
		System.out.println("Below is our sale offer: ");
		
		for(String product : store.products()) {
			System.out.println(product);
		}
		
		while (true) {
			System.out.print("what do you want to buy (press enter to pay):");
			String product = reader.nextLine();
			if (product.isEmpty()){
				break;
			}
			
			// fill with the appropriate code
			if (!store.getStock().keySet().contains(product)) {
				System.out.println("Product not in store");
			}
			
			if(store.take(product) == false) {
				System.out.println("Product out of stock");
			}
			
			basket.add(product, store.price(product));			
		}
		
		System.out.println("your purchases are:");
		basket.print();
		System.out.println("basket price: " + basket.price());
	}
}
