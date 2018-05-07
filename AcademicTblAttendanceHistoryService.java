package com.education.erp.module.academic.service;

import java.util.List;

import com.education.erp.entity.AcademicTblAttendancehistory;
import com.education.erp.module.academic.model.AcademicTblAttendancehistoryBean;

public interface AcademicTblAttendanceHistoryService {

	List<AcademicTblAttendancehistory> getallattendance();

	AcademicTblAttendancehistory getattendancebyattendanceid(int attendanceid);

	AcademicTblAttendancehistory getattendancebyclassid(int classid);

	AcademicTblAttendancehistory getattendancebyacademicid(int academicid);

	AcademicTblAttendancehistory getattendancebyclassname(String classname);

	AcademicTblAttendancehistory addnewsection(AcademicTblAttendancehistoryBean academicTblAttendancehistoryBean);

	AcademicTblAttendancehistory updateattendancehistory(AcademicTblAttendancehistoryBean aatendancehistoryBean);

	AcademicTblAttendancehistory Deleteattendancehistory(Integer sectionid);

	AcademicTblAttendancehistory Deleteattendancehistorybystudentid(Integer studentid);
	
	AcademicTblAttendancehistory Deleteattendancehistorybyclassid (Integer classid);

	AcademicTblAttendancehistory Deleteattendancehistorybyclassname(Integer classname);

	void saveMultipleattendancehistory(AcademicTblAttendancehistoryBean academicTblattendancehistoryBean);

	String saveattendancehistory(AcademicTblAttendancehistoryBean attendancehistoryBean);

}
