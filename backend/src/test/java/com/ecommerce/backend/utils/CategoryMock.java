package com.ecommerce.backend.utils;

import com.ecommerce.backend.entities.Category;

public class CategoryMock {

	public static Category create() {
		Category category = new Category();
		category.setName("Electronics");
		return category;
	}

}