package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the share_tbl_parent database table.
 * 
 */
@Entity
@Table(name="share_tbl_parent")
@NamedQuery(name="ShareTblParent.findAll", query="SELECT s FROM ShareTblParent s")
public class ShareTblParent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="parent_id")
	private Integer parentId;

	@Column(name="active_flag")
	private Integer activeFlag;

	@Column(name="create_date")
	private Date createDate;

	@Column(name="father_current_address_id")
	private String fatherCurrentAddressId;

	@Temporal(TemporalType.DATE)
	@Column(name="father_dob")
	private Date fatherDob;

	@Column(name="father_education")
	private String fatherEducation;

	@Column(name="father_email")
	private String fatherEmail;

	@Column(name="father_first_name")
	private String fatherFirstName;

	@Column(name="father_income")
	private Integer fatherIncome;

	@Column(name="father_last_name")
	private String fatherLastName;

	@Column(name="father_middle_name")
	private String fatherMiddleName;

	@Column(name="father_mobile_no")
	private Integer fatherMobileNo;

	@Column(name="father_occupation")
	private String fatherOccupation;

	@Column(name="father_office_address_id")
	private String fatherOfficeAddressId;

	@Column(name="father_phone_no")
	private Integer fatherPhoneNo;

	@Column(name="father_photo")
	private String fatherPhoto;

	@Column(name="fatheroffice_phoneno")
	private Integer fatherofficePhoneno;

	@Column(name="guardian_current_address_id")
	private String guardianCurrentAddressId;

	@Temporal(TemporalType.DATE)
	@Column(name="guardian_dob")
	private Date guardianDob;

	@Column(name="guardian_education")
	private String guardianEducation;

	@Column(name="guardian_email")
	private String guardianEmail;

	@Column(name="guardian_first_name")
	private String guardianFirstName;

	@Column(name="guardian_income")
	private BigDecimal guardianIncome;

	@Column(name="guardian_last_name")
	private String guardianLastName;

	@Column(name="guardian_middle_name")
	private String guardianMiddleName;

	@Column(name="guardian_mobile_no")
	private String guardianMobileNo;

	@Column(name="guardian_occupation")
	private String guardianOccupation;

	@Column(name="guardian_office_address_id")
	private String guardianOfficeAddressId;

	@Column(name="guardian_office_phoneno")
	private String guardianOfficePhoneno;

	@Column(name="guardian_phoneno")
	private String guardianPhoneno;

	@Column(name="guardian_photo")
	private String guardianPhoto;

	@Column(name="mother_current_address_id")
	private String motherCurrentAddressId;

	@Temporal(TemporalType.DATE)
	@Column(name="mother_dob")
	private Date motherDob;

	@Column(name="mother_education")
	private String motherEducation;

	@Column(name="mother_email")
	private String motherEmail;

	@Column(name="mother_first_name")
	private String motherFirstName;

	@Column(name="mother_income")
	private BigDecimal motherIncome;

	@Column(name="mother_last_name")
	private String motherLastName;

	@Column(name="mother_middle_name")
	private String motherMiddleName;

	@Column(name="mother_mobile_no")
	private String motherMobileNo;

	@Column(name="mother_occupation")
	private String motherOccupation;

	@Column(name="mother_office_address_id")
	private String motherOfficeAddressId;

	@Column(name="mother_office_phone_no")
	private String motherOfficePhoneNo;

	@Column(name="mother_phone_no")
	private String motherPhoneNo;

	@Column(name="mother_photo")
	private String motherPhoto;

	@Column(name="relation_with_guardian")
	private String relationWithGuardian;

	@Column(name="update_date")
	private Date updateDate;


	@Column(name="user_id")
	private Integer userId;

	public ShareTblParent() {
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(Integer activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getFatherCurrentAddressId() {
		return this.fatherCurrentAddressId;
	}

	public void setFatherCurrentAddressId(String fatherCurrentAddressId) {
		this.fatherCurrentAddressId = fatherCurrentAddressId;
	}

	public Date getFatherDob() {
		return this.fatherDob;
	}

	public void setFatherDob(Date fatherDob) {
		this.fatherDob = fatherDob;
	}

	public String getFatherEducation() {
		return this.fatherEducation;
	}

	public void setFatherEducation(String fatherEducation) {
		this.fatherEducation = fatherEducation;
	}

	public String getFatherEmail() {
		return this.fatherEmail;
	}

	public void setFatherEmail(String fatherEmail) {
		this.fatherEmail = fatherEmail;
	}

	public String getFatherFirstName() {
		return this.fatherFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	public Integer getFatherIncome() {
		return this.fatherIncome;
	}

	public void setFatherIncome(Integer fatherIncome) {
		this.fatherIncome = fatherIncome;
	}

	public String getFatherLastName() {
		return this.fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getFatherMiddleName() {
		return this.fatherMiddleName;
	}

	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	public Integer getFatherMobileNo() {
		return this.fatherMobileNo;
	}

	public void setFatherMobileNo(Integer fatherMobileNo) {
		this.fatherMobileNo = fatherMobileNo;
	}

	public String getFatherOccupation() {
		return this.fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getFatherOfficeAddressId() {
		return this.fatherOfficeAddressId;
	}

	public void setFatherOfficeAddressId(String fatherOfficeAddressId) {
		this.fatherOfficeAddressId = fatherOfficeAddressId;
	}

	public Integer getFatherPhoneNo() {
		return this.fatherPhoneNo;
	}

	public void setFatherPhoneNo(Integer fatherPhoneNo) {
		this.fatherPhoneNo = fatherPhoneNo;
	}

	public String getFatherPhoto() {
		return this.fatherPhoto;
	}

	public void setFatherPhoto(String fatherPhoto) {
		this.fatherPhoto = fatherPhoto;
	}

	public Integer getFatherofficePhoneno() {
		return this.fatherofficePhoneno;
	}

	public void setFatherofficePhoneno(Integer fatherofficePhoneno) {
		this.fatherofficePhoneno = fatherofficePhoneno;
	}

	public String getGuardianCurrentAddressId() {
		return this.guardianCurrentAddressId;
	}

	public void setGuardianCurrentAddressId(String guardianCurrentAddressId) {
		this.guardianCurrentAddressId = guardianCurrentAddressId;
	}

	public Date getGuardianDob() {
		return this.guardianDob;
	}

	public void setGuardianDob(Date guardianDob) {
		this.guardianDob = guardianDob;
	}

	public String getGuardianEducation() {
		return this.guardianEducation;
	}

	public void setGuardianEducation(String guardianEducation) {
		this.guardianEducation = guardianEducation;
	}

	public String getGuardianEmail() {
		return this.guardianEmail;
	}

	public void setGuardianEmail(String guardianEmail) {
		this.guardianEmail = guardianEmail;
	}

	public String getGuardianFirstName() {
		return this.guardianFirstName;
	}

	public void setGuardianFirstName(String guardianFirstName) {
		this.guardianFirstName = guardianFirstName;
	}

	public BigDecimal getGuardianIncome() {
		return this.guardianIncome;
	}

	public void setGuardianIncome(BigDecimal guardianIncome) {
		this.guardianIncome = guardianIncome;
	}

	public String getGuardianLastName() {
		return this.guardianLastName;
	}

	public void setGuardianLastName(String guardianLastName) {
		this.guardianLastName = guardianLastName;
	}

	public String getGuardianMiddleName() {
		return this.guardianMiddleName;
	}

	public void setGuardianMiddleName(String guardianMiddleName) {
		this.guardianMiddleName = guardianMiddleName;
	}

	public String getGuardianMobileNo() {
		return this.guardianMobileNo;
	}

	public void setGuardianMobileNo(String guardianMobileNo) {
		this.guardianMobileNo = guardianMobileNo;
	}

	public String getGuardianOccupation() {
		return this.guardianOccupation;
	}

	public void setGuardianOccupation(String guardianOccupation) {
		this.guardianOccupation = guardianOccupation;
	}

	public String getGuardianOfficeAddressId() {
		return this.guardianOfficeAddressId;
	}

	public void setGuardianOfficeAddressId(String guardianOfficeAddressId) {
		this.guardianOfficeAddressId = guardianOfficeAddressId;
	}

	public String getGuardianOfficePhoneno() {
		return this.guardianOfficePhoneno;
	}

	public void setGuardianOfficePhoneno(String guardianOfficePhoneno) {
		this.guardianOfficePhoneno = guardianOfficePhoneno;
	}

	public String getGuardianPhoneno() {
		return this.guardianPhoneno;
	}

	public void setGuardianPhoneno(String guardianPhoneno) {
		this.guardianPhoneno = guardianPhoneno;
	}

	public String getGuardianPhoto() {
		return this.guardianPhoto;
	}

	public void setGuardianPhoto(String guardianPhoto) {
		this.guardianPhoto = guardianPhoto;
	}

	public String getMotherCurrentAddressId() {
		return this.motherCurrentAddressId;
	}

	public void setMotherCurrentAddressId(String motherCurrentAddressId) {
		this.motherCurrentAddressId = motherCurrentAddressId;
	}

	public Date getMotherDob() {
		return this.motherDob;
	}

	public void setMotherDob(Date motherDob) {
		this.motherDob = motherDob;
	}

	public String getMotherEducation() {
		return this.motherEducation;
	}

	public void setMotherEducation(String motherEducation) {
		this.motherEducation = motherEducation;
	}

	public String getMotherEmail() {
		return this.motherEmail;
	}

	public void setMotherEmail(String motherEmail) {
		this.motherEmail = motherEmail;
	}

	public String getMotherFirstName() {
		return this.motherFirstName;
	}

	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}

	public BigDecimal getMotherIncome() {
		return this.motherIncome;
	}

	public void setMotherIncome(BigDecimal motherIncome) {
		this.motherIncome = motherIncome;
	}

	public String getMotherLastName() {
		return this.motherLastName;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getMotherMiddleName() {
		return this.motherMiddleName;
	}

	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}

	public String getMotherMobileNo() {
		return this.motherMobileNo;
	}

	public void setMotherMobileNo(String motherMobileNo) {
		this.motherMobileNo = motherMobileNo;
	}

	public String getMotherOccupation() {
		return this.motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}

	public String getMotherOfficeAddressId() {
		return this.motherOfficeAddressId;
	}

	public void setMotherOfficeAddressId(String motherOfficeAddressId) {
		this.motherOfficeAddressId = motherOfficeAddressId;
	}

	public String getMotherOfficePhoneNo() {
		return this.motherOfficePhoneNo;
	}

	public void setMotherOfficePhoneNo(String motherOfficePhoneNo) {
		this.motherOfficePhoneNo = motherOfficePhoneNo;
	}

	public String getMotherPhoneNo() {
		return this.motherPhoneNo;
	}

	public void setMotherPhoneNo(String motherPhoneNo) {
		this.motherPhoneNo = motherPhoneNo;
	}

	public String getMotherPhoto() {
		return this.motherPhoto;
	}

	public void setMotherPhoto(String motherPhoto) {
		this.motherPhoto = motherPhoto;
	}

	public String getRelationWithGuardian() {
		return this.relationWithGuardian;
	}

	public void setRelationWithGuardian(String relationWithGuardian) {
		this.relationWithGuardian = relationWithGuardian;
	}
	
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	
}