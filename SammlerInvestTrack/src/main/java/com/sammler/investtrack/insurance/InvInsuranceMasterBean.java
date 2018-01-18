package com.sammler.investtrack.insurance;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author KiranMan
 *
 */
@Document(collection="SammlerInvInsuranceMaster")
public class InvInsuranceMasterBean {

	@Id
	private String id;
	private String policyNumber;
	private String insGroupName;
	private String policyOwnerName;
	private String customerId;
	private String policyPlanCode;
	private Integer policyTerm;
	private Date policyCommenceDate;
	private Double premiumInstAmount;
	private Double premiumTotalAmount;
	private Double policySumAssured;
	private String policyCurrency;
	private String premiumMode;
	
	public InvInsuranceMasterBean() {
		super();
	}

	public InvInsuranceMasterBean(String policyNumber, String insGroupName, String policyOwnerName, String customerId,
			String policyPlanCode, Integer policyTerm, Date policyCommenceDate, Double premiumInstAmount,
			Double premiumTotalAmount, Double policySumAssured, String policyCurrency, String premiumMode) {
		super();
		this.policyNumber = policyNumber;
		this.insGroupName = insGroupName;
		this.policyOwnerName = policyOwnerName;
		this.customerId = customerId;
		this.policyPlanCode = policyPlanCode;
		this.policyTerm = policyTerm;
		this.policyCommenceDate = policyCommenceDate;
		this.premiumInstAmount = premiumInstAmount;
		this.premiumTotalAmount = premiumTotalAmount;
		this.policySumAssured = policySumAssured;
		this.policyCurrency = policyCurrency;
		this.premiumMode = premiumMode;
	}

	@Override
	public String toString() {
		return String.format(
				"InvInsuranceMasterBean [id=%s, policyNumber=%s, insGroupName=%s, policyOwnerName=%s, customerId=%s, policyPlanCode=%s, policyTerm=%s, policyCommenceDate=%s, premiumInstAmount=%s, premiumTotalAmount=%s, policySumAssured=%s, policyCurrency=%s, premiumMode=%s]",
				id, policyNumber, insGroupName, policyOwnerName, customerId, policyPlanCode, policyTerm,
				policyCommenceDate, premiumInstAmount, premiumTotalAmount, policySumAssured, policyCurrency,
				premiumMode);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getInsGroupName() {
		return insGroupName;
	}

	public void setInsGroupName(String insGroupName) {
		this.insGroupName = insGroupName;
	}

	public String getPolicyOwnerName() {
		return policyOwnerName;
	}

	public void setPolicyOwnerName(String policyOwnerName) {
		this.policyOwnerName = policyOwnerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPolicyPlanCode() {
		return policyPlanCode;
	}

	public void setPolicyPlanCode(String policyPlanCode) {
		this.policyPlanCode = policyPlanCode;
	}

	public Integer getPolicyTerm() {
		return policyTerm;
	}

	public void setPolicyTerm(Integer policyTerm) {
		this.policyTerm = policyTerm;
	}

	public Date getPolicyCommenceDate() {
		return policyCommenceDate;
	}

	public void setPolicyCommenceDate(Date policyCommenceDate) {
		this.policyCommenceDate = policyCommenceDate;
	}

	public Double getPremiumInstAmount() {
		return premiumInstAmount;
	}

	public void setPremiumInstAmount(Double premiumInstAmount) {
		this.premiumInstAmount = premiumInstAmount;
	}

	public Double getPremiumTotalAmount() {
		return premiumTotalAmount;
	}

	public void setPremiumTotalAmount(Double premiumTotalAmount) {
		this.premiumTotalAmount = premiumTotalAmount;
	}

	public Double getPolicySumAssured() {
		return policySumAssured;
	}

	public void setPolicySumAssured(Double policySumAssured) {
		this.policySumAssured = policySumAssured;
	}

	public String getPolicyCurrency() {
		return policyCurrency;
	}

	public void setPolicyCurrency(String policyCurrency) {
		this.policyCurrency = policyCurrency;
	}

	public String getPremiumMode() {
		return premiumMode;
	}

	public void setPremiumMode(String premiumMode) {
		this.premiumMode = premiumMode;
	}

}
