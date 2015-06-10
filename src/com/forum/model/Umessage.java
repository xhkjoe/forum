package com.forum.model;

import java.sql.Timestamp;

/**
 * Umessage entity. @author MyEclipse Persistence Tools
 */

public class Umessage implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String MDetail;
	private Timestamp MTime;
	private String MId;
	private String rmId;

	// Constructors

	/** default constructor */
	public Umessage() {
	}

	/** full constructor */
	public Umessage(String id, String MDetail, Timestamp MTime, String MId,
			String rmId) {
		this.id = id;
		this.MDetail = MDetail;
		this.MTime = MTime;
		this.MId = MId;
		this.rmId = rmId;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMDetail() {
		return this.MDetail;
	}

	public void setMDetail(String MDetail) {
		this.MDetail = MDetail;
	}

	public Timestamp getMTime() {
		return this.MTime;
	}

	public void setMTime(Timestamp MTime) {
		this.MTime = MTime;
	}

	public String getMId() {
		return this.MId;
	}

	public void setMId(String MId) {
		this.MId = MId;
	}

	public String getRmId() {
		return this.rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

}