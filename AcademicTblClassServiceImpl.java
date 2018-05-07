package com.education.erp.module.academic.serviceImp;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.education.erp.entity.AcademicTblClass;
import com.education.erp.module.academic.model.AcademicTblClassBean;
import com.education.erp.module.academic.service.AcademicTblClassService;
import com.education.erp.repository.AcademicTblClassRepository;
import com.education.erp.repository.AcademicTblSectionRepository;
import com.education.erp.repository.AcademicTblTeacherAssignRepository;
import com.education.erp.util.SchoolERPConstants;

@Service
public class AcademicTblClassServiceImpl implements AcademicTblClassService {

	@Autowired
	AcademicTblClassRepository classRepository;
	@Autowired
	AcademicTblSectionRepository sectionrepository;
	@Autowired
	AcademicTblTeacherAssignRepository teacherrepository;
	

	@Transactional(readOnly = true)
	
	@Override
	public List<AcademicTblClass> getallClass() {
		
		return  (List<AcademicTblClass>) classRepository.findAll();
	
	}

	
	public AcademicTblClass getclassbyid(Integer classid) {

		AcademicTblClass classTbl = classRepository.findOne(classid);
		checkNotNull(classTbl, SchoolERPConstants.CLASS_ID_NOT_EXISTS);

		
		//add data accourding table 
		
		return classTbl;

	}
	

	@SuppressWarnings("unused")
	@Transactional
	public AcademicTblClass save(AcademicTblClassBean academicTblClassBean) {
		String result="Section error";

		//checkNotNull(academicTblClassBean.getClassname(), SchoolERPConstants.CLASS_NAME_NULL);

		// Save data Class table
		AcademicTblClass classTbl = new AcademicTblClass();
		
		//add data in setter to entity
		
		classTbl.setAcademicId(academicTblClassBean.getAcademic_id());
		
		classTbl.setClassName(academicTblClassBean.getClassname());
		//sectionone.setActiveFlag(1);
		classTbl.setActiveFlag(academicTblClassBean.getActiveflag());
		classTbl.setCreateDate(academicTblClassBean.getCreatedate());
		classTbl.setClassId(academicTblClassBean.getClassid());
		classTbl.setCreatedBy(academicTblClassBean.getCreatedby());
		classTbl.setUpdateDate(academicTblClassBean.getUpdate());
		
		Integer classid=academicTblClassBean.getClassId();
		AcademicTblClass classobj=classRepository.findOne(classid);
        
		classTbl = classRepository.save(classTbl);

		return classTbl;

	}

	@Transactional
	public AcademicTblClass save(AcademicTblClass classTbl) {

		return classRepository.save(classTbl);
	}

	// remove means set the class to disable 0

	@Transactional
	public AcademicTblClass removeclass(int classid) {

		AcademicTblClass classTbl = classRepository.findOne(classid);
		checkNotNull(classTbl,SchoolERPConstants.CLASS_ID_NOT_EXISTS);

		///implememnt delete class code
		//TODO

		return null;
	}

	@Override
	@Transactional
	public AcademicTblClass updateClass(Integer classid, String classname) {

		AcademicTblClass classTbl = classRepository.findOne(classid);
		checkNotNull(classTbl, SchoolERPConstants.CLASS_ID_NOT_EXISTS);

		
		//classTbl.setName(classname);
		//classTbl.setClassid(classid);
		
		
		classRepository.save(classTbl);

		return classTbl;

	}

	@Override
	public List<AcademicTblClass> getallclass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblClass getclassbyclassid(int classid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AcademicTblClass> getclassbyacademicid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblClass getclassbyclassname(String classname) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public AcademicTblClass getbyacademicid(int academicid) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public AcademicTblClass getClass(Integer classid) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public AcademicTblClass getbyacademicid(Integer academic) {
		// TODO Auto-generated method stub
		return null;
	}

}
