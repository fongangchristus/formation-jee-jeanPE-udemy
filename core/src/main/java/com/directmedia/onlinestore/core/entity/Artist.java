/**
 * 
 */
package com.directmedia.onlinestore.core.entity;

import java.io.Serializable;

/**
 * @author Christus
 *
 */
public class Artist implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public Artist(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public Artist() {
		
	}
	
	

}
