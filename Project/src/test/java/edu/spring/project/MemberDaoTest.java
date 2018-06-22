package edu.spring.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import edu.spring.project.domain.Member;
import edu.spring.project.persistence.MemberDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = 
	{ "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
@WebAppConfiguration
public class MemberDaoTest {
	private static final Logger logger =
			LoggerFactory.getLogger(MemberDaoTest.class);
	
	@Autowired private MemberDao dao;
	
	@Test
	public void doTest() {
		insertTest();
//		selectByUserid();
//		loginTest();
	} // end doTest()

	private void insertTest() {
		Member member = 
				new Member(0, "admin2", "1234", "admin", "admin@gmail.com", 0, 0);
		int result = dao.insert(member);
		logger.info("INSERT result = {}", result);
	} // end insertTest()
	
	private void selectByUserid() {
		Member m = dao.select("admin");
		if (m != null) {
			logger.info("userid: {}, pwd: {}", 
					m.getId(), m.getPassword());
		} else {
			logger.info("사용할 수 있는 아이디");
		}
	} // end selectByUserid()
	
	private void loginTest() {
		Member m = new Member(1, "admin", "1234", "admin", "admin@gmail.com", 0, 0);
		Member loginResult = dao.select(m);
		if (loginResult != null) {
			logger.info("로그인 성공");
		} else {
			logger.info("로그인 실패");
		}
		
	} // end loginTest()
	
} // end class MemberDaoTest

















