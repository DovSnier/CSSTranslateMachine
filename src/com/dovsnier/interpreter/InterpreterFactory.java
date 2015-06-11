/**
 * 
 */
package com.dovsnier.interpreter;

import com.dovsnier.exception.CssStyleSheetException;

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

	private static AbstractInterpreter abstractInterpreter = null;

	/**
	 * the initialization interpreter engine <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @return AbstractInterpreter.SUCCESS value or AbstractInterpreter.FAIL value
	 */
	public static long initInterpreterEngine() {
		synchronized (InterpreterFactory.class) {
			if (null == abstractInterpreter) {
				abstractInterpreter = new Interpreter();
			} else {
				abstractInterpreter = null;
				abstractInterpreter = new Interpreter();
			}
		}
		return AbstractInterpreter.SUCCESS;
	}

	/**
	 * the parsed css style document with your decide <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @param path
	 *            the absolute path
	 * @param name
	 *            the fiile name
	 */
	public synchronized static void parseCssDocument(String path, String name) {
		if (null == abstractInterpreter) {
			String msg = "the current you not initialization interpreter engine,maybe is fatal.";
			throw new NullPointerException(msg);
		} else if (null == path || "".equals(path)) {
			String msg = "the currrent path parameter is null, maybe is fatal.";
			throw new IllegalArgumentException(msg);
		} else if (null == name || "".equals(name)) {
			String msg = "the currrent name parameter is null, maybe is fatal.";
			throw new IllegalArgumentException(msg);
		} else {
			try {
				abstractInterpreter.parseCssDocument(path, name);
			} catch (CssStyleSheetException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * the parsed html document with your decide <br>
	 * 2015-6-11
	 * 
	 * @version 0.0.1
	 * @param path
	 *            the absolute path
	 * @param name
	 *            the fiile name
	 */
	public synchronized static void parseHtmlDocument(String path, String name) {

	}

	/**
	 * the destroy interpreter engine <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @return
	 */
	public static long destoryInterpreterEngine() {
		synchronized (InterpreterFactory.class) {
			if (null != abstractInterpreter) {
				abstractInterpreter = null;
			}
		}
		return AbstractInterpreter.SUCCESS;
	}
}