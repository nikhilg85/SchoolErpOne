
package com.education.erp.module.academic.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.erp.entity.AcademicTblAttendancehistory;
import com.education.erp.module.academic.model.AcademicTblAttendancehistoryBean;
import com.education.erp.module.academic.service.AcademicTblAttendanceHistoryService;
import com.education.erp.util.ResponseUtil;
import com.education.erp.util.SchoolERPConstants;

/**
 * @author ejet_sys_3
 *This class is used for all AttendanceHistory defined in academicTblAttendanceHistory table API
 */
@Component
@RestController
@RequestMapping("value = /academic/attendancehistory")
public class AttendanceHistoryController {
	// LOGGER FOR MSG PRINT 
		private final Logger logger = LoggerFactory.getLogger(this.getClass());

@Autowired
@Qualifier("academicTblattendancehistoryServiceImpl")
AcademicTblAttendanceHistoryService attendanceHistoryServcie;

//GET MAPPING FOR ATTENDANCEHISTORY LIST
@GetMapping("academic/getallattendance")
public ResponseEntity<?> getattendance(){
	
	try 
	{
		List<AcademicTblAttendancehistory> attendancehistory = attendanceHistoryServcie.getallattendance();
		return ResponseUtil.successResponse(attendancehistory);
	}
	catch (NullPointerException e) 
	{
		logger.error("Attendancehistory_Error:-" + e.getMessage());
		return ResponseUtil.errorResponse(e.getMessage());
	}
	catch (Exception e) 
	{
		logger.error("Attendancehistory_Error:-" + e.getMessage());
		return ResponseUtil.errorResponse(e.getMessage());
	}
	//return attendanceHistoryServcie.getallattendance();
}

//FOR GET MAPPING FOR ATTENDANCEHISTORY BY ATTENDANCEID
@GetMapping("academic/getattendancebyattendanceid/(attendanceid)")
public ResponseEntity<?> getattendancebyattendanceid(@PathVariable("attendanceid") int attendanceid){
	try {
		AcademicTblAttendancehistory attendancehistory = attendanceHistoryServcie.getattendancebyattendanceid(attendanceid);
		return ResponseUtil.successResponse(attendancehistory);
	}
	catch(NullPointerException e) {
		logger.error("Attendancehistory_Error:-" + e.getMessage());
		return ResponseUtil.errorResponse(e.getMessage());
	}
	catch (Exception e) {
		logger.error("Attendancehistory_Error:-" + e.getMessage());
		return ResponseUtil.errorResponse(e.getMessage());
			
	}
}

//GET MAPPING FOR AATTENDANCEHISTORY BY CLASSID
	@GetMapping("academic/getattendancebyclassid/{classid}")
	
	public ResponseEntity<?> getattendancebyclassid(@PathVariable("classid") int classid) {

		try {

			AcademicTblAttendancehistory attendancehistory  = attendanceHistoryServcie.getattendancebyclassid(classid);

			return ResponseUtil.successResponse(attendancehistory);
		}

		catch (NullPointerException e) {
			logger.error("Attendancehistory_Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

		catch (Exception e) {
			logger.error("Attendancehistory_Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
		}

	}
	
// GET MAPPING FOR ATTENDANCEHISTORY BY ACADEMICID
		@GetMapping("academic/getattendancebyacademicid/{academicid}")
		
		public ResponseEntity<?> getattendancebyacademicid(@PathVariable("academicid") int academicid) {

			try {

				AcademicTblAttendancehistory attendancehistory = attendanceHistoryServcie.getattendancebyacademicid(academicid);

				return ResponseUtil.successResponse(attendancehistory);
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
		
//GET MAPPING FOR ATTENDANCEHISTORY BY CLASSNAME
		@GetMapping("academic/getattendancebyclassname/(classname)")
		public ResponseEntity<?>getattendancebyclassname(@PathVariable("classname") String classname){
			try {
				AcademicTblAttendancehistory attendancehistory = attendanceHistoryServcie.getattendancebyclassname(classname);
				return ResponseUtil.successResponse(attendancehistory);
			}
			catch(NullPointerException e) {
				logger.error("Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
			}
			catch (Exception e) {
				logger.error("Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
			}
		}
	
//for add AttendaceHistory / This API is used to enter the AttendanceHistory in AcademicTblAttendancehistory table
		@PostMapping("AcademicTblAttendancehistory/addattendancehistory")
		public ResponseEntity<?> addattendancehistory(@RequestBody AcademicTblAttendancehistoryBean academicTblAttendancehistoryBean)
		{
			try
			{
				AcademicTblAttendancehistory attendancehistory= attendanceHistoryServcie.addnewsection(academicTblAttendancehistoryBean);
				return ResponseUtil.successResponse(attendancehistory);
			}
		        catch (NullPointerException e) {
		        	logger.error("Attendancehistory_Error:-" + e.getMessage());
					return ResponseUtil.errorResponse(e.getMessage());
	        }

	            catch (Exception e) {
	            	logger.error("Attendancehistory_Error:-" + e.getMessage());
	    			return ResponseUtil.errorResponse(e.getMessage());	
		    }
		
	    }
		
//for Add AttendanceHistory/ (multiple)
		@PostMapping("AcademicTblAttendancehistory/addattendancehistory")
		public ResponseEntity<?> AcademicTblAttendaceHistory(@RequestBody List<AcademicTblAttendancehistoryBean> attendancehistoryBeanList) {
			
			try {
				for (AcademicTblAttendancehistoryBean atteancehistoryBean : attendancehistoryBeanList) {

					attendanceHistoryServcie.addnewsection(atteancehistoryBean);

				}
		
				return ResponseUtil.successResponse(SchoolERPConstants.EMPTY_STRING);

			} catch (NullPointerException e) {

				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());

			} catch (Exception e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
	        }
		}
		
//Put Mapping FOR AttendanceHistory UPDATE
		@PutMapping("AcademicTblAttendancehistory/updateattendancehistory")
		public ResponseEntity<?>updateattendancehistory(@RequestBody AcademicTblAttendancehistoryBean aatendancehistoryBean)
		{
			try
			{
				AcademicTblAttendancehistory attendancehistory = attendanceHistoryServcie.updateattendancehistory(aatendancehistoryBean);
				return ResponseUtil.successResponse(attendancehistory);
			}
			
			catch (NullPointerException e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
				
			}
			catch (Exception e)
			{
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
		    }			
	     }
		
		
		
//Delete Mapping FOR AcademicHistory by SectionId
		@DeleteMapping("AcademicTblAttendancehistory/Deleteattendancehistory/{sectionid}")
		public ResponseEntity<?>Deleteattendancehistory(@PathVariable("sectionid")Integer sectionid){
			
			try {
				AcademicTblAttendancehistory attendancehistory = attendanceHistoryServcie.Deleteattendancehistory(sectionid);
				return ResponseUtil.successResponse(attendancehistory);
			}

			catch (NullPointerException e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
			}

			catch (Exception e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
			}
			
		}
		
//Delete Mapping FOR AcademicHistory by StudentId 
		@DeleteMapping("AcademicTblAttendancehistory/Deleteattendancehistorybystudentid/{studentid}")
		public ResponseEntity<?>Deleteattendancehistorybystudentid(@PathVariable("studentid")Integer studentid){
					
			try {
				AcademicTblAttendancehistory attendancehistory = attendanceHistoryServcie.Deleteattendancehistorybystudentid(studentid);
				return ResponseUtil.successResponse(attendancehistory);
				}

				catch (NullPointerException e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
				}

				catch (Exception e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
					}
					
				}
		
//Delete Mapping FOR Attendance by ClassId
	   @DeleteMapping("AcademicTblAttendancehistory/Deleteattendancehistorybyclassid/{classid}")
	   public ResponseEntity<?>Deleteattendancehistorybyclassid(@PathVariable("classid")Integer classid){
							
	   try {
			AcademicTblAttendancehistory attendancehistory = attendanceHistoryServcie.Deleteattendancehistorybystudentid(classid);
			return ResponseUtil.successResponse(attendancehistory);
			}

			catch (NullPointerException e) {
			logger.error("Attendancehistory_Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
			}

			catch (Exception e) {
			logger.error("Attendancehistory_Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
			}
							
		}
			
//Delete Mapping FOR Attendance History by ClassName 
	   @DeleteMapping("AcademicTblAttendancehistory/Deleteattendancehistorybyclassname/{classname}")
	   public ResponseEntity<?>Deleteattendancehistorybyclassname(@PathVariable("classname")Integer classname){
							
	   try {
			AcademicTblAttendancehistory attendancehistory = attendanceHistoryServcie.Deleteattendancehistorybyclassname(classname);
			return ResponseUtil.successResponse(attendancehistory);
			}

			catch (NullPointerException e) {
			logger.error("Attendancehistory_Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
			}

			catch (Exception e) {
			logger.error("Attendancehistory_Error:-" + e.getMessage());
			return ResponseUtil.errorResponse(e.getMessage());
			}
							
		}
	   
// Post Mapping For save a Attendance History  !!
		@PostMapping("AcademicTblAttendancehistory/saveattendancehistory")
		public ResponseEntity<?> saveattendancehistory(@RequestBody AcademicTblAttendancehistoryBean attendancehistoryBean) {

			try {

				String saveattendancehistory = attendanceHistoryServcie.saveattendancehistory(attendancehistoryBean);

				return ResponseUtil.successResponse(saveattendancehistory);

			} catch (NullPointerException e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
			}

			catch (Exception e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());
			}

		}
	   
	      
		
// Post Mapping For save a Attendance History !!
	// save multiple
      @PostMapping("AcademicTblAttendancehistory/saveattendancehistory")
	  public ResponseEntity<?> saveMultipleattendancehistory(@RequestBody List<AcademicTblAttendancehistoryBean> attendancehistoryBeanList) {

			try {
				for (AcademicTblAttendancehistoryBean academicTblattendancehistoryBean : attendancehistoryBeanList) {

					attendanceHistoryServcie.saveMultipleattendancehistory(academicTblattendancehistoryBean);
				}

				return ResponseUtil.successResponse(SchoolERPConstants.EMPTY_STRING);

			} catch (NullPointerException e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());

			} catch (Exception e) {
				logger.error("Attendancehistory_Error:-" + e.getMessage());
				return ResponseUtil.errorResponse(e.getMessage());

			}

		}
      
      
      
}
	
