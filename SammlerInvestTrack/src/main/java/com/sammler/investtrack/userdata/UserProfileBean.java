/**
 * 
 */
package com.sammler.investtrack.userdata;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author KiranMan
 *
 */
@Document(collection="SammlerUserProfile")
public class UserProfileBean {

	@Id
	private String id;
	private String userId;
	private String customerId;
	private String emailId;
	private String userName;
	private Date dob;
	private String mobile;
	private String address;
	private String gender;
	
	public UserProfileBean() {
		super();
	}
	public UserProfileBean(String userId, String customerId, String emailId, String userName, Date dob,
			String mobile, String address, String gender) {
		
		super();
		this.userId = userId;
		this.customerId = customerId;
		this.emailId = emailId;
		this.userName = userName;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.gender = gender; 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return String.format(
				"UserProfileBean [id=%s, userId=%s, customerId=%s, emailId=%s, userName=%s, dob=%s, mobile=%s, address=%s, gender=%s]",
				id, userId, customerId, emailId, userName, dob, mobile, address, gender);
	}

}
