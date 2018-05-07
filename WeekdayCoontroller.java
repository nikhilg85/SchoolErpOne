package com.education.erp.module.academic.controller;

import java.util.List;
import java.util.logging.Logger;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.erp.entity.AcademicTblWeekday;
import com.education.erp.module.academic.service.AcademicTblWeekdayService;
import com.education.erp.util.ResponseUtil;


@RestController
@RequestMapping("academic/Weekday")
public class WeekdayCoontroller {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier(weekdayServiceImpl)
	AcademicTblWeekdayService weekdayServic;

	@GetMapping("/getweekdays")
	public List<AcademicTblWeekday> getweekdays()
	{

		return AcademicTblWeekdayService.getweekdays();


	}

	@GetMapping("/getweekdaybyacademicid/{academicid}")
	public ResponseEntity<?>getweekdaybyacademicid(@PathVariable("academicid") int academicid)
	{
		
	  try{
		  AcademicTblWeekdayService academicTblWeekdayService;
		AcademicTblWeekday weekday = AcademicTblWeekdayService.getweekdaybyacademicid(academicid);
			return ResponseUtil.successResponse(weekday);
		}

		catch(NullPointerException e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch(Exception e) {
			return ResponseUtil.errorResponse(e.getMessage());
		}
	}


// FOR GET MAPPING FOR CLASS BY CLASSID
   @GetMapping("/getweekdaybyweekdayid/{weekdayid}")
public ResponseEntity<?> getweekdaybyweekdayid(@PathVariable("weekdayid") int weekdayid) {

	try {

		AcademicTblWeekday  weekday = AcademicTblWeekdayService.get(weekdayid);

		return ResponseUtil.successResponse(weekday);
	}

	catch (NullPointerException e) {
		return ResponseUtil.errorResponse(e.getMessage());
	}

	catch (Exception e) {
		
		return ResponseUtil.errorResponse(e.getMessage());
	}

