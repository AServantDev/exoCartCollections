package collections.shoppingcart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class UI {
	Cart cart = new Cart();
	private int ch = 0;

	public UI() {
		menu();
	}

	public void startScreen() {
		System.out.println("1. Display Store Products");
		System.out.println("2. Display Cart");
		System.out.println("0. Exit");

		switch (getUserInput()) {

		case 0:
			menu();
			break;
		case 1:
			displayStoreProducts();
			break;
		case 2:
			showCart();
			break;
		}

	}

	public void storeProductsMenu() {
		System.out.println("1. Add to Cart");
		System.out.println("2. Remove From Cart");
		System.out.println("0. Exit");

		switch (getUserInput()) {

		case 0:
			System.out.println("Goodbye!");
			break;
		case 1:
			System.out.println("Which Stand do you want to add to your cart?");
			addProductToCart();
			break;
		case 2:
			System.out.println("Which Stand do you want to remove to your cart?");
			showCart();
			break;
		}
	}

	public void menu() {

		System.out.println("1. Start Menu");
		System.out.println("2. Store product menu");
		System.out.println("0. Exit");

		switch (getUserInput()) {

		case 0:
			System.out.println("Goodbye!");
			break;
		case 1:
			startScreen();
			break;
		case 2:
			storeProductsMenu();
			break;
		}

	};

	private int getUserInput() throws NumberFormatException {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;

	};

	private void displayStoreProducts() {

		Produits produits = new Produits();
		
		
		ListIterator<Produit> iterator = produits.getProducts().listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		

	};

	private void addProductToCart() {

		displayStoreProducts();
		
		
		cart.addProductToCartByPID(getUserInput());
		
		System.out.println("1. Display Store Products");
		System.out.println("2. Display Cart");
		System.out.println("0. Exit");

		switch (getUserInput()) {

		case 0:
			menu();
			break;
		case 1:
			displayStoreProducts();
			break;
		case 2:
			showCart();
			break;
		}

	};

	private void showCart() {

		
		cart.printCartItems();
//		List<Object> myCart = new ArrayList<Object>();
//		Iterator<Object> iterator = myCart.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	};

	private void removeProductFromCart() {

	};

}