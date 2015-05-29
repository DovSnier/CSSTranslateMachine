/**
 * 
 */
package com.dovsnier.interpreter;

/**
 * <pre>
 * InterpreterFactory
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public class InterpreterFactory {
	
	/**
	 * the initialization interpter engine <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @return
	 */
	public static long initInterpreterEngine() {
		return AbstractInterpreter.DEFAULT;
	}
	
	/**
	 * the destory interpter engine <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @return
	 */
	public static long destoryInterpreterEngine() {
		return AbstractInterpreter.DEFAULT;
	}
}
