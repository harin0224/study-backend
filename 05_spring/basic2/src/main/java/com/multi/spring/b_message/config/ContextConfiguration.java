package com.multi.spring.b_message.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.multi.spring.b_message.Beverage;
import com.multi.spring.b_message.Bread;
import com.multi.spring.b_message.Product;
import com.multi.spring.b_message.ShoppingCart;

@Configuration
@PropertySource("product-info.properties")
public class ContextConfiguration {

	// 치환자 (placeholder) 문법을 활용해서 프로퍼티즈 파일의 키값으로 value 값을 얻어옴
	@Value("${bread.carpbread.name:붕어빵}") // :붕어빵 오타시 초기값 지정
	private String carpBreadName;

	@Value("${bread.carpbread.name:붕어빵}") // :붕어빵 오타시 초기값 지정
	private String carpBreadName2;

	@Value("${bread.carpbread.name:붕어빵}") // :붕어빵 오타시 초기값 지정
	private String carpBreadName3;

	@Value("${bread.carpbread.price:0}") // :0 오타시 초기값 지정
	private int carpBreadPrice;

	private String milkName;
	private int milkPrice;
	private int milkCapacity;

	// 메소드 형식으로 bean 생성
	@Bean
	public Product carpBread() {
		return new Bread(carpBreadName, carpBreadPrice, new java.util.Date());

	}

	@Bean
	public Product milk() {

		return new Beverage(milkName, milkPrice, milkCapacity);
	}

	@Bean
	public Product water(@Value("${beverage.water.name:}") String waterName,
			@Value("${beverage.water.price:0}") int waterPrice,
			@Value("${beverage.water.capacity:0}") int waterCapacity) {

		return new Beverage(waterName, waterPrice, waterCapacity);
	}

	@Bean
	public ShoppingCart cart() {
		return new ShoppingCart();
	}

}