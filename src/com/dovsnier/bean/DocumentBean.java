/**
 * 
 */
package com.dovsnier.bean;

import java.io.Serializable;

/**
 * <pre>
 * DocumentBean
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public class DocumentBean implements Serializable {
	
	private static final long serialVersionUID = -8854895812793010134L;
	private RootNodeBean rootNode;
	private String alias;
	
	/**
	 * @return the rootNode
	 */
	public RootNodeBean getRootNode() {
		return rootNode;
	}
	
	/**
	 * @param rootNode
	 *            the rootNode to set
	 */
	public void setRootNode(RootNodeBean rootNode) {
		this.rootNode = rootNode;
	}
	
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	
	/**
	 * @param alias
	 *            the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
}
