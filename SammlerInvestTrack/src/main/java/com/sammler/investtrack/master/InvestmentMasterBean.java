package com.sammler.investtrack.master;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author KiranMan
 *
 */
@Document(collection="SammlerInvestmentMaster")
public class InvestmentMasterBean {

	@Id
	private String id;
	private String investmentType;
	private Date invEntryDate;
	private Date invUpdateDate;
	private String investmentId; //ObjectID of child table
	
	public InvestmentMasterBean() {
		super();
	}

	public InvestmentMasterBean(String investmentType, Date invEntryDate, Date invUpdateDate, String investmentId) {
		super();
		this.investmentType = investmentType;
		this.invEntryDate = invEntryDate;
		this.invUpdateDate = invUpdateDate;
		this.investmentId = investmentId;
	}

	@Override
	public String toString() {
		return String.format(
				"InvestmentMasterBean [id=%s, investmentType=%s, invEntryDate=%s, invUpdateDate=%s, investmentId=%s]",
				id, investmentType, invEntryDate, invUpdateDate, investmentId);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvestmentType() {
		return investmentType;
	}

	public void setInvestmentType(String investmentType) {
		this.investmentType = investmentType;
	}

	public Date getInvEntryDate() {
		return invEntryDate;
	}

	public void setInvEntryDate(Date invEntryDate) {
		this.invEntryDate = invEntryDate;
	}

	public Date getInvUpdateDate() {
		return invUpdateDate;
	}

	public void setInvUpdateDate(Date invUpdateDate) {
		this.invUpdateDate = invUpdateDate;
	}

	public String getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(String investmentId) {
		this.investmentId = investmentId;
	}

}
