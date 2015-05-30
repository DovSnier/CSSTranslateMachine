/**
 * 
 */
package com.dovsnier.bean;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * RootNodeBean
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public class RootNodeBean implements Serializable {
	
	private static final long serialVersionUID = 5524241521741106467L;
	private List<NodeBean> rootNode = new LinkedList<NodeBean>();
	
	/**
	 * @return the rootNode
	 */
	public List<NodeBean> getRootNode() {
		return rootNode;
	}
	
	/**
	 * @param rootNode
	 *            the rootNode to set
	 */
	public void setRootNode(List<NodeBean> rootNode) {
		this.rootNode = rootNode;
	}
}
