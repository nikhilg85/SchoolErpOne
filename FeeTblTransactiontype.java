package com.education.erp.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the fee_tbl_transactiontype database table.
 * 
 */
@Entity
@Table(name="fee_tbl_transactiontype")
@NamedQuery(name="FeeTblTransactiontype.findAll", query="SELECT f FROM FeeTblTransactiontype f")
public class FeeTblTransactiontype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="transaction_type_id")
	private Integer transactionTypeId;

	@Column(name="type_name")
	@NotNull(message = "TypeName field can not be Null")
	private String typeName;

	
	@Column(name="create_date")
	@NotNull(message = "CreateDate field can not be Null")
	private Date createDate;
	
	@Column(name="update_date")
	private Date updateDate;
	
	//bi-directional many-to-one association to FeeTblTransaction
	@OneToMany(mappedBy="feeTblTransactiontype")
	@JsonManagedReference
	private Set<FeeTblTransaction> feeTblTransactions;

	public FeeTblTransactiontype() {
	}

	public Integer getTransactionTypeId() {
		return this.transactionTypeId;
	}

	public void setTransactionTypeId(Integer transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Set<FeeTblTransaction> getFeeTblTransactions() {
		return this.feeTblTransactions;
	}

	public void setFeeTblTransactions(Set<FeeTblTransaction> feeTblTransactions) {
		this.feeTblTransactions = feeTblTransactions;
	}

	public FeeTblTransaction addFeeTblTransaction(FeeTblTransaction feeTblTransaction) {
		getFeeTblTransactions().add(feeTblTransaction);
		feeTblTransaction.setFeeTblTransactiontype(this);

		return feeTblTransaction;
	}

	public FeeTblTransaction removeFeeTblTransaction(FeeTblTransaction feeTblTransaction) {
		getFeeTblTransactions().remove(feeTblTransaction);
		feeTblTransaction.setFeeTblTransactiontype(null);

		return feeTblTransaction;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	
	
	
}