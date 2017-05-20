/**
 * 
 */
package com.dct.dao;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.dct.entities.ProductEntity;

/**
 * @author Administrator
 *
 */
public class ProductDAOImpl implements ProductDAO{
	private JdbcTemplate jdbcTemplate;
	
    public ProductDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public void saveOrUpdate(ProductEntity productEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ProductEntity get(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductEntity> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
