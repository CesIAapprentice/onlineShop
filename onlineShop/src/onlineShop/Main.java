package onlineShop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storehouse store = new Storehouse();
		store.addProduct("cofee", 5, 10);
		store.addProduct("milk", 3, 20);
		store.addProduct("milkbutter", 2, 55);
		store.addProduct("bread", 7, 8);
		
		Shop shop = new Shop(store, new Scanner("bread" + "\n" + "milk" + "\n" + "milk" + "\n" + "\n"));
		shop.manage("Pekka");
	}
}