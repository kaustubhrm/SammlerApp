package com.sammler.investtrack.insurance;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author KiranMan
 *
 */
public interface InvInsuranceMasterRepository extends MongoRepository<InvInsuranceMasterBean, String> {

	public InvInsuranceMasterBean findByPolicyNumber (String policyNumber);
	public List<InvInsuranceMasterBean> findByCustomerId (String customerId);
	public List<InvInsuranceMasterBean> findByPolicyCommenceDate (Date policyCommenceDate);
}
