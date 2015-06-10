package com.forum.model;

/**
 * Focus entity. @author MyEclipse Persistence Tools
 */

public class Focus implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String FId;
	private String bfId;

	// Constructors

	/** default constructor */
	public Focus() {
	}

	/** full constructor */
	public Focus(String id, String FId, String bfId) {
		this.id = id;
		this.FId = FId;
		this.bfId = bfId;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFId() {
		return this.FId;
	}

	public void setFId(String FId) {
		this.FId = FId;
	}

	public String getBfId() {
		return this.bfId;
	}

	public void setBfId(String bfId) {
		this.bfId = bfId;
	}

}