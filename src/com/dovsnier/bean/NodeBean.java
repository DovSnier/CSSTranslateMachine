/**
 * 
 */
package com.dovsnier.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * <pre>
 * NodeBean
 * </pre>
 * 
 * @author dovsnier
 * @version 1.0.0
 * @since jdk 1.7
 */
public class NodeBean implements Serializable {
	
	private static final long serialVersionUID = 5991461693066020378L;
	private String annotation;
	private String nodeName;
	private ArrayList<Attribute> attribute = new ArrayList<Attribute>();
	private LinkedList<NodeBean> itemNode = new LinkedList<NodeBean>();
	
	/**
	 * @return the annotation
	 */
	public String getAnnotation() {
		return annotation;
	}
	
	/**
	 * @param annotation
	 *            the annotation to set
	 */
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	
	/**
	 * @return the nodeName
	 */
	public String getNodeName() {
		return nodeName;
	}
	
	/**
	 * @param nodeName
	 *            the nodeName to set
	 */
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	
	/**
	 * @return the attribute
	 */
	public ArrayList<Attribute> getAttribute() {
		return attribute;
	}
	
	/**
	 * @param attribute
	 *            the attribute to set
	 */
	public void setAttribute(ArrayList<Attribute> attribute) {
		this.attribute = attribute;
	}
	
	/**
	 * @return the itemNode
	 */
	public LinkedList<NodeBean> getItemNode() {
		return itemNode;
	}
	
	/**
	 * @param itemNode
	 *            the itemNode to set
	 */
	public void setItemNode(LinkedList<NodeBean> itemNode) {
		this.itemNode = itemNode;
	}
}
