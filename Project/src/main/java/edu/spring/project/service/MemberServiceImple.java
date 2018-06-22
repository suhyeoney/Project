package edu.spring.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spring.project.domain.Member;
import edu.spring.project.persistence.MemberDao;

@Service
public class MemberServiceImple implements MemberService {

	@Autowired private MemberDao memberDao;
	
	@Override
	public int create(Member member) {
		
		return memberDao.insert(member);
	}

	@Override
	public Member read(String userid) {
		
		return memberDao.select(userid);
	}

	@Override
	public Member read(Member member) {
		
		return memberDao.select(member);
	}

} // end class MemberServiceImple











