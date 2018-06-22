package edu.spring.project.persistence;

import edu.spring.project.domain.Member;

public interface MemberDao {

	int insert(Member member);
	Member select(String userid); // 중복 아이디 체크
	Member select(Member member); // 로그인(아이디 & 비번 체크)
	
} // end interface MemberDao







