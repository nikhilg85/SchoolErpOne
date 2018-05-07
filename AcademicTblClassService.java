package com.education.erp.module.academic.service;

import java.util.List;

import com.education.erp.entity.AcademicTblClass;
import com.education.erp.module.academic.model.AcademicTblClassBean;

public interface AcademicTblClassService {

	
	AcademicTblClass removeclass(int classid);

	AcademicTblClass updateClass(Integer classid, String classname);

	AcademicTblClass save(AcademicTblClassBean academicTblClassBean);

	List<AcademicTblClass> getallclass();
	
	AcademicTblClass getclassbyclassid(int classid);
	
	List<AcademicTblClass> getclassbyacademicid(int id);

	AcademicTblClass getclassbyclassname(String classname);

	List<AcademicTblClass> getallClass();

	AcademicTblClass getbyacademicid(int academicid);

	AcademicTblClass getClass(Integer classid);

	AcademicTblClass getbyacademicid(Integer academic);


	


	}