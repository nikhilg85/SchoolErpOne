package com.education.erp.module.academic.model;

import java.util.Date;
import java.util.List;

public class AttendanceBean {

	private Integer academicId;

	private Date attandanceDate;

	private Integer presentAbsentFlag;

	private String reasonForLeave;

	private List<Integer> presentstudentid;
	
	private List<Integer> absentstudentid;

	private List<Integer> leavestudentid;

	private Integer sectionId;

	private Integer empstaffId;

	private Date createDate;

	private Date updateDate;

	public Integer getAcademicId() {
		return academicId;
	}

	public void setAcademicId(Integer academicId) {
		this.academicId = academicId;
	}

	public Date getAttandanceDate() {
		return attandanceDate;
	}

	public void setAttandanceDate(Date attandanceDate) {
		this.attandanceDate = attandanceDate;
	}

	public Integer getPresentAbsentFlag() {
		return presentAbsentFlag;
	}

	public void setPresentAbsentFlag(Integer presentAbsentFlag) {
		this.presentAbsentFlag = presentAbsentFlag;
	}

	public String getReasonForLeave() {
		return reasonForLeave;
	}

	public void setReasonForLeave(String reasonForLeave) {
		this.reasonForLeave = reasonForLeave;
	}

	public Integer getSectionId() {
		return sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getEmpstaffId() {
		return empstaffId;
	}

	public void setEmpstaffId(Integer empstaffId) {
		this.empstaffId = empstaffId;
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

	public List<Integer> getPresentstudentid() {
		return presentstudentid;
	}

	public void setPresentstudentid(List<Integer> presentstudentid) {
		this.presentstudentid = presentstudentid;
	}

	public List<Integer> getAbsentstudentid() {
		return absentstudentid;
	}

	public void setAbsentstudentid(List<Integer> absentstudentid) {
		this.absentstudentid = absentstudentid;
	}

	public List<Integer> getLeavestudentid() {
		return leavestudentid;
	}

	public void setLeavestudentid(List<Integer> leavestudentid) {
		this.leavestudentid = leavestudentid;
	}
	
	
	

}
