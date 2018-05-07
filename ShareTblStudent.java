package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the share_tbl_student database table.
 * 
 */
@Entity
@Table(name="share_tbl_student")
@NamedQuery(name="ShareTblStudent.findAll", query="SELECT s FROM ShareTblStudent s")
public class ShareTblStudent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private Integer studentId;

	@Column(name="academic_id")
	private Integer academicId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="addmission_no")
	private Integer addmissionNo;

	@Column(name="address_1")
	private String address1;

	@Column(name="blood_group")
	private String bloodGroup;

	@Column(name="class_id")
	private Integer classId;

	@Column(name="create_date")
	private Date createDate;

	@Temporal(TemporalType.DATE)
	@Column(name="dob")
	private Date dateOfBirth;

	@Column(name="first_name")
	private String firstName;

	private String language;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="mobile_no")
	private String mobileNo;

	private String nationality;

	@Column(name="parent_id")
	private Integer parentId;

	@Column(name="percent_ofphysically_disabled")
	private String percentOfphysicallyDisabled;

	@Column(name="permanant_address_id")
	private Integer permanantAddressId;

	@Column(name="phone_no")
	private String phoneNo;


	@Column(name="photo")
	private String photoUrl;
	
	

	@Column(name="physically_disiabled")
	private Boolean physicallyDisiabled;

	@Column(name="prev_course")
	private String prevCourse;

	@Column(name="prev_institute_year")
	private String prevInstituteYear;

	@Column(name="prev_total_marks")
	private Integer prevTotalMarks;

	@Column(name="previous_institution")
	private String previousInstitution;

	private String religion;

	@Column(name="roll_no")
	private Integer rollNo;

	@Column(name="section_id")
	private Integer sectionId;

	@Column(name="staff_id")
	private Integer staffId;

	@Column(name="student_category_id")
	private Integer studentCategoryId;

	@Column(name="update_date")
	private Date updateDate;

	@Column(name="user_id")
	private Integer userId;

	//bi-directional many-to-one association to AcademicTblAttendancehistory
	@OneToMany(mappedBy="shareTblStudent")
	private Set<AcademicTblAttendancehistory> academicTblAttendancehistories;

	//bi-directional many-to-one association to AcademicTblAttendancesummary
	@OneToMany(mappedBy="shareTblStudent")
	private Set<AcademicTblAttendancesummary> academicTblAttendancesummaries;

	//bi-directional many-to-one association to AcademicTblTeacherAssign
	@OneToMany(mappedBy="shareTblStudent")
	private Set<AcademicTblTeacherAssign> academicTblTeacherAssigns;

	//bi-directional many-to-one association to FeeTblFeediscount
	@OneToMany(mappedBy="shareTblStudent")
	private Set<FeeTblFeediscount> feeTblFeediscounts;

	//bi-directional many-to-one association to FeeTblFeesubscription
	@OneToMany(mappedBy="shareTblStudent")
	private Set<FeeTblFeesubscription> feeTblFeesubscriptions;

	//bi-directional many-to-one association to FeeTblInvoice
	@OneToMany(mappedBy="shareTblStudent")
	private Set<FeeTblInvoice> feeTblInvoices;

	//bi-directional many-to-one association to FeeTblLadger
	@OneToMany(mappedBy="shareTblStudent")
	private Set<FeeTblLadger> feeTblLadgers;

	//bi-directional many-to-one association to FeeTblTotalfeesubscription
	@OneToMany(mappedBy="shareTblStudent")
	private Set<FeeTblTotalfeesubscription> feeTblTotalfeesubscriptions;

	public ShareTblStudent() {
	}

	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getAcademicId() {
		return this.academicId;
	}

	public void setAcademicId(Integer academicId) {
		this.academicId = academicId;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Integer getAddmissionNo() {
		return this.addmissionNo;
	}

	public void setAddmissionNo(Integer addmissionNo) {
		this.addmissionNo = addmissionNo;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getPercentOfphysicallyDisabled() {
		return this.percentOfphysicallyDisabled;
	}

	public void setPercentOfphysicallyDisabled(String percentOfphysicallyDisabled) {
		this.percentOfphysicallyDisabled = percentOfphysicallyDisabled;
	}

	public Integer getPermanantAddressId() {
		return this.permanantAddressId;
	}

	public void setPermanantAddressId(Integer permanantAddressId) {
		this.permanantAddressId = permanantAddressId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Boolean getPhysicallyDisiabled() {
		return this.physicallyDisiabled;
	}

	public void setPhysicallyDisiabled(Boolean physicallyDisiabled) {
		this.physicallyDisiabled = physicallyDisiabled;
	}

	public String getPrevCourse() {
		return this.prevCourse;
	}

	public void setPrevCourse(String prevCourse) {
		this.prevCourse = prevCourse;
	}

	public String getPrevInstituteYear() {
		return this.prevInstituteYear;
	}

	public void setPrevInstituteYear(String prevInstituteYear) {
		this.prevInstituteYear = prevInstituteYear;
	}

	public Integer getPrevTotalMarks() {
		return this.prevTotalMarks;
	}

	public void setPrevTotalMarks(Integer prevTotalMarks) {
		this.prevTotalMarks = prevTotalMarks;
	}

	public String getPreviousInstitution() {
		return this.previousInstitution;
	}

	public void setPreviousInstitution(String previousInstitution) {
		this.previousInstitution = previousInstitution;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Integer getRollNo() {
		return this.rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public Integer getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Integer getStudentCategoryId() {
		return this.studentCategoryId;
	}

	public void setStudentCategoryId(Integer studentCategoryId) {
		this.studentCategoryId = studentCategoryId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Set<AcademicTblAttendancehistory> getAcademicTblAttendancehistories() {
		return this.academicTblAttendancehistories;
	}

	public void setAcademicTblAttendancehistories(Set<AcademicTblAttendancehistory> academicTblAttendancehistories) {
		this.academicTblAttendancehistories = academicTblAttendancehistories;
	}

	public AcademicTblAttendancehistory addAcademicTblAttendancehistory(AcademicTblAttendancehistory academicTblAttendancehistory) {
		getAcademicTblAttendancehistories().add(academicTblAttendancehistory);
		academicTblAttendancehistory.setShareTblStudent(this);

		return academicTblAttendancehistory;
	}

	public AcademicTblAttendancehistory removeAcademicTblAttendancehistory(AcademicTblAttendancehistory academicTblAttendancehistory) {
		getAcademicTblAttendancehistories().remove(academicTblAttendancehistory);
		academicTblAttendancehistory.setShareTblStudent(null);

		return academicTblAttendancehistory;
	}

	public Set<AcademicTblAttendancesummary> getAcademicTblAttendancesummaries() {
		return this.academicTblAttendancesummaries;
	}

	public void setAcademicTblAttendancesummaries(Set<AcademicTblAttendancesummary> academicTblAttendancesummaries) {
		this.academicTblAttendancesummaries = academicTblAttendancesummaries;
	}

	public AcademicTblAttendancesummary addAcademicTblAttendancesummary(AcademicTblAttendancesummary academicTblAttendancesummary) {
		getAcademicTblAttendancesummaries().add(academicTblAttendancesummary);
		academicTblAttendancesummary.setShareTblStudent(this);

		return academicTblAttendancesummary;
	}

	public AcademicTblAttendancesummary removeAcademicTblAttendancesummary(AcademicTblAttendancesummary academicTblAttendancesummary) {
		getAcademicTblAttendancesummaries().remove(academicTblAttendancesummary);
		academicTblAttendancesummary.setShareTblStudent(null);

		return academicTblAttendancesummary;
	}

	public Set<AcademicTblTeacherAssign> getAcademicTblTeacherAssigns() {
		return this.academicTblTeacherAssigns;
	}

	public void setAcademicTblTeacherAssigns(Set<AcademicTblTeacherAssign> academicTblTeacherAssigns) {
		this.academicTblTeacherAssigns = academicTblTeacherAssigns;
	}

	public AcademicTblTeacherAssign addAcademicTblTeacherAssign(AcademicTblTeacherAssign academicTblTeacherAssign) {
		getAcademicTblTeacherAssigns().add(academicTblTeacherAssign);
		academicTblTeacherAssign.setShareTblStudent(this);

		return academicTblTeacherAssign;
	}

	public AcademicTblTeacherAssign removeAcademicTblTeacherAssign(AcademicTblTeacherAssign academicTblTeacherAssign) {
		getAcademicTblTeacherAssigns().remove(academicTblTeacherAssign);
		academicTblTeacherAssign.setShareTblStudent(null);

		return academicTblTeacherAssign;
	}

	public Set<FeeTblFeediscount> getFeeTblFeediscounts() {
		return this.feeTblFeediscounts;
	}

	public void setFeeTblFeediscounts(Set<FeeTblFeediscount> feeTblFeediscounts) {
		this.feeTblFeediscounts = feeTblFeediscounts;
	}

	public FeeTblFeediscount addFeeTblFeediscount(FeeTblFeediscount feeTblFeediscount) {
		getFeeTblFeediscounts().add(feeTblFeediscount);
		feeTblFeediscount.setShareTblStudent(this);

		return feeTblFeediscount;
	}

	public FeeTblFeediscount removeFeeTblFeediscount(FeeTblFeediscount feeTblFeediscount) {
		getFeeTblFeediscounts().remove(feeTblFeediscount);
		feeTblFeediscount.setShareTblStudent(null);

		return feeTblFeediscount;
	}

	public Set<FeeTblFeesubscription> getFeeTblFeesubscriptions() {
		return this.feeTblFeesubscriptions;
	}

	public void setFeeTblFeesubscriptions(Set<FeeTblFeesubscription> feeTblFeesubscriptions) {
		this.feeTblFeesubscriptions = feeTblFeesubscriptions;
	}

	public FeeTblFeesubscription addFeeTblFeesubscription(FeeTblFeesubscription feeTblFeesubscription) {
		getFeeTblFeesubscriptions().add(feeTblFeesubscription);
		feeTblFeesubscription.setShareTblStudent(this);

		return feeTblFeesubscription;
	}

	public FeeTblFeesubscription removeFeeTblFeesubscription(FeeTblFeesubscription feeTblFeesubscription) {
		getFeeTblFeesubscriptions().remove(feeTblFeesubscription);
		feeTblFeesubscription.setShareTblStudent(null);

		return feeTblFeesubscription;
	}

	public Set<FeeTblInvoice> getFeeTblInvoices() {
		return this.feeTblInvoices;
	}

	public void setFeeTblInvoices(Set<FeeTblInvoice> feeTblInvoices) {
		this.feeTblInvoices = feeTblInvoices;
	}

	public FeeTblInvoice addFeeTblInvoice(FeeTblInvoice feeTblInvoice) {
		getFeeTblInvoices().add(feeTblInvoice);
		feeTblInvoice.setShareTblStudent(this);

		return feeTblInvoice;
	}

	public FeeTblInvoice removeFeeTblInvoice(FeeTblInvoice feeTblInvoice) {
		getFeeTblInvoices().remove(feeTblInvoice);
		feeTblInvoice.setShareTblStudent(null);

		return feeTblInvoice;
	}

	public Set<FeeTblLadger> getFeeTblLadgers() {
		return this.feeTblLadgers;
	}

	public void setFeeTblLadgers(Set<FeeTblLadger> feeTblLadgers) {
		this.feeTblLadgers = feeTblLadgers;
	}

	public FeeTblLadger addFeeTblLadger(FeeTblLadger feeTblLadger) {
		getFeeTblLadgers().add(feeTblLadger);
		feeTblLadger.setShareTblStudent(this);

		return feeTblLadger;
	}

	public FeeTblLadger removeFeeTblLadger(FeeTblLadger feeTblLadger) {
		getFeeTblLadgers().remove(feeTblLadger);
		feeTblLadger.setShareTblStudent(null);

		return feeTblLadger;
	}

	public Set<FeeTblTotalfeesubscription> getFeeTblTotalfeesubscriptions() {
		return this.feeTblTotalfeesubscriptions;
	}

	public void setFeeTblTotalfeesubscriptions(Set<FeeTblTotalfeesubscription> feeTblTotalfeesubscriptions) {
		this.feeTblTotalfeesubscriptions = feeTblTotalfeesubscriptions;
	}

	public FeeTblTotalfeesubscription addFeeTblTotalfeesubscription(FeeTblTotalfeesubscription feeTblTotalfeesubscription) {
		getFeeTblTotalfeesubscriptions().add(feeTblTotalfeesubscription);
		feeTblTotalfeesubscription.setShareTblStudent(this);

		return feeTblTotalfeesubscription;
	}

	public FeeTblTotalfeesubscription removeFeeTblTotalfeesubscription(FeeTblTotalfeesubscription feeTblTotalfeesubscription) {
		getFeeTblTotalfeesubscriptions().remove(feeTblTotalfeesubscription);
		feeTblTotalfeesubscription.setShareTblStudent(null);

		return feeTblTotalfeesubscription;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}