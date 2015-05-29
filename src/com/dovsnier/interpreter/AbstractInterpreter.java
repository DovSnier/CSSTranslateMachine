/**
 * 
 */
package com.dovsnier.interpreter;

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
	
	/**
	 * the parsed css style documents that maybe is file or directory <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @param path
	 *            the current your decide directory
	 */
	public abstract void parseCssDocuments(String path);
	
	/**
	 * the parsed css style document with your decide <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @param path
	 * @param name
	 */
	public abstract void parseCssDocument(String path, String name);
}
