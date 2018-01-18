package com.sammler.investtrack.master;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author KiranMan
 *
 */
public interface InvestmentMasterRepository extends MongoRepository<InvestmentMasterBean, String> {

	public InvestmentMasterBean findByInvestmentId (String investmentId);
	public List<InvestmentMasterBean> findByInvestmentType (String investmentType);
}
