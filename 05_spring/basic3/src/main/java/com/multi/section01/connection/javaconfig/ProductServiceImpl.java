package com.multi.section01.connection.javaconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	
	private final ProductDAO productDAO;
	private final SqlSessionTemplate sqlSession;
	
	public ProductServiceImpl(ProductDAO productDAO ,SqlSessionTemplate sqlSession ) {
		
		this.productDAO = productDAO;
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<ProductDTO> selectProductList(){
		return productDAO.selectProductList(sqlSession);
		
	};
	
	 

}
