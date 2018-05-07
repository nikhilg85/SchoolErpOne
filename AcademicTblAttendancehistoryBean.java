package com.education.erp.module.academic.model;

import java.util.Date;

public class AcademicTblAttendancehistoryBean {
	private Integer classid;
	private Integer studentid; 
	private Integer academicid;
	private Integer attendanceid;
	private Integer sectionid;
	private Integer createdby;
	private Date createdate;
	private Integer activeflag;
	private Integer presentabsentflag;
	private Date updatedate;
	private Date attandancedate;
	private String reasonforleave;
	public Integer getClassid() {
		return classid;
	}
	public void setClassid(Integer classid) {
		this.classid = classid;
	}
	public Integer getStudentid() {
		return studentid;
	}
	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}
	public Integer getAcademicid() {
		return academicid;
	}
	public void setAcademicid(Integer academicid) {
		this.academicid = academicid;
	}
	public Integer getAttendanceid() {
		return attendanceid;
	}
	public void setAttendanceid(Integer attendanceid) {
		this.attendanceid = attendanceid;
	}
	public Integer getSectionid() {
		return sectionid;
	}
	public void setSectionid(Integer sectionid) {
		this.sectionid = sectionid;
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
	public Integer getPresentabsentflag() {
		return presentabsentflag;
	}
	public void setPresentabsentflag(Integer presentabsentflag) {
		this.presentabsentflag = presentabsentflag;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	public Date getAttandancedate() {
		return attandancedate;
	}
	public void setAttandancedate(Date attandancedate) {
		this.attandancedate = attandancedate;
	}
	public String getReasonforleave() {
		return reasonforleave;
	}
	public void setReasonforleave(String reasonforleave) {
		this.reasonforleave = reasonforleave;
	}
}
