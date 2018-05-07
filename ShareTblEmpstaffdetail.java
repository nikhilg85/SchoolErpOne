package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the share_tbl_empstaffdetails database table.
 * 
 */
@Entity
@Table(name="share_tbl_empstaffdetails")
@NamedQuery(name="ShareTblEmpstaffdetail.findAll", query="SELECT s FROM ShareTblEmpstaffdetail s")
public class ShareTblEmpstaffdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private Integer employeeId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="address_id_current")
	private Integer addressIdCurrent;

	@Column(name="address_id_permanent")
	private Integer addressIdPermanent;

	@Column(name="address1_current")
	private String address1Current;

	@Column(name="address1_permanent")
	private String address1Permanent;

	@Column(name="blood_group")
	private String bloodGroup;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="department_id")
	private Integer departmentId;

	@Temporal(TemporalType.DATE)
	@Column(name="dob")
	private Date dateOfBirth;

	@Column(name="employee_admin_id")
	private Integer employeeAdminId;

	@Column(name="first_name")
	private String firstName;

	private Boolean gender;

	@Column(name="last_name")
	private String lastName;

	@Column(name="marital_status")
	private Boolean maritalStatus;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="mobile_no")
	private String mobileNo;

	@Column(name="phone_no")
	private String phoneNo;

	@Column(name="position_details")
	private String positionDetails;

	@Column(name="profile_image")
	private String profileImage;

	@Column(name="staff_usertype_id")
	private Integer staffUsertypeId;

	@Column(name="update_date")
	private Date updateDate;

	@Column(name="user_id")
	private Integer userId;

	//bi-directional many-to-one association to AcademicTblAttendancehistory
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<AcademicTblAttendancehistory> academicTblAttendancehistories;

	//bi-directional many-to-one association to AcademicTblClasstime
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<AcademicTblClasstime> academicTblClasstimes;

	//bi-directional one-to-one association to AcademicTblSubject
	@OneToOne(mappedBy="shareTblEmpstaffdetail", fetch=FetchType.LAZY)
	private AcademicTblSubject academicTblSubject;

	//bi-directional many-to-one association to AcademicTblTeacherAssign
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<AcademicTblTeacherAssign> academicTblTeacherAssigns;

	//bi-directional many-to-one association to AcademicTblTimetable
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<AcademicTblTimetable> academicTblTimetables;

	//bi-directional many-to-one association to AcademicTblWeekday
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<AcademicTblWeekday> academicTblWeekdays;

	//bi-directional many-to-one association to FeeTblDiscounttype
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblDiscounttype> feeTblDiscounttypes;

	//bi-directional many-to-one association to FeeTblFeecategory
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblFeecategory> feeTblFeecategories;

	//bi-directional many-to-one association to FeeTblFeediscount
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblFeediscount> feeTblFeediscounts;

	//bi-directional many-to-one association to FeeTblFeehead
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblFeehead> feeTblFeeheads;

	//bi-directional many-to-one association to FeeTblFeesubscription
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblFeesubscription> feeTblFeesubscriptions;

	//bi-directional many-to-one association to FeeTblInvoice
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblInvoice> feeTblInvoices;

	//bi-directional many-to-one association to FeeTblLadger
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblLadger> feeTblLadgers;

	//bi-directional many-to-one association to FeeTblPayablemode
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblPayablemode> feeTblPayablemodes;

	//bi-directional many-to-one association to FeeTblTotalfeesubscription
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblTotalfeesubscription> feeTblTotalfeesubscriptions;

	//bi-directional many-to-one association to FeeTblTransaction
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<FeeTblTransaction> feeTblTransactions;

	//bi-directional many-to-one association to ShareTblAcademicyear
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<ShareTblAcademicyear> shareTblAcademicyears;

	//bi-directional many-to-one association to ShareTblAnnualholiday
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<ShareTblAnnualholiday> shareTblAnnualholidays;

	//bi-directional many-to-one association to ShareTblDepartment
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<ShareTblDepartment> shareTblDepartments;

	//bi-directional many-to-one association to ShareTblDocumentlist
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<ShareTblDocumentlist> shareTblDocumentlists;

	//bi-directional many-to-one association to ShareTblEventtype
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<ShareTblEventtype> shareTblEventtypes;

	//bi-directional many-to-one association to ShareTblExperienceemp
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<ShareTblExperienceemp> shareTblExperienceemps;

	//bi-directional many-to-one association to ShareTblQualificationemp
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<ShareTblQualificationemp> shareTblQualificationemps;

	//bi-directional many-to-one association to ShareTblStudentCategory
	@OneToMany(mappedBy="shareTblEmpstaffdetail")
	private Set<ShareTblStudentCategory> shareTblStudentCategories;

	public ShareTblEmpstaffdetail() {
	}

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Integer getAddressIdCurrent() {
		return this.addressIdCurrent;
	}

	public void setAddressIdCurrent(Integer addressIdCurrent) {
		this.addressIdCurrent = addressIdCurrent;
	}

	public Integer getAddressIdPermanent() {
		return this.addressIdPermanent;
	}

	public void setAddressIdPermanent(Integer addressIdPermanent) {
		this.addressIdPermanent = addressIdPermanent;
	}

	public String getAddress1Current() {
		return this.address1Current;
	}

	public void setAddress1Current(String address1Current) {
		this.address1Current = address1Current;
	}

	public String getAddress1Permanent() {
		return this.address1Permanent;
	}

	public void setAddress1Permanent(String address1Permanent) {
		this.address1Permanent = address1Permanent;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Integer getEmployeeAdminId() {
		return this.employeeAdminId;
	}

	public void setEmployeeAdminId(Integer employeeAdminId) {
		this.employeeAdminId = employeeAdminId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Boolean getGender() {
		return this.gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(Boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
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

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPositionDetails() {
		return this.positionDetails;
	}

	public void setPositionDetails(String positionDetails) {
		this.positionDetails = positionDetails;
	}

	public String getProfileImage() {
		return this.profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public Integer getStaffUsertypeId() {
		return this.staffUsertypeId;
	}

	public void setStaffUsertypeId(Integer staffUsertypeId) {
		this.staffUsertypeId = staffUsertypeId;
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
		academicTblAttendancehistory.setShareTblEmpstaffdetail(this);

		return academicTblAttendancehistory;
	}

	public AcademicTblAttendancehistory removeAcademicTblAttendancehistory(AcademicTblAttendancehistory academicTblAttendancehistory) {
		getAcademicTblAttendancehistories().remove(academicTblAttendancehistory);
		academicTblAttendancehistory.setShareTblEmpstaffdetail(null);

		return academicTblAttendancehistory;
	}

	public Set<AcademicTblClasstime> getAcademicTblClasstimes() {
		return this.academicTblClasstimes;
	}

	public void setAcademicTblClasstimes(Set<AcademicTblClasstime> academicTblClasstimes) {
		this.academicTblClasstimes = academicTblClasstimes;
	}

	public AcademicTblClasstime addAcademicTblClasstime(AcademicTblClasstime academicTblClasstime) {
		getAcademicTblClasstimes().add(academicTblClasstime);
		academicTblClasstime.setShareTblEmpstaffdetail(this);

		return academicTblClasstime;
	}

	public AcademicTblClasstime removeAcademicTblClasstime(AcademicTblClasstime academicTblClasstime) {
		getAcademicTblClasstimes().remove(academicTblClasstime);
		academicTblClasstime.setShareTblEmpstaffdetail(null);

		return academicTblClasstime;
	}

	public AcademicTblSubject getAcademicTblSubject() {
		return this.academicTblSubject;
	}

	public void setAcademicTblSubject(AcademicTblSubject academicTblSubject) {
		this.academicTblSubject = academicTblSubject;
	}

	public Set<AcademicTblTeacherAssign> getAcademicTblTeacherAssigns() {
		return this.academicTblTeacherAssigns;
	}

	public void setAcademicTblTeacherAssigns(Set<AcademicTblTeacherAssign> academicTblTeacherAssigns) {
		this.academicTblTeacherAssigns = academicTblTeacherAssigns;
	}

	public AcademicTblTeacherAssign addAcademicTblTeacherAssign(AcademicTblTeacherAssign academicTblTeacherAssign) {
		getAcademicTblTeacherAssigns().add(academicTblTeacherAssign);
		academicTblTeacherAssign.setShareTblEmpstaffdetail(this);

		return academicTblTeacherAssign;
	}

	public AcademicTblTeacherAssign removeAcademicTblTeacherAssign(AcademicTblTeacherAssign academicTblTeacherAssign) {
		getAcademicTblTeacherAssigns().remove(academicTblTeacherAssign);
		academicTblTeacherAssign.setShareTblEmpstaffdetail(null);

		return academicTblTeacherAssign;
	}

	public Set<AcademicTblTimetable> getAcademicTblTimetables() {
		return this.academicTblTimetables;
	}

	public void setAcademicTblTimetables(Set<AcademicTblTimetable> academicTblTimetables) {
		this.academicTblTimetables = academicTblTimetables;
	}

	public AcademicTblTimetable addAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().add(academicTblTimetable);
		academicTblTimetable.setShareTblEmpstaffdetail(this);

		return academicTblTimetable;
	}

	public AcademicTblTimetable removeAcademicTblTimetable(AcademicTblTimetable academicTblTimetable) {
		getAcademicTblTimetables().remove(academicTblTimetable);
		academicTblTimetable.setShareTblEmpstaffdetail(null);

		return academicTblTimetable;
	}

	public Set<AcademicTblWeekday> getAcademicTblWeekdays() {
		return this.academicTblWeekdays;
	}

	public void setAcademicTblWeekdays(Set<AcademicTblWeekday> academicTblWeekdays) {
		this.academicTblWeekdays = academicTblWeekdays;
	}

	public AcademicTblWeekday addAcademicTblWeekday(AcademicTblWeekday academicTblWeekday) {
		getAcademicTblWeekdays().add(academicTblWeekday);
		academicTblWeekday.setShareTblEmpstaffdetail(this);

		return academicTblWeekday;
	}

	public AcademicTblWeekday removeAcademicTblWeekday(AcademicTblWeekday academicTblWeekday) {
		getAcademicTblWeekdays().remove(academicTblWeekday);
		academicTblWeekday.setShareTblEmpstaffdetail(null);

		return academicTblWeekday;
	}

	public Set<FeeTblDiscounttype> getFeeTblDiscounttypes() {
		return this.feeTblDiscounttypes;
	}

	public void setFeeTblDiscounttypes(Set<FeeTblDiscounttype> feeTblDiscounttypes) {
		this.feeTblDiscounttypes = feeTblDiscounttypes;
	}

	public FeeTblDiscounttype addFeeTblDiscounttype(FeeTblDiscounttype feeTblDiscounttype) {
		getFeeTblDiscounttypes().add(feeTblDiscounttype);
		feeTblDiscounttype.setShareTblEmpstaffdetail(this);

		return feeTblDiscounttype;
	}

	public FeeTblDiscounttype removeFeeTblDiscounttype(FeeTblDiscounttype feeTblDiscounttype) {
		getFeeTblDiscounttypes().remove(feeTblDiscounttype);
		feeTblDiscounttype.setShareTblEmpstaffdetail(null);

		return feeTblDiscounttype;
	}

	public Set<FeeTblFeecategory> getFeeTblFeecategories() {
		return this.feeTblFeecategories;
	}

	public void setFeeTblFeecategories(Set<FeeTblFeecategory> feeTblFeecategories) {
		this.feeTblFeecategories = feeTblFeecategories;
	}

	public FeeTblFeecategory addFeeTblFeecategory(FeeTblFeecategory feeTblFeecategory) {
		getFeeTblFeecategories().add(feeTblFeecategory);
		feeTblFeecategory.setShareTblEmpstaffdetail(this);

		return feeTblFeecategory;
	}

	public FeeTblFeecategory removeFeeTblFeecategory(FeeTblFeecategory feeTblFeecategory) {
		getFeeTblFeecategories().remove(feeTblFeecategory);
		feeTblFeecategory.setShareTblEmpstaffdetail(null);

		return feeTblFeecategory;
	}

	public Set<FeeTblFeediscount> getFeeTblFeediscounts() {
		return this.feeTblFeediscounts;
	}

	public void setFeeTblFeediscounts(Set<FeeTblFeediscount> feeTblFeediscounts) {
		this.feeTblFeediscounts = feeTblFeediscounts;
	}

	public FeeTblFeediscount addFeeTblFeediscount(FeeTblFeediscount feeTblFeediscount) {
		getFeeTblFeediscounts().add(feeTblFeediscount);
		feeTblFeediscount.setShareTblEmpstaffdetail(this);

		return feeTblFeediscount;
	}

	public FeeTblFeediscount removeFeeTblFeediscount(FeeTblFeediscount feeTblFeediscount) {
		getFeeTblFeediscounts().remove(feeTblFeediscount);
		feeTblFeediscount.setShareTblEmpstaffdetail(null);

		return feeTblFeediscount;
	}

	public Set<FeeTblFeehead> getFeeTblFeeheads() {
		return this.feeTblFeeheads;
	}

	public void setFeeTblFeeheads(Set<FeeTblFeehead> feeTblFeeheads) {
		this.feeTblFeeheads = feeTblFeeheads;
	}

	public FeeTblFeehead addFeeTblFeehead(FeeTblFeehead feeTblFeehead) {
		getFeeTblFeeheads().add(feeTblFeehead);
		feeTblFeehead.setShareTblEmpstaffdetail(this);

		return feeTblFeehead;
	}

	public FeeTblFeehead removeFeeTblFeehead(FeeTblFeehead feeTblFeehead) {
		getFeeTblFeeheads().remove(feeTblFeehead);
		feeTblFeehead.setShareTblEmpstaffdetail(null);

		return feeTblFeehead;
	}

	public Set<FeeTblFeesubscription> getFeeTblFeesubscriptions() {
		return this.feeTblFeesubscriptions;
	}

	public void setFeeTblFeesubscriptions(Set<FeeTblFeesubscription> feeTblFeesubscriptions) {
		this.feeTblFeesubscriptions = feeTblFeesubscriptions;
	}

	public FeeTblFeesubscription addFeeTblFeesubscription(FeeTblFeesubscription feeTblFeesubscription) {
		getFeeTblFeesubscriptions().add(feeTblFeesubscription);
		feeTblFeesubscription.setShareTblEmpstaffdetail(this);

		return feeTblFeesubscription;
	}

	public FeeTblFeesubscription removeFeeTblFeesubscription(FeeTblFeesubscription feeTblFeesubscription) {
		getFeeTblFeesubscriptions().remove(feeTblFeesubscription);
		feeTblFeesubscription.setShareTblEmpstaffdetail(null);

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
		feeTblInvoice.setShareTblEmpstaffdetail(this);

		return feeTblInvoice;
	}

	public FeeTblInvoice removeFeeTblInvoice(FeeTblInvoice feeTblInvoice) {
		getFeeTblInvoices().remove(feeTblInvoice);
		feeTblInvoice.setShareTblEmpstaffdetail(null);

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
		feeTblLadger.setShareTblEmpstaffdetail(this);

		return feeTblLadger;
	}

	public FeeTblLadger removeFeeTblLadger(FeeTblLadger feeTblLadger) {
		getFeeTblLadgers().remove(feeTblLadger);
		feeTblLadger.setShareTblEmpstaffdetail(null);

		return feeTblLadger;
	}

	public Set<FeeTblPayablemode> getFeeTblPayablemodes() {
		return this.feeTblPayablemodes;
	}

	public void setFeeTblPayablemodes(Set<FeeTblPayablemode> feeTblPayablemodes) {
		this.feeTblPayablemodes = feeTblPayablemodes;
	}

	public FeeTblPayablemode addFeeTblPayablemode(FeeTblPayablemode feeTblPayablemode) {
		getFeeTblPayablemodes().add(feeTblPayablemode);
		feeTblPayablemode.setShareTblEmpstaffdetail(this);

		return feeTblPayablemode;
	}

	public FeeTblPayablemode removeFeeTblPayablemode(FeeTblPayablemode feeTblPayablemode) {
		getFeeTblPayablemodes().remove(feeTblPayablemode);
		feeTblPayablemode.setShareTblEmpstaffdetail(null);

		return feeTblPayablemode;
	}

	public Set<FeeTblTotalfeesubscription> getFeeTblTotalfeesubscriptions() {
		return this.feeTblTotalfeesubscriptions;
	}

	public void setFeeTblTotalfeesubscriptions(Set<FeeTblTotalfeesubscription> feeTblTotalfeesubscriptions) {
		this.feeTblTotalfeesubscriptions = feeTblTotalfeesubscriptions;
	}

	public FeeTblTotalfeesubscription addFeeTblTotalfeesubscription(FeeTblTotalfeesubscription feeTblTotalfeesubscription) {
		getFeeTblTotalfeesubscriptions().add(feeTblTotalfeesubscription);
		feeTblTotalfeesubscription.setShareTblEmpstaffdetail(this);

		return feeTblTotalfeesubscription;
	}

	public FeeTblTotalfeesubscription removeFeeTblTotalfeesubscription(FeeTblTotalfeesubscription feeTblTotalfeesubscription) {
		getFeeTblTotalfeesubscriptions().remove(feeTblTotalfeesubscription);
		feeTblTotalfeesubscription.setShareTblEmpstaffdetail(null);

		return feeTblTotalfeesubscription;
	}

	public Set<FeeTblTransaction> getFeeTblTransactions() {
		return this.feeTblTransactions;
	}

	public void setFeeTblTransactions(Set<FeeTblTransaction> feeTblTransactions) {
		this.feeTblTransactions = feeTblTransactions;
	}

	public FeeTblTransaction addFeeTblTransaction(FeeTblTransaction feeTblTransaction) {
		getFeeTblTransactions().add(feeTblTransaction);
		feeTblTransaction.setShareTblEmpstaffdetail(this);

		return feeTblTransaction;
	}

	public FeeTblTransaction removeFeeTblTransaction(FeeTblTransaction feeTblTransaction) {
		getFeeTblTransactions().remove(feeTblTransaction);
		feeTblTransaction.setShareTblEmpstaffdetail(null);

		return feeTblTransaction;
	}

	public Set<ShareTblAcademicyear> getShareTblAcademicyears() {
		return this.shareTblAcademicyears;
	}

	public void setShareTblAcademicyears(Set<ShareTblAcademicyear> shareTblAcademicyears) {
		this.shareTblAcademicyears = shareTblAcademicyears;
	}

	public ShareTblAcademicyear addShareTblAcademicyear(ShareTblAcademicyear shareTblAcademicyear) {
		getShareTblAcademicyears().add(shareTblAcademicyear);
		shareTblAcademicyear.setShareTblEmpstaffdetail(this);

		return shareTblAcademicyear;
	}

	public ShareTblAcademicyear removeShareTblAcademicyear(ShareTblAcademicyear shareTblAcademicyear) {
		getShareTblAcademicyears().remove(shareTblAcademicyear);
		shareTblAcademicyear.setShareTblEmpstaffdetail(null);

		return shareTblAcademicyear;
	}

	public Set<ShareTblAnnualholiday> getShareTblAnnualholidays() {
		return this.shareTblAnnualholidays;
	}

	public void setShareTblAnnualholidays(Set<ShareTblAnnualholiday> shareTblAnnualholidays) {
		this.shareTblAnnualholidays = shareTblAnnualholidays;
	}

	public ShareTblAnnualholiday addShareTblAnnualholiday(ShareTblAnnualholiday shareTblAnnualholiday) {
		getShareTblAnnualholidays().add(shareTblAnnualholiday);
		shareTblAnnualholiday.setShareTblEmpstaffdetail(this);

		return shareTblAnnualholiday;
	}

	public ShareTblAnnualholiday removeShareTblAnnualholiday(ShareTblAnnualholiday shareTblAnnualholiday) {
		getShareTblAnnualholidays().remove(shareTblAnnualholiday);
		shareTblAnnualholiday.setShareTblEmpstaffdetail(null);

		return shareTblAnnualholiday;
	}

	public Set<ShareTblDepartment> getShareTblDepartments() {
		return this.shareTblDepartments;
	}

	public void setShareTblDepartments(Set<ShareTblDepartment> shareTblDepartments) {
		this.shareTblDepartments = shareTblDepartments;
	}

	public ShareTblDepartment addShareTblDepartment(ShareTblDepartment shareTblDepartment) {
		getShareTblDepartments().add(shareTblDepartment);
		shareTblDepartment.setShareTblEmpstaffdetail(this);

		return shareTblDepartment;
	}

	public ShareTblDepartment removeShareTblDepartment(ShareTblDepartment shareTblDepartment) {
		getShareTblDepartments().remove(shareTblDepartment);
		shareTblDepartment.setShareTblEmpstaffdetail(null);

		return shareTblDepartment;
	}

	public Set<ShareTblDocumentlist> getShareTblDocumentlists() {
		return this.shareTblDocumentlists;
	}

	public void setShareTblDocumentlists(Set<ShareTblDocumentlist> shareTblDocumentlists) {
		this.shareTblDocumentlists = shareTblDocumentlists;
	}

	public ShareTblDocumentlist addShareTblDocumentlist(ShareTblDocumentlist shareTblDocumentlist) {
		getShareTblDocumentlists().add(shareTblDocumentlist);
		shareTblDocumentlist.setShareTblEmpstaffdetail(this);

		return shareTblDocumentlist;
	}

	public ShareTblDocumentlist removeShareTblDocumentlist(ShareTblDocumentlist shareTblDocumentlist) {
		getShareTblDocumentlists().remove(shareTblDocumentlist);
		shareTblDocumentlist.setShareTblEmpstaffdetail(null);

		return shareTblDocumentlist;
	}

	public Set<ShareTblEventtype> getShareTblEventtypes() {
		return this.shareTblEventtypes;
	}

	public void setShareTblEventtypes(Set<ShareTblEventtype> shareTblEventtypes) {
		this.shareTblEventtypes = shareTblEventtypes;
	}

	public ShareTblEventtype addShareTblEventtype(ShareTblEventtype shareTblEventtype) {
		getShareTblEventtypes().add(shareTblEventtype);
		shareTblEventtype.setShareTblEmpstaffdetail(this);

		return shareTblEventtype;
	}

	public ShareTblEventtype removeShareTblEventtype(ShareTblEventtype shareTblEventtype) {
		getShareTblEventtypes().remove(shareTblEventtype);
		shareTblEventtype.setShareTblEmpstaffdetail(null);

		return shareTblEventtype;
	}

	public Set<ShareTblExperienceemp> getShareTblExperienceemps() {
		return this.shareTblExperienceemps;
	}

	public void setShareTblExperienceemps(Set<ShareTblExperienceemp> shareTblExperienceemps) {
		this.shareTblExperienceemps = shareTblExperienceemps;
	}

	public ShareTblExperienceemp addShareTblExperienceemp(ShareTblExperienceemp shareTblExperienceemp) {
		getShareTblExperienceemps().add(shareTblExperienceemp);
		shareTblExperienceemp.setShareTblEmpstaffdetail(this);

		return shareTblExperienceemp;
	}

	public ShareTblExperienceemp removeShareTblExperienceemp(ShareTblExperienceemp shareTblExperienceemp) {
		getShareTblExperienceemps().remove(shareTblExperienceemp);
		shareTblExperienceemp.setShareTblEmpstaffdetail(null);

		return shareTblExperienceemp;
	}

	public Set<ShareTblQualificationemp> getShareTblQualificationemps() {
		return this.shareTblQualificationemps;
	}

	public void setShareTblQualificationemps(Set<ShareTblQualificationemp> shareTblQualificationemps) {
		this.shareTblQualificationemps = shareTblQualificationemps;
	}

	public ShareTblQualificationemp addShareTblQualificationemp(ShareTblQualificationemp shareTblQualificationemp) {
		getShareTblQualificationemps().add(shareTblQualificationemp);
		shareTblQualificationemp.setShareTblEmpstaffdetail(this);

		return shareTblQualificationemp;
	}

	public ShareTblQualificationemp removeShareTblQualificationemp(ShareTblQualificationemp shareTblQualificationemp) {
		getShareTblQualificationemps().remove(shareTblQualificationemp);
		shareTblQualificationemp.setShareTblEmpstaffdetail(null);

		return shareTblQualificationemp;
	}

	public Set<ShareTblStudentCategory> getShareTblStudentCategories() {
		return this.shareTblStudentCategories;
	}

	public void setShareTblStudentCategories(Set<ShareTblStudentCategory> shareTblStudentCategories) {
		this.shareTblStudentCategories = shareTblStudentCategories;
	}

	public ShareTblStudentCategory addShareTblStudentCategory(ShareTblStudentCategory shareTblStudentCategory) {
		getShareTblStudentCategories().add(shareTblStudentCategory);
		shareTblStudentCategory.setShareTblEmpstaffdetail(this);

		return shareTblStudentCategory;
	}

	public ShareTblStudentCategory removeShareTblStudentCategory(ShareTblStudentCategory shareTblStudentCategory) {
		getShareTblStudentCategories().remove(shareTblStudentCategory);
		shareTblStudentCategory.setShareTblEmpstaffdetail(null);

		return shareTblStudentCategory;
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

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
	
}