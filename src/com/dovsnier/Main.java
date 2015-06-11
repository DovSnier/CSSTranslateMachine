/**
 * 
 */
package com.dovsnier;

import com.dovsnier.interpreter.AbstractInterpreter;
import com.dovsnier.interpreter.InterpreterFactory;

/**
 * <pre>
 * Main
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public class Main {

	protected static String path = "c:\\temp";
	protected static String name = "register.css";

	/**
	 * <br>
	 * 2015年5月29日
	 * 
	 * @version 0.0.1
	 * @param args
	 */
	public static void main(String[] args) {
		testCSSParseMode();
	}

	/**
	 * <br>
	 * 2015-6-11
	 * 
	 * @version 0.0.1
	 */
	protected static void testCSSParseMode() {
		if (AbstractInterpreter.SUCCESS == InterpreterFactory.initInterpreterEngine()) {
			InterpreterFactory.parseCssDocument(path, name); // TODO the parse css style document
		} else {
			System.err.println("the initialize engine is failure.");
		}
	}
}
