package com.example.jobs.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.jobs.model.Member;

public class MemberDaoImpl implements MemberDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public MemberDaoImpl(DataSource dataSource) {
		try{
			jdbcTemplate = new JdbcTemplate(dataSource);
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	//登録する
	@Override
	public void save(Member member){
		// insert
		String sql = "INSERT INTO publication (public_id,public_name)"
			+ " VALUES (?, ?)";
		try{
			
		System.out.println("言ってますよ");
		jdbcTemplate.update(sql,member.getPublic_id(),member.getPublic_name());
	
		}catch(Exception e){
			System.out.println(e);
		}
	}
	@Override
	public void delete(int contactId) {
		String sql = "DELETE FROM contact WHERE contact_id=?";
		jdbcTemplate.update(sql, contactId);
	}

}
