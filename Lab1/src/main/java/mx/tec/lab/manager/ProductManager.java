/**
 * 
 */
package mx.tec.lab.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mx.tec.lab.vo.Product;
import mx.tec.lab.vo.Sku;
/**
 * Product manager class
 * @author giogurt
 *
 */
@Service
public class ProductManager {
	private List<Product> products;

	/**
	 * Product manager constructor
	 */
	public ProductManager() {
		products = new ArrayList<>();
		
		Product product1 = new Product("prod123", "Levi's 501 Original Fit Jeans Jeans para Hombre", "100% algodón, Cierre de Cremallera, Lavar a máquina, Jeans corte ajustado, Pierna ajustada, Stretch especial que te brinda mayor movilidad", Collections.emptyList());
		List<Sku> childSkus1 = new ArrayList<>();		
		childSkus1.add(new Sku("sku1234", "Black", "29W X 32L", 1027.24, 1027.24, 1000,"https://dummyimage.com/100x100/000/fff",
				"https://dummyimage.com/250x2500/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		childSkus1.add(new Sku("sku1235", "Dark Stonewash", "29W X 32L", 1027.24, 706.93, 100,"https://dummyimage.com/100x100/000/fff",
				"https://dummyimage.com/250x2500/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		product1.setChildSkus(childSkus1);
		
		products.add(product1);
		
		Product product2 = new Product("prod124", "Levi's Innovation Super Skinny Jeans para Mujer", "85% Algodón, 9% Elastomultiester, 6% Elastano, Lavar a máquina, Pantalón, Mezclilla, Cintura Media, Ajustado Desde la Cadera al Muslo, Pierna Súper Ajustada", Collections.emptyList());
		List<Sku> childSkus2 = new ArrayList<>();		
		childSkus2.add(new Sku("sku1236", "Black Galaxy", "25W X 30L", 661.79, 661.79, 150, "https://dummyimage.com/100x100/000/fff",
				"https://dummyimage.com/250x2500/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		childSkus2.add(new Sku("sku1237", "Black Galaxy", "26W X 30L", 661.79, 661.79, 420, "https://dummyimage.com/100x100/000/fff",
				"https://dummyimage.com/250x2500/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		childSkus2.add(new Sku("sku1238", "Black Galaxy", "27W X 30L", 661.79, 661.79, 599, "https://dummyimage.com/100x100/000/fff",
				"https://dummyimage.com/250x2500/000/fff",
				"https://dummyimage.com/500x500/000/fff"));
		product2.setChildSkus(childSkus2);
		
		products.add(product2);
		
	}
	
	/**
	 * shows all the products
	 * @return list of products
	 */
	public List<Product> getProducts() {
		return products;
	}
	
	/**
	 * get an specific product with the id
	 * @param id
	 * @return found product
	 */
	public Optional<Product> getProduct(final String id) {
		Optional<Product> foundProduct = Optional.empty();
		
		for (final Product product : products) {
			if (product.getId().equals(id)) {
				foundProduct = Optional.of(product);
				break;
			}
		}
		return foundProduct;
	}
	/**
	 *  add a new product
	 * @param newProduct
	 * @return new product created
	 */
	public Optional<Product> addProduct(final Product newProduct) {
		products.add(newProduct);
		return Optional.of(newProduct);
	}
	
	/**
	 * updates a product in the list
	 * @param productToEdit
	 * @param newProduct
	 * @return the updated product
	 */
	public Optional<Product> updateProduct(final Product productToEdit, final Product newProduct) {
		if(products.contains(productToEdit)) {
			products.remove(productToEdit);
			products.add(newProduct);
		}
		return Optional.of(newProduct);
	}
	
	/**
	 * deletes a product
	 * @param productToDelete
	 */
	public void deleteProduct(final Product productToDelete) {
		if(products.contains(productToDelete)) {			
			products.remove(productToDelete);
		}
		
	}
	



}
