package com.multi.section02.mapperscan.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.multi.section02.mapperscan.model.dto.ProductDTO;



public interface ProductDAO {

	List<ProductDTO> selectProductList();

}
