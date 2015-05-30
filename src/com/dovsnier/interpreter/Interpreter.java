/**
 * 
 */
package com.dovsnier.interpreter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import com.dovsnier.bean.DocumentBean;
import com.dovsnier.bean.RootNodeBean;

/**
 * <pre>
 * Interpreter
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public class Interpreter extends AbstractInterpreter {
	
	private Writer writer = null;
	private Reader reader = null;
	private BufferedReader br = null;
	
	/*
	 * @see com.dovsnier.interpreter.AbstractInterpreter#parseCssDocuments(java.lang.String)
	 */
	@Override
	public void parseCssDocuments(String path) {
	}
	
	/*
	 * @see com.dovsnier.interpreter.AbstractInterpreter#parseCssDocument(java.lang.String, java.lang.String)
	 */
	@Override
	public void parseCssDocument(String path, String name) {
		String absolutePath = detectionParameterSuffix(path);
		String alias = name;
		RootNodeBean rootNode;
		File file = new File(absolutePath, name);
		DocumentBean document = null;
		try {
			if (!file.exists()) {
				String msg = "the current " + absolutePath + name + " is not found exception.";
				throw new FileNotFoundException(msg);
			} else {
				document = new DocumentBean();
				document.setAlias(alias.substring(0, alias.lastIndexOf(".")));
				rootNode = new RootNodeBean();
				document.setRootNode(rootNode);
			}
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			StringBuffer sb = new StringBuffer();
			String lineData = "";
			// TODO the handle parse css style sheet
			while (null != (lineData = br.readLine())) {
				sb.append(lineData);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != br) {
				try {
					br.close();
					if (null != reader) {
						reader.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private String detectionParameterSuffix(String path) {
		String absolutePath = path;
		String assertValue = path;
		assertValue = assertValue.substring(assertValue.length() - 1);
		if (!"\\".equals(assertValue)) {
			absolutePath += "\\";
		}
		return absolutePath;
	}
}
