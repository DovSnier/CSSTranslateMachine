/**
 * 
 */
package com.dovsnier.interpreter;

import org.junit.Test;

/**
 * <pre>
 * InterpreterTest
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 * 
 */
public class InterpreterTest {
	
	private String path = "c:\\temp";
	private String name = "nav-note.css";
	
	// private String name = "nav.css";
	// private String expected = "";
	/**
	 * Test method for {@link com.dovsnier.interpreter.Interpreter#parseCssDocument(java.lang.String, java.lang.String)}.
	 */
	// @Test(expected = FileNotFoundException.class)
	@Test
	public void testParseCssDocument() {
		Interpreter interpreter = new Interpreter();
		interpreter.parseCssDocument(path, name);
		// fail("Not yet implemented");
	}
}
