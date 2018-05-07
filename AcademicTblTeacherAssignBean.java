package com.education.erp.module.academic.model;

import java.util.Date;

public class AcademicTblTeacherAssignBean {
	
	private Integer academicId;
	
	private Integer academicYearId;
	
	private Integer attendanceId;
	
	private Integer classId;
	
	private Date createDate;
	
	private Integer teacherAssignId;
	
	private Date updateDate;

	/**
	 * @return the academicId
	 */
	public Integer getAcademicId() {
		return academicId;
	}

	
	// @param academicId the academicId to set
	
	public void setAcademicId(Integer academicId) {
		this.academicId = academicId;
	}

	
	 // @return the academicYearId
	 
	public Integer getAcademicYearId() {
		return academicYearId;
	}

	
	 // @param academicYearId the academicYearId to set
	 
	public void setAcademicYearId(Integer academicYearId) {
		this.academicYearId = academicYearId;
	}

	
	  //@return the attendanceId
	
	public Integer getAttendanceId() {
		return attendanceId;
	}

	
	 // @param attendanceId the attendanceId to set
	 
	public void setAttendanceId(Integer attendanceId) {
		this.attendanceId = attendanceId;
	}

	
	 // @return the classId
	
	public Integer getClassId() {
		return classId;
	}

	
	 // @param classId the classId to set
	 
	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	
	 // @return the createDate
	 
	public Date getCreateDate() {
		return createDate;
	}

	
	 // @param createDate the createDate to set
	 
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
	 //@return the teacherAssignId
	 
	public Integer getTeacherAssignId() {
		return teacherAssignId;
	}

	
	 //@param teacherAssignId the teacherAssignId to set
	 
	public void setTeacherAssignId(Integer teacherAssignId) {
		this.teacherAssignId = teacherAssignId;
	}

	
	// @return the updateDate
	 
	public Date getUpdateDate() {
		return updateDate;
	}

	
	 // @param updateDate the updateDate to set
	 
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	

}
