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

import com.dovsnier.bean.Attribute;
import com.dovsnier.bean.DocumentBean;
import com.dovsnier.bean.NodeBean;
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
		File file = new File(absolutePath, name);
		DocumentBean document = null;
		RootNodeBean rootNode = null;
		NodeBean node = null;
		try {
			if (!file.exists()) {
				String msg = "the current " + absolutePath + name + " is not found exception.";
				throw new FileNotFoundException(msg);
			} else {
				document = new DocumentBean();
				rootNode = new RootNodeBean();
				document.setAlias(alias.substring(0, alias.lastIndexOf(".")));
				document.setRootNode(rootNode);
			}
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			String lineData = "";
			StringBuffer sbCache = new StringBuffer();
			// TODO the handle parse css style sheet
			while (null != (lineData = br.readLine())) {
				if ("".equalsIgnoreCase(lineData)) { // TODO the current line is empty line that belong to text format category
				} else if (lineData.contains("{") && lineData.contains("}")) { // TODO the current line exist node bean with one or more, and need careful analysis
				} else if (lineData.contains("{") && !lineData.contains("}")) { // TODO the current line exist node bean that is not entire,and need continue ready
					node = new NodeBean();
					String nodeName = lineData;
					nodeName = nodeName.replace("{", "").trim();
					node.setNodeName(nodeName);
				} else if (!lineData.contains("{") && lineData.contains("}")) {// TODO the current line exist node bean that maybe is node bean ended symbol or item node bean ended symbol
					rootNode.getRootNode().add(node);// the add node to root node or not to item node
					// the add node to item node or not to root node
				} else if (!lineData.contains("{") && !lineData.contains("}")) {// TODO the current line exist node bean that maybe is node bean attribute or item node bean attribute
					if (lineData.contains(";")) { // these maybe is node bean attribute or item node bean attribute
						Attribute attribute = new Attribute();
						String kvPair = lineData;
						kvPair = kvPair.replace(";", "").trim();
						String[] kvContainer = kvPair.split(":");
						if (null != kvContainer) {
							attribute.setKey(kvContainer[0].trim());
							attribute.setValue(kvContainer[1].trim());
						} else {
						}
						node.getAttribute().add(attribute);
					}
				}
				sbCache.append(lineData);
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
