package com.education.erp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.education.erp.entity.AcademicTblAttendancehistory;
import com.education.erp.entity.ShareTblStudent;


public interface AcademicTblAttendanceRepository extends CrudRepository<AcademicTblAttendancehistory, Integer> {
	
    public AcademicTblAttendanceRepository findByAcademicId(Integer academic);

	/*public S  save(AcademicTblAttendancehistory academicTblAttendance);*/
	
	public List<AcademicTblAttendancehistory> findByshareTblStudent(ShareTblStudent shareTblStudent);
	}
//Bhoopoendra Singh Lodhi