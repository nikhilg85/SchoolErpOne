package com.education.erp.module.academic.model;

import java.util.Date;

public class AcademicTblSubjectBean {
	
	private Integer subjectId;

	private Integer academicId;
	
	private Integer activeFlag;
	
	private Integer classId;
	
	private Integer createBy;
	
	private Date createDate;
	
	private String description;

	private String subjectName;

	private Date updateDate;

	private Integer academicTblClass;
	
	private Integer academicTblSection;

	private Integer shareTblEmpstaffdetail;

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
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

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Integer getAcademicTblClass() {
		return academicTblClass;
	}

	public void setAcademicTblClass(Integer academicTblClass) {
		this.academicTblClass = academicTblClass;
	}

	public Integer getAcademicTblSection() {
		return academicTblSection;
	}

	public void setAcademicTblSection(Integer academicTblSection) {
		this.academicTblSection = academicTblSection;
	}

	public Integer getShareTblEmpstaffdetail() {
		return shareTblEmpstaffdetail;
	}

	public void setShareTblEmpstaffdetail(Integer shareTblEmpstaffdetail) {
		this.shareTblEmpstaffdetail = shareTblEmpstaffdetail;
	}

	

}
