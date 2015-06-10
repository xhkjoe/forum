package com.forum.model;

/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String MName;
	private String MPassword;
	private String email;
	private Integer phone;
	private String headP;
	private Integer power;

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** minimal constructor */
	public Manager(String id, String MName, String MPassword, String email,
			Integer power) {
		this.id = id;
		this.MName = MName;
		this.MPassword = MPassword;
		this.email = email;
		this.power = power;
	}

	/** full constructor */
	public Manager(String id, String MName, String MPassword, String email,
			Integer phone, String headP, Integer power) {
		this.id = id;
		this.MName = MName;
		this.MPassword = MPassword;
		this.email = email;
		this.phone = phone;
		this.headP = headP;
		this.power = power;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMName() {
		return this.MName;
	}

	public void setMName(String MName) {
		this.MName = MName;
	}

	public String getMPassword() {
		return this.MPassword;
	}

	public void setMPassword(String MPassword) {
		this.MPassword = MPassword;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getHeadP() {
		return this.headP;
	}

	public void setHeadP(String headP) {
		this.headP = headP;
	}

	public Integer getPower() {
		return this.power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

}