package com.ecommerce.backend.models.exceptions;

import java.io.Serializable;
import java.time.Instant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ResponseError implements Serializable {

	private Instant timestamp;

	private Integer status;

	private String error;

	private String message;

	private String path;

}
