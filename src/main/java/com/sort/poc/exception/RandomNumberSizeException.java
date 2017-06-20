package com.sort.poc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Minimum Two Integers Required")
public class RandomNumberSizeException extends RuntimeException {

	/**
	 * Exception to handles if random number list is less than 2
	 */
	private static final long serialVersionUID = 1L;

	public RandomNumberSizeException(String exceptionMsg) {
		super(exceptionMsg);
	}

}