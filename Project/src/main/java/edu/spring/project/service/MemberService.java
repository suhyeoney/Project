package edu.spring.project.service;

import edu.spring.project.domain.Member;

public interface MemberService {

	int create(Member member); // 회원 가입 서비스
	Member read(String userid); // 아이디 중복 체크 서비스
	Member read(Member member); // 로그인(아이디 & 비번 체크) 서비스
	
} // end interface MemberService





