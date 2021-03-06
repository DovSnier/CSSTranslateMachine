/**
 * 
 */
package com.dovsnier.interpreter;

import com.dovsnier.exception.CssStyleSheetException;

/**
 * <pre>
 * AbstractInterpreter
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public abstract class AbstractInterpreter {
	
	/** the current class signature */
	protected String TAG = this.getClass().getSimpleName().substring((this.getClass().getSimpleName().lastIndexOf(".") + 1));
	/** the default value */
	public static final long DEFAULT = -1l;
	/** the operation result success code */
	public static final long FAIL = -2l;
	/** the operation result fail code */
	public static final long SUCCESS = -3l;
	
	/**
	 * the parsed css style documents that maybe is file or directory <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @param path
	 *            the current your decide directory
	 */
	public abstract void parseCssDocuments(final String path);
	
	/**
	 * the parsed css style document with your decide <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @param path
	 *            the current your decide directory
	 * @param name
	 *            the current css file name
	 * 
	 * @throws CssStyleSheetException
	 */
	public abstract void parseCssDocument(final String path, final String name) throws CssStyleSheetException;
}
