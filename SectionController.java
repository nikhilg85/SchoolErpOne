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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.education.erp.module.academic.model.AcademicTblSectionBean;
import com.education.erp.module.academic.service.AcademicTblSectionService;
import com.education.erp.util.ResponseUtil;
import com.education.erp.util.SchoolERPConstants;

@Controller
@RestController
public class SectionController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("sectionServiceImpl")
	AcademicTblSectionService sectionService;
	
	@GetMapping("/getallsection")
	public List<AcademicTblSection> getsection()
	{
		return sectionService.getallsection();
	}
	
	@GetMapping("/getsectionbysectionid/{id}")
	public AcademicTblSection getsectionbyid(@PathVariable("id") int id)
	{
		return sectionService.getsectionbyid(id);
	}
	
	@GetMapping("/getbyacedemicid/{id}")
	public List<AcademicTblSection> getsectionbyacademicid(@PathVariable("id") int id)
	{
		return sectionService.getsectionbyacademicid(id);
	}
	
	@GetMapping("/getbysectionname/{name}")
	public AcademicTblSection getsectionbysectionname(@PathVariable("name") String name)
	{
		return sectionService.getsectionbysectionname(name);
	}
	
	
	
	//for add section
	@PostMapping("AcademicTblSection/addsection")
	public ResponseEntity<?> addsecttion(@RequestBody AcademicTblSectionBean academicTblSectionBean)
	{
		try
		{
			AcademicTblSection sectionTbl= sectionService.addnewsection(academicTblSectionBean);
			return ResponseUtil.successResponse(sectionTbl);
		}
	        catch (NullPointerException e) {
	        	logger.error("Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
        }

            catch (Exception e) {
            	logger.error(" Error:-" + e.getMessage());
    			return ResponseUtil.errorResponse(e.getMessage());	
	    }
	
    }

	
	//for Add section (multiple section)
	@PostMapping("academicTblSection/addsection")
	public ResponseEntity<?> AcademicTblSection(@RequestBody List<AcademicTblSectionBean> sectionBeanList) {
		
		try {
			for (AcademicTblSectionBean sectionBean : sectionBeanList) {

				sectionService.addnewsection(sectionBean);

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
	
	
	//PutMAPING FOR UPDATE
	@PutMapping("AcademicTblSection/updatesection")
	public ResponseEntity<?>updatesection(@RequestBody AcademicTblSectionBean academicTblSectionBean)
	{
		try
		{
			AcademicTblSection sectionTbl = sectionService.updatesection(academicTblSectionBean);
			return ResponseUtil.successResponse(sectionTbl);
		}
		
		catch (NullPointerException e) {
			logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
			
		}
		catch (Exception e)
		{
			logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
	    }			
     }
	
	
	//DELETEMAPPING FOR DELETE
	@DeleteMapping("AcademicTblSection/Deletesection/{sectionid}")
	public ResponseEntity<?>deleteSection(@PathVariable("sectionid")Integer sectionid){
		
		try {
			AcademicTblSection sectionTbl = sectionService.deletesection(sectionid);
			return ResponseUtil.successResponse(sectionTbl);
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
	
	 //save section
	 @PostMapping(value ="AcademicTblsection/savesection")
	public ResponseEntity<?> savesectiondetails(@RequestBody AcademicTblSectionBean academicTblSectionBean) 
	{
			try {

				String sectionTbl = sectionService.savesectiondetails(academicTblSectionBean);
				return ResponseUtil.successResponse(sectionTbl);
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
		
		
		
		
		// For Save Section id & Section Name 
		@PostMapping(value ="AcademicTblsection/{sectionid}/{sectionname}")
		public ResponseEntity<?> saveSectionDetails1(@RequestBody AcademicTblSectionBean academicTblSectionBeans)
		{

			try {

				String savesection = sectionService.save(academicTblSectionBeans);

				return ResponseUtil.successResponse(savesection);

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
		
		@PostMapping(value = "sectionbyempstaffid/{empstaffid}")
		public ResponseEntity<?> getSectionForempstaffid(@PathVariable("empstaffid") int empstaffid,
				@RequestParam(name = "year") String year, @RequestParam(name = "month") String month)
		
		{
			try {
				
				List<AcademicTblSection> academicTblsection = sectionService.getSectionByempstaffidIdAndYearMonth(empstaffid,year,month);
				
				return ResponseUtil.successResponse(academicTblsection);
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
}