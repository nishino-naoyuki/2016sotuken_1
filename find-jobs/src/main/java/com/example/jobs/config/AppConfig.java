package com.example.jobs.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.jobs.dao.MemberDao;
import com.example.jobs.dao.MemberDaoImpl;

@Configuration
@ComponentScan(basePackages="com.example.jobs")
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/webapp?autoReconnect=true&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("takatan10");
		
		return dataSource;
	}
	@Bean
	public MemberDao getMemberDao(){
		return new MemberDaoImpl(getDataSource());
	}
}
