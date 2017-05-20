/**
 * 
 */
package com.dct.dao;

import java.util.List;

import com.dct.entities.*;

/**
 * @author Administrator
 *
 */
public interface ProductDAO {
    public void saveOrUpdate(ProductEntity productEntity);
    public void delete(int productId);
    public ProductEntity get(int productId);
    public List<ProductEntity> list();
}
