package com.education.erp.module.academic.model;

import java.util.Date;

public class AcademicTblSectionBean {
	
	private Integer sectionId;
	
	private Integer academicId;
	
	private Integer activeFlag;
	
	private Date createDate;

	private String sectionName;
	
	private Date updateDate;
	
	private Integer classId;
	

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getAcademicId() {
		return academicId;
	}

	public void setAcademicId(Integer academicId) {
		this.academicId = academicId;
	}

	public Integer getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}


}
