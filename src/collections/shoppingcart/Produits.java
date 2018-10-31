package collections.shoppingcart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Produits {
	

	private final List<Produit> products = new ArrayList<Produit>();

	public Produits() {
		this.initStoreItems();
	};

	public List<Produit> getProducts() {

		return products;
	};

	public void initStoreItems() {

		Produit prod = new Produit(1, "Star Platinum", 125.63, 1);
		Produit prod2 = new Produit(2, "The World", 777.77, 1);
		Produit prod3 = new Produit(3, "Hermit Purple", 455.63, 1);
		
		products.add(prod);
		products.add(prod2);
		products.add(prod3);
	};

}
