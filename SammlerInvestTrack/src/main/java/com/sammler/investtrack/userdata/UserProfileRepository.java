package com.sammler.investtrack.userdata;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author KiranMan
 *
 */
public interface UserProfileRepository extends MongoRepository<UserProfileBean, String> {

	public UserProfileBean findByUserId (String userId);
	public UserProfileBean findByEmailId (String emailId);
	public UserProfileBean findByCustomerId (String customerId);
}
