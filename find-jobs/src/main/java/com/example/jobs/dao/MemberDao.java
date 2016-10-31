package com.example.jobs.dao;

import com.example.jobs.model.Member;

public interface MemberDao {
	public void save(Member member);
	public void delete(int contactId);
}
