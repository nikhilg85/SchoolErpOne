package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the share_tbl_staffcategory database table.
 * 
 */
@Entity
@Table(name="share_tbl_staffcategory")
@NamedQuery(name="ShareTblStaffcategory.findAll", query="SELECT s FROM ShareTblStaffcategory s")
public class ShareTblStaffcategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stafftype_id")
	private Integer stafftypeId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="type_name")
	private String typeName;

	@Column(name="update_date")
	private Date updateDate;

	public ShareTblStaffcategory() {
	}

	public Integer getStafftypeId() {
		return this.stafftypeId;
	}

	public void setStafftypeId(Integer stafftypeId) {
		this.stafftypeId = stafftypeId;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}