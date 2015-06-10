package com.forum.model;

/**
 * MMessage entity. @author MyEclipse Persistence Tools
 */

public class MMessage implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String UId;
	private String UDetail;

	// Constructors

	/** default constructor */
	public MMessage() {
	}

	/** full constructor */
	public MMessage(String id, String UId, String UDetail) {
		this.id = id;
		this.UId = UId;
		this.UDetail = UDetail;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUId() {
		return this.UId;
	}

	public void setUId(String UId) {
		this.UId = UId;
	}

	public String getUDetail() {
		return this.UDetail;
	}

	public void setUDetail(String UDetail) {
		this.UDetail = UDetail;
	}

}