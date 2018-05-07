package com.education.erp.module.academic.service;

import java.util.List;

import com.education.erp.entity.AcademicTblSection;
import com.education.erp.entity.AcademicTblTimetable;
import com.education.erp.module.academic.model.AcademicTblTimeTableBean;

public interface AcademicTblTimeTableService {

	List<AcademicTblTimetable> getalltimetable();

	AcademicTblTimetable gettimetablebysectionid(int sectionid);

	AcademicTblTimetable gettimetablebyacademicid(int academicid);

	AcademicTblTimetable gettimetablebyclassnname(String classname);

	AcademicTblTimetable addtimetable(AcademicTblTimeTableBean academicTblTimeTableBean);

	AcademicTblTimetable updatetimetable(AcademicTblTimeTableBean academicTblTimeTableBean);

	AcademicTblSection deletetimetable(Integer timetableid);

	List<AcademicTblTimetable> gettimetable();

	AcademicTblSection getsectionbyid(int id);

	List<AcademicTblSection> getsectionbyacademicid(int id);

}
