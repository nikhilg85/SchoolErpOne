package com.education.erp.module.academic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.education.erp.module.academic.model.AcademicTblSubjectBean;
import com.education.erp.module.academic.service.AcademicTblSubjectService;
import com.education.erp.util.ResponseUtil;

@RestController
public class SubjectController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("AcademicTblSubjectServiceImpl")
	AcademicTblSubjectService SubjectService;
	
	
	/*@RequestMapping(value ="academic/AcademicTblSubject/{subjectid}")
	public ResponseEntity<?> getsubject(@PathVariable("classid") Integer classid) {
		
    try {
			
    	AcademicTblSubject subjectTbl = SubjectService.getsubject(classid);
			
			return ResponseUtil.successResponse(subjectid);
		}

		catch (NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}*/
	
	/*AcademicTblSubjectService  SubjectService;*/
	
	// FOr siNGLE sUBJECT
	@PostMapping(value ="/subjectsave")
//	public String savesubjectservice(@RequestBody SubjectServiceBean subjectServiceBean)
	
	public ResponseEntity<?> savesubjectservice(@RequestBody AcademicTblSubjectBean academicTblSubjectBean) {

		try {

			String subjectsave = SubjectService.save(academicTblSubjectBean);

			return ResponseUtil.successResponse(subjectsave);

		}

		catch (NullPointerException e) {
			logger.error("class controller Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			logger.error("class controller Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}
}
	
	
	// fOR mULTIPLE sUBJECT
	/*
		@PostMapping(value = "/subjectsave")
		public ResponseEntity<?> AcademicTblClass(@RequestBody List<AcademicTblClassBean> classBeanList) {

			try {
				for (AcademicTblClassBean classBean : classBeanList) {

					classService.save(classBean);

				}

				return ResponseUtil.successResponse(SchoolERPConstants.EMPTY_STRING);

			} catch (NullPointerException e) {

				logger.error("Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());

			} catch (Exception e) {
				logger.error("Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());

			}

		}*/

	/*@PostMapping(value = "AcademicTblSubject/{studentId}")
	public ResponseEntity<?> getAttendanceForStudent(@PathVariable("studentId") int studentId,
			@RequestParam(name = "year") String year, @RequestParam(name = "month") String month)
	
	{
		try {
			
			List<AcademicTblAttendancehistory> academicTblAttendancehistory = attendanceService.getAttendanceByStudentIdAndYearMonth(studentId,year,month);
			
			return ResponseUtil.successResponse(academicTblAttendancehistory);
		}

		catch (NullPointerException e) {
			logger.error("class controller Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			logger.error("class controller Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}
		
	
	}*/

}


