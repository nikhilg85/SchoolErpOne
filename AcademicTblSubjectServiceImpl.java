package com.education.erp.module.academic.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.education.erp.entity.AcademicTblClass;
import com.education.erp.entity.AcademicTblSection;
import com.education.erp.entity.AcademicTblSubject;
import com.education.erp.entity.ShareTblStudent;
import com.education.erp.module.academic.model.AcademicTblSubjectBean;
import com.education.erp.module.academic.service.AcademicTblSubjectService;
import com.education.erp.repository.AcademicTblClassRepository;
import com.education.erp.repository.AcademicTblSectionRepository;
import com.education.erp.repository.AcademicTblSubjectRepository;

public class AcademicTblSubjectServiceImpl implements AcademicTblSubjectService {

	private static final String classTbl = null;

	@Autowired
	AcademicTblSubjectRepository subjectRepository;
	
	@Autowired
	AcademicTblClassRepository classRepository;
	
	@Autowired
	AcademicTblSectionRepository sectionrepository;

	private AcademicTblSubjectBean academicTblSection;

	@Override
	public String save(AcademicTblSubjectBean academicTblSubjectBean) {
	
		String result="Subject error";
		
		
		AcademicTblSubject academicTblSubject=subjectRepository.findbySubjectId(academicTblSubjectBean.getSubjectId());


		/*//academicTblAttendancehistory.
		academicTblSubject.getAcademicTblSubject(academicTblSubjectBean.getSubjectId());
		academicTblSubject.setAcademicTblClass(academicTblSection.getAcademicTblClass());
		academicTblSubject.setAcademicTblSection(academicTblSection);
		academicTblSubject.setActiveFlag(1);
		*/
		
		
		Integer classid=academicTblSubjectBean.getAcademicTblClass();
		
		AcademicTblClass classobj=classRepository.findOne(classid);

		
		AcademicTblSubject subject = new AcademicTblSubject();
		
		subject.setAcademicTblClass(classobj);
		
		subjectRepository.save(subject);
		
			
		
		return null;

	}
	@Override
	public List<AcademicTblSubject> getSubjectForStudent(int subjectid, int studentid, int classid, String year, String month) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public AcademicTblSection getSubjectByStudentId(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<AcademicTblSubject> getAttendanceByStudentIdAndYearMonth(int studentId, String year,
			String month) {
		
		ShareTblStudent shareTblStudent =new ShareTblStudent();
		shareTblStudent.setStudentId(studentId);
		
		//List<AcademicTblSubject> AcademicTblSubject=subjectRepository.findByshareTblStudent(shareTblStudent);
		
		
		return null;
	}
	@Override
	public List<AcademicTblClass> getSubjectForStudent(int subjectid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<AcademicTblClass> getSubjectForStudent(int subjectid, int studentid, int classid) {
		// TODO Auto-generated method stub
		return null;
	}
	//@Override
	//public AcademicTblSubject getsubject(Integer classid) {
		// TODO Auto-generated method stub
	@Override
	public AcademicTblSubject getsubject(Integer classid) {
		// TODO Auto-generated method stub
		return null;
	}
	public AcademicTblSubjectBean getAcademicTblSection() {
		return academicTblSection;
	}
	public void setAcademicTblSection(AcademicTblSubjectBean academicTblSection) {
		this.academicTblSection = academicTblSection;
	}
		
	/*	checkNotNull(classid, schoolerpConstants.CLASS_ID_NULL);

		SubjectTbl subjecttbl = classRepository.findByclassidAndActiveflag(classid, 1);

		Set<Subject> subject = subjectRepository.findByClassAndActiveflag(classTbl, 1);

		return (AcademicTblSubject) subject;

	*/

	
	/*
	@Override
	public String save(AcademicTblSubjectBean academicTblSubjectBean) {
		
		
		Integer classid=academicTblSubjectBean.getAcademicTblClass();
		
		AcademicTblClass classobj=classRepository.findOne(classid);

		
		

    
		AcademicTblSubject subject = new AcademicTblSubject();
		
		subject.setAcademicTblClass(classobj);
		
		subjectRepository.save(subject);
		
		
		AcademicTblSubject academicTblSubject=new AcademicTblSubject();
		
		AcademicTblSubject academicTblSubject1=subjectRepository.findBySubjectId(academicTblSubjectBean.getSubjectId());
		
		
		academicTblSubject1.setAcademicId(attendanceBean.getAcademicId());
		academicTblSubject1.setAcademicTblClass(academicTblSection.getAcademicTblClass());
		academicTblSubject1.setAcademicTblSection(academicTblSection);
		academicTblSubject1.setActiveFlag(1);
		
		return null;
	}
*/
	
}
