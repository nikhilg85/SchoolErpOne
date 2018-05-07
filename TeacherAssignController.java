package com.education.erp.module.academic.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.education.erp.module.academic.model.*;
import com.education.erp.module.academic.service.AcademicTblTeacherAssignService;
import com.education.erp.util.ResponseUtil;

@Controller
@RestController
public class TeacherAssignController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//private Object getallteacher;

	@Autowired
	@Qualifier("academicTblTeacherAssignImpl")
	AcademicTblTeacherAssignService teacherAssignService;
	
	
	@GetMapping("/getallteacher")
	
	public List<AcademicTblTeacherAssign> getteacher() {
		//AcademicTblTeacherAssignService teacherAssignService;
		return teacherAssignService.getallteacher();
	}

	@GetMapping("/getbysectionid/{sectionid}")
	//public AcademicTblTeacherAssign getbysectionid(@PathVariable("sectionid") int sectionid)
	//return teacherAssignService.getbysectionid(sectionid);
	public ResponseEntity<?> getbysectionid(@PathVariable("sectionid")int sectionid) {
		try {
			AcademicTblTeacherAssign teacherAssignTbl = teacherAssignService.getbysectionid(sectionid);
			return ResponseUtil.successResponse(teacherAssignTbl);
		}
		
		catch (NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}
		
		catch (Exception e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}
	}
	
	@GetMapping("/getbyclassid/{classid}")
	//public AcademicTblTeacherAssign getteacherbyclassid(@PathVariable("classid") int classid)
	public ResponseEntity<?> getbyclassid(@PathVariable("classid") int classid) {

		try {

			AcademicTblTeacherAssign teacherAssignTbl = teacherAssignService.getbyclassid(classid);

			return ResponseUtil.successResponse(teacherAssignTbl);
		}

		catch (NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}
	}
	
	@GetMapping("/getbyteacherassignid/{id}")
	//public AcademicTblTeacherAssign getbyteacherassignid(@PathVariable("id") int id)
	//return teacherAssignService.getbyteacherassignid(id);
	public ResponseEntity<?>getbyteacherassignid(@PathVariable("id")int id)
	{
		try {
			AcademicTblTeacherAssign teacherAssignTbl = teacherAssignService.getbyteacherassignid(id);
			
			return ResponseUtil.successResponse(teacherAssignTbl);
		}
		
		catch(NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}
		catch(Exception e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}
	}
		
	
	//for add Teacher single Entity 
		@PostMapping("AcademicTblTeacherAssign/addteacher")
		public ResponseEntity<?>addteacher(@RequestBody AcademicTblTeacherAssignBean academicTblTeacherAssignBean)
		{
			try
			{
				AcademicTblTeacherAssign teacherassignTbl= teacherAssignService.addnewteacher(academicTblTeacherAssignBean);
				return ResponseUtil.successResponse(teacherassignTbl);

				
			}
		        catch (NullPointerException e) {
		        	logger.error("TeacherAssignContrl addteacher Error:-"+e.getMessage());
		        	return ResponseUtil.errorResponse(e.getMessage());
		        }

	            catch (Exception e) {
	            	logger.error("TeacherAssignContrl addteacher Error:-" + e.getMessage());
					return ResponseUtil.errorResponse(e.getMessage());
		    }
		
	    }

	
		@PostMapping("AcademicTblTeacherAssign/addteacher")
		public ResponseEntity<?> AcademicTblTeacherAssign(@RequestBody List<AcademicTblTeacherAssignBean> teacherAssignBeanList) {
			
			try {
				for (AcademicTblTeacherAssignBean teacherAssignBean : teacherAssignBeanList) 
				{

					teacherAssignService.addnewteacher(teacherAssignBean);
		
				    return ResponseUtil.successResponse(SchoolERPConstants.EMPTY_STRING);
				
				}
			}

			 catch (NullPointerException e) {

				logger.error("TeacherAssignContrl addteacher Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());

			} catch (Exception e) {
				logger.error("TeacherAssignContrl addteacher Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
	        }
			return null;
		}
		@PutMapping("AcademicTblTeacherAssign/updateteacher")
		public ResponseEntity<?> updateteacher(@RequestBody AcademicTblTeacherAssignBean academicTblTeacherAssignBean)
		{
			try
			{
				AcademicTblTeacherAssign teacherAssignTbl = teacherAssignService.updateteacher(academicTblTeacherAssignBean);
				 return ResponseUtil.successResponse(SchoolERPConstants.EMPTY_STRING);
				
			}
			
			catch (NullPointerException e) {
				logger.error("TeacherAssignContrl updateteacher Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
				
			}
			catch (Exception e)
			{
				logger.error("TeacherAssignContrl updateteacher Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
			}
		}
			
			@DeleteMapping("AcademicTblTeacherAssign/Deleteteacher/{teacherassignid}")
			public ResponseEntity<?>deleteTeacher(@PathVariable("teacherassignid")Integer teacherassignid)
            {
				
				try
				{
					AcademicTblTeacherAssign teacherassignTbl = teacherAssignService.deleteteacher(teacherassignid);
					 return ResponseUtil.successResponse(teacherassignTbl);
				}

				catch (NullPointerException e) {
					logger.error("TeacherAssignContrl deleteteacher Error:-" + e.getMessage());
					return ResponseUtil.errorResponse(e.getMessage());
				}

				catch (Exception e) {
					logger.error("TeacherAssignContrl deleteteacher Error:-" + e.getMessage());
					return ResponseUtil.errorResponse(e.getMessage());
				}
			}
		}

