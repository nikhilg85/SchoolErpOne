package com.education.erp.module.academic.model;

import java.util.Date;

public class AcademicTblClassBean {

	private String classname;
	private Integer academic_id;
	private Integer createdby;
	private Date createdate;
	private Integer activeflag;
	private Date update;
	private Integer Classid;
	

	public Integer getAcademic_id() {
		return academic_id;
	}

	public void setAcademic_id(Integer academic_id) {
		this.academic_id = academic_id;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}


	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Integer getActiveflag() {
		return activeflag;
	}

	public void setActiveflag(Integer activeflag) {
		this.activeflag = activeflag;
	}

	public Date getUpdate() {
		return update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Integer getClassId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setClassId(Integer classid) {
		setClassid(classid);
	}

	public Integer getClassid() {
		return Classid;
	}

	public void setClassid(Integer classid) {
		Classid = classid;
	}
	
	}

