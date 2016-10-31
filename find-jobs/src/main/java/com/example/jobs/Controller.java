package com.example.jobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobs.dao.MemberDao;
import com.example.jobs.model.Member;
@RestController
public class Controller {
	@Autowired
	private MemberDao memberDao;
	
	@RequestMapping("/")
    public String method1() {
		
		Member member = new Member();
		member.setPublic_id("１４０");
		member.setPublic_name("1111");
		
		memberDao.save(member);
        return "登録完了";
    }
}
