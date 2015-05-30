/**
 * 
 */
package com.dovsnier.exception;

/**
 * <pre>
 * CssStyleSheetException
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public class CssStyleSheetException extends Exception {
	
	private static final long serialVersionUID = 5503677508397054048L;
	
	/**
	 * 
	 */
	public CssStyleSheetException() {
		super();
	}
	
	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public CssStyleSheetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	/**
	 * @param message
	 * @param cause
	 */
	public CssStyleSheetException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * @param message
	 */
	public CssStyleSheetException(String message) {
		super(message);
	}
	
	/**
	 * @param cause
	 */
	public CssStyleSheetException(Throwable cause) {
		super(cause);
	}
}
