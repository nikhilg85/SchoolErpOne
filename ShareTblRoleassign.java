package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the share_tbl_roleassign database table.
 * 
 */
@Entity
@Table(name="share_tbl_roleassign")
@NamedQuery(name="ShareTblRoleassign.findAll", query="SELECT s FROM ShareTblRoleassign s")
public class ShareTblRoleassign implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roleassign_id")
	private Integer roleassignId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="role_id")
	private Integer roleId;

	@Column(name="update_date")
	private Date updateDate;

	@Column(name="user_id")
	private Integer userId;

	public ShareTblRoleassign() {
	}

	public Integer getRoleassignId() {
		return this.roleassignId;
	}

	public void setRoleassignId(Integer roleassignId) {
		this.roleassignId = roleassignId;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}