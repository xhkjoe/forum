package com.forum.model;

import java.sql.Timestamp;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String UName;
	private String nickname;
	private Short sex;
	private String UPassword;
	private String email;
	private String headP;
	private Integer phone;
	private Integer EValue;
	private Timestamp LTime;
	private Short activate;
	private Integer power;
	private Integer DTime;
	private Integer message;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String id, String UName, String nickname, Short sex,
			String UPassword, String email, Integer EValue, Timestamp LTime,
			Short activate, Integer power) {
		this.id = id;
		this.UName = UName;
		this.nickname = nickname;
		this.sex = sex;
		this.UPassword = UPassword;
		this.email = email;
		this.EValue = EValue;
		this.LTime = LTime;
		this.activate = activate;
		this.power = power;
	}

	/** full constructor */
	public User(String id, String UName, String nickname, Short sex,
			String UPassword, String email, String headP, Integer phone,
			Integer EValue, Timestamp LTime, Short activate, Integer power,
			Integer DTime, Integer message) {
		this.id = id;
		this.UName = UName;
		this.nickname = nickname;
		this.sex = sex;
		this.UPassword = UPassword;
		this.email = email;
		this.headP = headP;
		this.phone = phone;
		this.EValue = EValue;
		this.LTime = LTime;
		this.activate = activate;
		this.power = power;
		this.DTime = DTime;
		this.message = message;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Short getSex() {
		return this.sex;
	}

	public void setSex(Short sex) {
		this.sex = sex;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeadP() {
		return this.headP;
	}

	public void setHeadP(String headP) {
		this.headP = headP;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getEValue() {
		return this.EValue;
	}

	public void setEValue(Integer EValue) {
		this.EValue = EValue;
	}

	public Timestamp getLTime() {
		return this.LTime;
	}

	public void setLTime(Timestamp LTime) {
		this.LTime = LTime;
	}

	public Short getActivate() {
		return this.activate;
	}

	public void setActivate(Short activate) {
		this.activate = activate;
	}

	public Integer getPower() {
		return this.power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Integer getDTime() {
		return this.DTime;
	}

	public void setDTime(Integer DTime) {
		this.DTime = DTime;
	}

	public Integer getMessage() {
		return this.message;
	}

	public void setMessage(Integer message) {
		this.message = message;
	}

}