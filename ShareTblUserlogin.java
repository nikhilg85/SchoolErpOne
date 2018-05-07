package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the share_tbl_userlogin database table.
 * 
 */
@Entity
@Table(name="share_tbl_userlogin")
@NamedQuery(name="ShareTblUserlogin.findAll", query="SELECT s FROM ShareTblUserlogin s")
public class ShareTblUserlogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userId;

	@Column(name="active_flag")
	private Boolean activeFlag;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="email_id")
	private String emailId;

	@Column(name="last_visit_date")
	private Date lastVisitDate;

	@Column(name="mobile_no")
	private String mobileNo;

	private String password;

	@Column(name="update_date")
	private Date updateDate;

	@Column(name="user_typeid")
	private Integer userTypeid;

	public ShareTblUserlogin() {
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Boolean getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserTypeid() {
		return this.userTypeid;
	}

	public void setUserTypeid(Integer userTypeid) {
		this.userTypeid = userTypeid;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLastVisitDate() {
		return lastVisitDate;
	}

	public void setLastVisitDate(Date lastVisitDate) {
		this.lastVisitDate = lastVisitDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}