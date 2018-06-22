package edu.spring.project.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import edu.spring.project.domain.Member;

@Service
public class MemberMangeServiceImple {
	private static final Logger logger =
			LoggerFactory.getLogger(MemberMangeServiceImple.class);
	
	public Member read(String userid) {
//		logger.info("userid: {}", userid);
		
		logger.info("비즈니스 로직을 처리중...");
		Member m = new Member(3, "guest", "1234", "guest", "guest@test.com", 0, 0);
		
//		logger.info("Member(userid: {}, pwd: {}, email: {}, point: {})",
//				m.getUserid(), m.getPwd(), m.getEmail(), m.getPoint());
		return m;
	}
	
}






