package com.education.erp.module.academic.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.education.erp.entity.*;
import com.education.erp.module.academic.model.AcademicTblClassBean;
import com.education.erp.module.academic.service.AcademicTblClassService;
import com.education.erp.util.ResponseUtil;
import com.education.erp.util.SchoolERPConstants;

@RestController
public class ClassContoller {
    // LOGGER FOR MSG PRINT 
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("academicTblClassServiceImpl")
	AcademicTblClassService classService;

	@GetMapping("/getallclass")
	public List<AcademicTblClass> getclass() {
		return classService.getallclass();
	}

	
	// FOR GET MAPPING FOR CLASS BY CLASSID
	@GetMapping("/getclassbyclassid/{classid}")
	public ResponseEntity<?> getclassbyclassid(@PathVariable("classid") int classid) {

		try {

			AcademicTblClass classTbl = classService.getclassbyclassid(classid);

			return ResponseUtil.successResponse(classTbl);
		}

		catch (NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}
	
   // GET MAPPING FOR CLASS BY ACADEMICID
	@GetMapping("/getbyacademicid/{academicid}")
	
	public ResponseEntity<?> getbyacademicid(@PathVariable("academicid") int academicid) {

		try {

			AcademicTblClass classTbl = classService.getbyacademicid(academicid);

			return ResponseUtil.successResponse(classTbl);
		}

		catch (NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}
	

	@GetMapping("/getclassbyclassname/{classname}")
	public ResponseEntity<?> getclassbyclassname(@PathVariable("classname") String classname) {

		try {

			AcademicTblClass classTbl = classService.getclassbyclassname(classname);

			return ResponseUtil.successResponse(classTbl);
		}

		catch (NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}

	@RequestMapping(value = "academic/AcademicTblClass/{classid}")
	public ResponseEntity<?> getclass(@PathVariable("classid") Integer classid) {

		try {

			AcademicTblClass classTbl = classService.getClass(classid);

			return ResponseUtil.successResponse(classTbl);
		}

		catch (NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}

	// for single class

	@PostMapping(value = "/AcademicTblClass")
	public ResponseEntity<?> ClassTbl(@RequestBody AcademicTblClassBean academicTblClassBean) {

		try {

			AcademicTblClass saveclass = classService.save(academicTblClassBean);

			return ResponseUtil.successResponse(saveclass);
		}

		catch (NullPointerException e) {
			logger.error("class controller Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}

	// add multiple classes
	@PostMapping(value = "/AcademicTblClasses")
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

	}

	@DeleteMapping("/AcademicTblClass/{classid}")
	public ResponseEntity<?> removeClass(@PathVariable("classid") Integer classid) {

		try {
			AcademicTblClass classTbl = classService.removeclass(classid);
			return ResponseUtil.successResponse(classTbl);
		}

		catch (NullPointerException e) {
			logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}

	@PutMapping("/AcademicTblClass")
	public ResponseEntity<?> updateClass(@RequestParam(name = "classid") Integer classid,
			@RequestParam(name = "classname") String classname) {

		try {
			AcademicTblClass classTbl = classService.updateClass(classid, classname);
			return ResponseUtil.successResponse(classTbl);
		}

		catch (NullPointerException e) {
			logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}

}
