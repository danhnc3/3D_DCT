/**
 * 
 */
package com.dct.services;

import java.util.List;

import com.dct.models.*;

/**
 * @author Administrator
 *
 */
public interface ProductService {
	public List<Product> getListProduct();
	public void updateProduct(Product product);
}
