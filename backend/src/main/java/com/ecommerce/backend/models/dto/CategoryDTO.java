package com.ecommerce.backend.models.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import com.ecommerce.backend.entities.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDTO implements Serializable {

	private UUID uuid;

	private String name;

	private Date createAt;

	private Date updatedAt;

	public CategoryDTO(Category category) {
		this.uuid = category.getUuid();
		this.name = category.getName();
		this.createAt = category.getCreatedAt();
		this.updatedAt = category.getUpdatedAt();
	}

}