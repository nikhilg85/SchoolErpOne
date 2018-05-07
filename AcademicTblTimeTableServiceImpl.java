package com.education.erp.module.academic.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.erp.entity.AcademicTblSection;
import com.education.erp.entity.AcademicTblTimetable;
import com.education.erp.module.academic.model.AcademicTblTimeTableBean;
import com.education.erp.module.academic.service.AcademicTblTimeTableService;
import com.education.erp.repository.AcademicTblClassRepository;
import com.education.erp.repository.AcademicTblSectionRepository;
import com.education.erp.repository.AcademicTblTimeTableRepository;

@Service
public class AcademicTblTimeTableServiceImpl implements AcademicTblTimeTableService {
	
	@Autowired
	AcademicTblSectionRepository sectionrepository;
	@Autowired
	AcademicTblClassRepository classrepository;
	@Autowired
	AcademicTblTimeTableRepository timetablerepository;
	private Integer timetableid;
	@Override
	public List<AcademicTblTimetable> getalltimetable() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AcademicTblTimetable gettimetablebysectionid(int sectionid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AcademicTblTimetable gettimetablebyacademicid(int academicid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AcademicTblTimetable gettimetablebyclassnname(String classname) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AcademicTblTimetable addtimetable(AcademicTblTimeTableBean academicTblTimeTableBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AcademicTblTimetable updatetimetable(AcademicTblTimeTableBean academicTblTimeTableBean) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AcademicTblSection deletetimetable(Integer timetableid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<AcademicTblTimetable> gettimetable() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AcademicTblSection getsectionbyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<AcademicTblSection> getsectionbyacademicid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}
	
	
