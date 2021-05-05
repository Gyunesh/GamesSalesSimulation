package Business;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService {

	@Override
	public void add(Product product) {
		System.out.println("Product added : "+product.getProductName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Product updated : "+product.getProductName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Product deleted : "+product.getProductName());
		
	}

}
