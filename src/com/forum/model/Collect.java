package com.forum.model;

/**
 * Collect entity. @author MyEclipse Persistence Tools
 */

public class Collect implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String CId;
	private String IId;
	private String ITable;

	// Constructors

	/** default constructor */
	public Collect() {
	}

	/** full constructor */
	public Collect(String id, String CId, String IId, String ITable) {
		this.id = id;
		this.CId = CId;
		this.IId = IId;
		this.ITable = ITable;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCId() {
		return this.CId;
	}

	public void setCId(String CId) {
		this.CId = CId;
	}

	public String getIId() {
		return this.IId;
	}

	public void setIId(String IId) {
		this.IId = IId;
	}

	public String getITable() {
		return this.ITable;
	}

	public void setITable(String ITable) {
		this.ITable = ITable;
	}

}