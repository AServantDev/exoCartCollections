package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<Produit> cartItem = new ArrayList<Produit>();

	public void addProductToCartByPID(int pid) {

		addToCart(getProductByProductID(pid -1));
		System.out.println("Stand ajouté!");

	};

	private Produit getProductByProductID(int pid) {

		Produits prod = new Produits();
		List<Produit> products = prod.getProducts();
		return products.get(pid);

	};

	private void addToCart(Produit product) {

		if (product.getStock() <= 0) {

			System.out.println("Sorry there's no " + product.getName() + " in stock for now...");

		} else {

			cartItem.add(product);

		}

		// addProduct

	};

	public void removeProductByPID(int pid) {

		if (cartItem.contains(pid)) {

			cartItem.remove(pid);

		} else {

			System.out.println("Product with ID " + pid + " is not Found.");

		}
	};

	void printCartItems() {

		for (Object obj : cartItem) {
			System.out.println(obj);
		}

	};

}
