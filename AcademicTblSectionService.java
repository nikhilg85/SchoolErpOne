package com.education.erp.module.academic.service;

import java.util.List;

import com.education.erp.entity.AcademicTblSection;
import com.education.erp.module.academic.model.AcademicTblSectionBean;

public interface AcademicTblSectionService {

	public List<AcademicTblSection> getallsection();

	AcademicTblSection getsectionbyid(Integer id);

	List<AcademicTblSection> getsectionbyacademicid(Integer id);

	AcademicTblSection getsectionbysectionname(String name);
	
	AcademicTblSection addnewsection(AcademicTblSectionBean academicTblSectionBean);

	AcademicTblSection updatesection(AcademicTblSectionBean academicTblSectionBean);

	AcademicTblSection deletesection(Integer sectionid);

	List<AcademicTblSection> getSectionByempstaffidIdAndYearMonth(int empstaffid, String year, String month);

	String savesectiondetails(AcademicTblSectionBean academicTblSectionBean);

	String save(AcademicTblSectionBean academicTblSectionBeans);

	AcademicTblSection getsectionbyid(int id);

	List<AcademicTblSection> getsectionbyacademicid(int id);



	}
	
