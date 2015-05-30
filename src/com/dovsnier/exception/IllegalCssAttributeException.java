/**
 * 
 */
package com.dovsnier.exception;

/**
 * <pre>
 * IllegalCssAttributeException
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public class IllegalCssAttributeException extends CssStyleSheetException {
	
	private static final long serialVersionUID = -6987005210720962812L;
	
	/**
	 * 
	 */
	public IllegalCssAttributeException() {
		super();
	}
	
	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public IllegalCssAttributeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	/**
	 * @param message
	 * @param cause
	 */
	public IllegalCssAttributeException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * @param message
	 */
	public IllegalCssAttributeException(String message) {
		super(message);
	}
	
	/**
	 * @param cause
	 */
	public IllegalCssAttributeException(Throwable cause) {
		super(cause);
	}
}
