package com.bus.util;

import org.springframework.http.HttpStatus;

public enum ApplicationEnum {

	//SUCCESS HANDLERS
	
	BUS_INFO_SUCCESS_RESPONSE(HttpStatus.OK,"DATA AVAILABLE","SUCCESS","BUS1000"),
	

	;
	

	HttpStatus httpStatus;
	String message;
	String status;
	String internalCode;
	private ApplicationEnum(HttpStatus httpStatus, String message, String status, String internalCode) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.status = status;
		this.internalCode = internalCode;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public String getStatus() {
		return status;
	}
	public String getInternalCode() {
		return internalCode;
	}
	
	
	
	
	
	
}
