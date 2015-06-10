package com.forum.model;

import java.sql.Timestamp;

/**
 * SpiComment entity. @author MyEclipse Persistence Tools
 */

public class SpiComment implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String CDetail;
	private String INumber;
	private String UNumber;
	private Timestamp CTime;
	private String bcNumber;
	private String ITable;

	// Constructors

	/** default constructor */
	public SpiComment() {
	}

	/** full constructor */
	public SpiComment(String id, String CDetail, String INumber,
			String UNumber, Timestamp CTime, String bcNumber, String ITable) {
		this.id = id;
		this.CDetail = CDetail;
		this.INumber = INumber;
		this.UNumber = UNumber;
		this.CTime = CTime;
		this.bcNumber = bcNumber;
		this.ITable = ITable;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCDetail() {
		return this.CDetail;
	}

	public void setCDetail(String CDetail) {
		this.CDetail = CDetail;
	}

	public String getINumber() {
		return this.INumber;
	}

	public void setINumber(String INumber) {
		this.INumber = INumber;
	}

	public String getUNumber() {
		return this.UNumber;
	}

	public void setUNumber(String UNumber) {
		this.UNumber = UNumber;
	}

	public Timestamp getCTime() {
		return this.CTime;
	}

	public void setCTime(Timestamp CTime) {
		this.CTime = CTime;
	}

	public String getBcNumber() {
		return this.bcNumber;
	}

	public void setBcNumber(String bcNumber) {
		this.bcNumber = bcNumber;
	}

	public String getITable() {
		return this.ITable;
	}

	public void setITable(String ITable) {
		this.ITable = ITable;
	}

}