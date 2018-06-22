package edu.spring.project.mappers;

import edu.spring.project.domain.Member;

public interface MemberMapper {

	int insertMember(Member member);
	Member checkUserid(String userid);
	Member login(Member member);
	
} // end interface MemberMapper















