package com.education.erp.module.academic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.education.erp.entity.AcademicTblSection;
import com.education.erp.entity.AcademicTblTimetable;
import com.education.erp.module.academic.model.*;
import com.education.erp.module.academic.service.AcademicTblTimeTableService;
import com.education.erp.util.ResponseUtil;
import com.education.erp.util.SchoolERPConstants;
@RestController
public class TimeTableController {

	//private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("academicTblTimeTableServiceImpl")
	AcademicTblTimeTableService academicTblTimeTableService;
	
	@GetMapping("/getalltimetable")
	public List<AcademicTblTimetable> gettimetable()
	{
		return academicTblTimeTableService.getalltimetable();
	}
	
	@GetMapping("/gettimetablebysectionid/{sectionid}")
	public AcademicTblTimetable gettimetablebysectionid(@PathVariable("sectionid") int sectionid)
	{
		return academicTblTimeTableService.gettimetablebysectionid(sectionid);
	}

	
	
   //FOR GET MAPPING FOR TIMETABLE BY ACADEMICID
   @GetMapping("/gettimetablebyacedemicid/{academicid}")
   public ResponseEntity<?> gettimetablebyacademicid(@PathVariable("academicid") int academicid)
   {
	try
	{
		AcademicTblTimetable timetable = academicTblTimeTableService.gettimetablebyacademicid(academicid);
		return ResponseUtil.successResponse(timetable);
	}
	
	catch(NullPointerException e) {
		return ResponseUtil.errorResponse(e.getMessage());
	}
	
	catch(Exception e) {
		return ResponseUtil.errorResponse(e.getMessage());
	}
  }

   
// FOR GET MAPPING FOR TIMETABLE BY CLASSNAME
  @GetMapping("/gettimetablebyclassnname/{classname}")
  public ResponseEntity<?> gettimetablebyclassnname(@PathVariable("classname") String classname)
   {
	  try
	  {
		  AcademicTblTimetable timetable = academicTblTimeTableService.gettimetablebyclassnname(classname);
		  return ResponseUtil.successResponse(timetable);
	  }
	  catch (NullPointerException e) {
		//  logger.error("Error:-" + e.getMessage());
		  return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			//logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}
   }
   
  
    //for add 
	@PostMapping("AcademicTblTimeTable/addtimetable")
	public ResponseEntity<?> addtimetable(@RequestBody AcademicTblTimeTableBean academicTblTimeTableBean)
	{
		try
		{
			AcademicTblTimetable timetable= academicTblTimeTableService.addtimetable(academicTblTimeTableBean);
			return ResponseUtil.successResponse(timetable);
		}
	        catch (NullPointerException e) {
	        	//logger.error("Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
				}
            catch (Exception e) {
          //	logger.error("Error:-" + e.getMessage());
  			return ResponseUtil.errorResponse(e.getMessage());	
	    }
	}
	//for Add  (multiple )
	@PostMapping("AcademicTblTimeTable/addtimetable")
	public ResponseEntity<?> AadTblTimetable(@RequestBody List<AcademicTblTimeTableBean> academicTblTimeTableBeanList) {
		
		try {
			for (AcademicTblTimeTableBean timetableBean : academicTblTimeTableBeanList) {

				academicTblTimeTableService.addtimetable(timetableBean);

			}
	
			return ResponseUtil.successResponse(SchoolERPConstants.EMPTY_STRING);

		} catch (NullPointerException e) {

			//logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());

		} catch (Exception e) {
			//logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
        }
	}
	
	
	//PUTMAPING FOR UPDATE
	@PutMapping("AcademicTblTimeTable/updatetimetable")
	public ResponseEntity<?>updatetimetable(@RequestBody AcademicTblTimeTableBean academicTblTimeTableBean)
	{
		try
		{
			AcademicTblTimetable timetable = academicTblTimeTableService.updatetimetable(academicTblTimeTableBean);
			return ResponseUtil.successResponse(timetable);
		}
		
		catch (NullPointerException e) {
			//logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
			
		}
		catch (Exception e)
		{
			//logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
	    }			
     }
	
	
	//DELETEMAPPING FOR DELETE
	@DeleteMapping("AcademicTblTimeTable/Deletetimetable/{timetableid}")
	public ResponseEntity<?>deletetimetable(@PathVariable("timetableid")Integer timetableid){
		
		try {
			AcademicTblSection timetableTbl = academicTblTimeTableService.deletetimetable(timetableid);
			return ResponseUtil.successResponse(timetableTbl);
		}

		catch (NullPointerException e) {
			//logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}
		catch (Exception e) {
			//logger.error("Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}
		
	}
}

