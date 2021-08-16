/**
 * 
 */
package mx.tec.lab.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import mx.tec.lab.manager.ProductManager;
import mx.tec.lab.vo.Product;

/**
 * productController class
 * @author alejandroperez
 */
@RestController
public class ProductController {
	
	@Resource
	private ProductManager productManager;
	/**
	 * The end point for GET {url}/products
	 * @return status 200 if there are products
	 */
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> products = productManager.getProducts();
		
		ResponseEntity<List<Product>> responseEntity = new ResponseEntity<>(products, HttpStatus.OK);
		return responseEntity;
	}
	/**
	 * The end point for GET {url}/products/{id}
	 * @param id
	 * @return status 200 if the specific product id is found or 204 if is not found
	 */
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable(value = "id") String id) {
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		Optional<Product> product = productManager.getProduct(id);
		
		if (product.isPresent()) {
			responseEntity = new ResponseEntity<>(product.get(), HttpStatus.OK);
		}
		
		return responseEntity;
	}
	/**
	 * The end point for POST {url}/products
	 * @param newProduct
	 * @return status 201 if the new product content is correct or 400 if the data is not correct
	 */
	@PostMapping("/products")
	public ResponseEntity<Product> addProduct(@RequestBody Product newProduct) {
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		Optional<Product> product = productManager.addProduct(newProduct);
		
		if (product.isPresent()) {
			responseEntity = new ResponseEntity<>(product.get(), HttpStatus.CREATED);
		}
		
		return responseEntity;
	}
	/**
	 * The end point for PUT {url}/products/{id}
	 * @param id
	 * @param newProduct
	 * @return status 201 if the product id is found and the new product content is correct or 400 if the data is not correct
	 */
	@PutMapping("/products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") String id, @RequestBody Product newProduct) {
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		Optional<Product> product = productManager.getProduct(id);
		
		//Optional<Product> product = productManager.addProduct(newProduct);
		
		if (product.isPresent()) {
			Optional<Product> updatedProduct = productManager.updateProduct(product.get(), newProduct);
			responseEntity = new ResponseEntity<>(updatedProduct.get(), HttpStatus.CREATED);
		}
		
		return responseEntity;
	}
	
// VERSION PROFE
//	@PutMapping("/products/{id}")
//	public ResponseEntity<Product> updateProduct(@PathVariable(value = "id") String id, @RequestBody Product modifiedProduct) {
//		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		Optional<Product> product = productManager.getProduct(id);
//		
//		if (product.isPresent()) {
//			productManager.updateProduct(id, modifiedProduct);
//			responseEntity = new ResponseEntity<>(HttpStatus.OK);
//		}
//		
//		return responseEntity;
//	}
	/**
	 * The end point for DELETE {url}/products/{id}
	 * @param id
	 * @return status 200 if the product id is found or 204 if the product is not found
	 */
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable(value = "id") String id) {
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		Optional<Product> product = productManager.getProduct(id);
		
		if (product.isPresent()) {
			productManager.deleteProduct(product.get());
			responseEntity = new ResponseEntity<>(HttpStatus.OK);
		}
		
		return responseEntity;
	}
	
	

}


