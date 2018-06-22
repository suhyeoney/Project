package edu.spring.project.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.spring.project.domain.Member;
import edu.spring.project.mappers.MemberMapper;

@Repository
public class MemberDaoImple implements MemberDao {
	private static final String NAMESPACE =
			"edu.spring.project.mappers.MemberMapper";
	
	private static final Logger logger =
			LoggerFactory.getLogger(MemberDaoImple.class);
	
//	@Autowired private SqlSession sqlSession;
	@Autowired 
	private MemberMapper memberMapper;

	@Override
	public int insert(Member member) {
		logger.info("insert({}, {}, {}, {}, {}, {}, {})",
				member.getNo(), member.getId(), member.getPassword(), member.getName(),
				member.getEmail(),
				member.getAccount(), member.getGamescore());
		
//		return sqlSession.insert(NAMESPACE + ".insertMember", member);
		return memberMapper.insertMember(member);
	} // end insert()

	@Override
	public Member select(String userid) {
		logger.info("select(userid: {})", userid);
		
		return memberMapper.checkUserid(userid);
	} // end select(userid)
	
	@Override
	public Member select(Member member) {
		logger.info("select(userid: {}, pwd: {})",
				member.getId(), member.getPassword());
		
		return memberMapper.login(member);
	} // end select(member)
	
} // end class MemberDaoImple


















