

package com.yami.shop.common.exception;

import com.yami.shop.common.enums.YamiHttpStatus;
import org.springframework.http.HttpStatus;

public class YamiShopBindException extends RuntimeException{

	/**
	 *
	 */
	private static final long serialVersionUID = -4137688758944857209L;

	/**
	 * http状态码
	 */
	private Integer httpStatusCode;

	private Object object;


	/**
	 * @param httpStatus http状态码
	 */
	public YamiShopBindException(YamiHttpStatus httpStatus) {
		super(httpStatus.getMsg());
		this.httpStatusCode = httpStatus.value();
	}

	/**
	 * @param httpStatus http状态码
	 */
	public YamiShopBindException(YamiHttpStatus httpStatus, String msg) {
		super(msg);
		this.httpStatusCode = httpStatus.value();
	}


	public YamiShopBindException(String msg) {
		super(msg);
		this.httpStatusCode = HttpStatus.BAD_REQUEST.value();
	}

	public YamiShopBindException(String msg, Object object) {
		super(msg);
		this.httpStatusCode = HttpStatus.BAD_REQUEST.value();
		this.object = object;
	}

	public Integer getHttpStatusCode() {
		return httpStatusCode;
	}

}
