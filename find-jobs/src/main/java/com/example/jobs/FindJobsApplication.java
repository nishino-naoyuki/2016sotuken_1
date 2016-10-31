package com.example.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jobs.dao.MemberDao;
import com.example.jobs.model.Member;

@SpringBootApplication
public class FindJobsApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(FindJobsApplication.class, args);
		
	}
	
}
