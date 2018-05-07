package com.education.erp.module.academic.service;

import java.util.List;

import com.education.erp.entity.AcademicTblClass;
import com.education.erp.entity.AcademicTblSection;
import com.education.erp.entity.AcademicTblSubject;
import com.education.erp.module.academic.model.AcademicTblSubjectBean;


public interface AcademicTblSubjectService {

	String save(AcademicTblSubjectBean academicTblSubjectBean);

	List<AcademicTblClass> getSubjectForStudent(int subjectid);

	List<AcademicTblClass> getSubjectForStudent(int subjectid, int studentid, int classid);

	List<AcademicTblSubject> getSubjectForStudent(int subjectid, int studentid, int classid, String year, String month);

	AcademicTblSection getSubjectByStudentId(int studentId);

	AcademicTblSubject getsubject(Integer classid);

	

	
	

}