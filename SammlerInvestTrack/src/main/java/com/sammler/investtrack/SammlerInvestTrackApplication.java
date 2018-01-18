package com.sammler.investtrack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sammler.investtrack.userdata.UserProfileBean;
import com.sammler.investtrack.userdata.UserProfileRepository;

@SpringBootApplication
public class SammlerInvestTrackApplication implements CommandLineRunner {

	@Autowired
	private UserProfileRepository upRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SammlerInvestTrackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Users found with findAll():");
		System.out.println("-------------------------------");
		for (UserProfileBean profile : upRepository.findAll()) {
			System.out.println(profile);
		}
		System.out.println();

		System.out.println("User found with findByUserId('kiranrm'):");
		System.out.println("--------------------------------");
		System.out.println(upRepository.findByUserId("kiranrm"));
	}
	
}
