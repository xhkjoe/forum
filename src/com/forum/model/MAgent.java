package com.forum.model;

/**
 * MAgent entity. @author MyEclipse Persistence Tools
 */

public class MAgent implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String UId;
	private String PId;

	// Constructors

	/** default constructor */
	public MAgent() {
	}

	/** full constructor */
	public MAgent(String id, String UId, String PId) {
		this.id = id;
		this.UId = UId;
		this.PId = PId;
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

	public String getPId() {
		return this.PId;
	}

	public void setPId(String PId) {
		this.PId = PId;
	}

}