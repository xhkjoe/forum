package com.forum.model;

import java.util.Date;

/**
 * Timely entity. @author MyEclipse Persistence Tools
 */

public class Timely implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String IName;
	private String MNumber;
	private String IDetail;
	private String UNumber;
	private String UId;
	private Integer MClass;
	private Date CTime;
	private Integer praise;
	private Integer step;
	private Integer VNumber;
	private String picture;

	// Constructors

	/** default constructor */
	public Timely() {
	}

	/** minimal constructor */
	public Timely(String id, String IName, String MNumber, String IDetail,
			String UNumber, String UId, Integer MClass, Date CTime,
			Integer praise, Integer step, Integer VNumber) {
		this.id = id;
		this.IName = IName;
		this.MNumber = MNumber;
		this.IDetail = IDetail;
		this.UNumber = UNumber;
		this.UId = UId;
		this.MClass = MClass;
		this.CTime = CTime;
		this.praise = praise;
		this.step = step;
		this.VNumber = VNumber;
	}

	/** full constructor */
	public Timely(String id, String IName, String MNumber, String IDetail,
			String UNumber, String UId, Integer MClass, Date CTime,
			Integer praise, Integer step, Integer VNumber, String picture) {
		this.id = id;
		this.IName = IName;
		this.MNumber = MNumber;
		this.IDetail = IDetail;
		this.UNumber = UNumber;
		this.UId = UId;
		this.MClass = MClass;
		this.CTime = CTime;
		this.praise = praise;
		this.step = step;
		this.VNumber = VNumber;
		this.picture = picture;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIName() {
		return this.IName;
	}

	public void setIName(String IName) {
		this.IName = IName;
	}

	public String getMNumber() {
		return this.MNumber;
	}

	public void setMNumber(String MNumber) {
		this.MNumber = MNumber;
	}

	public String getIDetail() {
		return this.IDetail;
	}

	public void setIDetail(String IDetail) {
		this.IDetail = IDetail;
	}

	public String getUNumber() {
		return this.UNumber;
	}

	public void setUNumber(String UNumber) {
		this.UNumber = UNumber;
	}

	public String getUId() {
		return this.UId;
	}

	public void setUId(String UId) {
		this.UId = UId;
	}

	public Integer getMClass() {
		return this.MClass;
	}

	public void setMClass(Integer MClass) {
		this.MClass = MClass;
	}

	public Date getCTime() {
		return this.CTime;
	}

	public void setCTime(Date CTime) {
		this.CTime = CTime;
	}

	public Integer getPraise() {
		return this.praise;
	}

	public void setPraise(Integer praise) {
		this.praise = praise;
	}

	public Integer getStep() {
		return this.step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public Integer getVNumber() {
		return this.VNumber;
	}

	public void setVNumber(Integer VNumber) {
		this.VNumber = VNumber;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

}