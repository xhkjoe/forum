package com.forum.model;

import java.sql.Timestamp;

/**
 * Publish entity. @author MyEclipse Persistence Tools
 */

public class Publish implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String ADetail;
	private String MId;
	private Timestamp PTime;

	// Constructors

	/** default constructor */
	public Publish() {
	}

	/** full constructor */
	public Publish(String id, String ADetail, String MId, Timestamp PTime) {
		this.id = id;
		this.ADetail = ADetail;
		this.MId = MId;
		this.PTime = PTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getADetail() {
		return this.ADetail;
	}

	public void setADetail(String ADetail) {
		this.ADetail = ADetail;
	}

	public String getMId() {
		return this.MId;
	}

	public void setMId(String MId) {
		this.MId = MId;
	}

	public Timestamp getPTime() {
		return this.PTime;
	}

	public void setPTime(Timestamp PTime) {
		this.PTime = PTime;
	}

}