package com.education.erp.module.academic.serviceImp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.education.erp.entity.AcademicTblClass;
import com.education.erp.entity.AcademicTblSection;
import com.education.erp.module.academic.model.AcademicTblSectionBean;
import com.education.erp.module.academic.service.AcademicTblSectionService;
import com.education.erp.repository.AcademicTblClassRepository;
import com.education.erp.repository.AcademicTblSectionRepository;

public class AcademicTblSectionServiceImpl implements AcademicTblSectionService{

	@Autowired
	AcademicTblSectionRepository sectionrepository;
	@Autowired
	AcademicTblClassRepository classrepository;
	


	@Override
	public List<AcademicTblSection> getallsection() {
		
		return  (List<AcademicTblSection>) sectionrepository.findAll();
	
	}

	@Override
	public AcademicTblSection getsectionbyid(int id) {
		
		
		return sectionrepository.findOne(id);
	}

	@Override
	public List<AcademicTblSection> getsectionbyacademicid(int id) {
		
		return  sectionrepository.findByAcademicId(id);
		
	}
	

	@SuppressWarnings("unused")
	@Override
	public AcademicTblSection addnewsection(AcademicTblSectionBean academicTblSectionBean) {
		String result="Section error";
	
		AcademicTblSection sectionone = new AcademicTblSection();
		sectionone.setAcademicId(academicTblSectionBean.getAcademicId());
		sectionone.setSectionName(academicTblSectionBean.getSectionName());
		Integer classid=academicTblSectionBean.getClassId();
		AcademicTblClass classobj=classrepository.findOne(classid);
		sectionone.setAcademicTblClass(classobj);
        sectionone.setCreateDate(academicTblSectionBean.getCreateDate());
        sectionone.setSectionId(academicTblSectionBean.getSectionId());
        sectionone.setSectionName(academicTblSectionBean.getSectionName());
        sectionone.setUpdateDate(academicTblSectionBean.getUpdateDate());
		//sectionone.setActiveFlag(1);
		sectionone.setActiveFlag(academicTblSectionBean.getActiveFlag());
		
		sectionone=sectionrepository.save(sectionone);
		
		result="section add successful";
		return sectionone;
	}

	@Override
	public AcademicTblSection getsectionbyid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AcademicTblSection> getsectionbyacademicid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblSection getsectionbysectionname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblSection updatesection(AcademicTblSectionBean academicTblSectionBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblSection deletesection(Integer sectionid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AcademicTblSection> getSectionByempstaffidIdAndYearMonth(int empstaffid, String year, String month) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String savesectiondetails(AcademicTblSectionBean academicTblSectionBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(AcademicTblSectionBean academicTblSectionBeans) {
		// TODO Auto-generated method stub
		return null;
	}
		


	@Override
	public AcademicTblSection updatesection(AcademicTblSectionBean academicTblSectionBean) {
		AcademicTblSection sectionone = sectionrepository.findOne(academicTblSectionBean.getSectionId());
		sectionone.setAcademicId(academicTblSectionBean.getAcademicId());
		
		sectionone.setSectionName(academicTblSectionBean.getSectionName());
		sectionone.setActiveFlag(1);
		
		Integer classid=academicTblSectionBean.getClassId();
		AcademicTblClass classobj=classrepository.findOne(classid);
		
		sectionone.setAcademicTblClass(classobj);
        sectionone.setCreateDate(academicTblSectionBean.getCreateDate());
        sectionone.setSectionId(academicTblSectionBean.getSectionId());
        sectionone.setSectionName(academicTblSectionBean.getSectionName());
        sectionone.setUpdateDate(academicTblSectionBean.getUpdateDate());
        
		
		sectionone=sectionrepository.save(sectionone);
		
		//result="section take successful";
		return sectionone;
		
	}

	@Override
	public AcademicTblSection deletesection(Integer sectionid) {
		
		sectionrepository.delete(sectionid);
		return null;
	}

	@Override
	public AcademicTblSection getsectionbysectionname(String name) {
		sectionrepository.findBySectionName(name);
		return null;
	}

	@Override
	public List<AcademicTblSection> getSectionByempstaffidIdAndYearMonth(int empstaffid, String year, String month) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public String savesectiondetails(AcademicTblSectionBean academicTblSectionBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save(AcademicTblSectionBean academicTblSectionBeans) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AcademicTblSection getsectionbyid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AcademicTblSection> getsectionbyacademicid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
