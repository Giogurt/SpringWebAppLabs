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
 * @author alejandroperez
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
		childSkus1.add(new Sku("sku1234", "Black", "29W X 32L", 1027.24, 1027.24, 500,"https://dummyimage.com/50x50/000/0011ff",
				"https://dummyimage.com/200x200/000/0011ff",
				"https://dummyimage.com/500x500/000/0011ff"));
		childSkus1.add(new Sku("sku1235", "Dark Stonewash", "29W X 32L", 1027.24, 706.93, 200,"https://dummyimage.com/50x50/000/0011ff",
				"https://dummyimage.com/200x200/000/0011ff",
				"https://dummyimage.com/500x500/000/0011ff"));
		product1.setChildSkus(childSkus1);
		
		products.add(product1);
		
		Product product2 = new Product("prod124", "Levi's Innovation Super Skinny Jeans para Mujer", "85% Algodón, 9% Elastomultiester, 6% Elastano, Lavar a máquina, Pantalón, Mezclilla, Cintura Media, Ajustado Desde la Cadera al Muslo, Pierna Súper Ajustada", Collections.emptyList());
		List<Sku> childSkus2 = new ArrayList<>();		
		childSkus2.add(new Sku("sku1236", "Black Galaxy", "25W X 30L", 661.79, 661.79, 300, "https://dummyimage.com/50x50/000/0011ff",
				"https://dummyimage.com/200x200/000/0011ff",
				"https://dummyimage.com/500x500/000/0011ff"));
		childSkus2.add(new Sku("sku1237", "Black Galaxy", "26W X 30L", 661.79, 661.79, 400, "https://dummyimage.com/50x50/000/0011ff",
				"https://dummyimage.com/200x200/000/0011ff",
				"https://dummyimage.com/500x500/000/0011ff"));
		childSkus2.add(new Sku("sku1238", "Black Galaxy", "27W X 30L", 661.79, 661.79, 800, "https://dummyimage.com/50x50/000/0011ff",
				"https://dummyimage.com/200x200/000/0011ff",
				"https://dummyimage.com/500x500/000/0011ff"));
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
	 * updates the products in the list
	 * @param oldProduct
	 * @param newProduct
	 * @return the updated product
	 */
	public Optional<Product> updateProduct(final Product oldProduct, final Product newProduct) {
		if(products.contains(oldProduct)) {
			products.remove(oldProduct);
			products.add(newProduct);
		}
		return Optional.of(newProduct);
	}
	
//  VERSION PROFE	
//	public void updateProduct(final String id, final Product modifiedProduct) {
//		final Optional<Product> existingProduct = getProduct(id);
//		
//		if (existingProduct.isPresent()) {
//			final Product product = existingProduct.get();
//			product.setId(modifiedProduct.getId());
//			product.setName(modifiedProduct.getName());
//			product.setDescription(modifiedProduct.getDescription());
//			product.setChildSkus(modifiedProduct.getChildSkus());
//		}
//	}
	
	
	/**
	 * deletes a specific product
	 * @param existingProduct
	 */
	public void deleteProduct(final Product existingProduct) {
		products.remove(existingProduct);
		
	}
	



}
