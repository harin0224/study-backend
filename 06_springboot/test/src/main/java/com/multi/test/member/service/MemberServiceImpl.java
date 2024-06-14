package com.multi.test.member.service;

import java.util.List;

import com.multi.test.member.model.dao.MemberDAO;
import com.multi.test.member.model.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional(rollbackFor = {Exception.class}) 
@Service
public class MemberServiceImpl implements MemberService {

	private final MemberDAO memberDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

//	@Override
//	public void insertMember(MemberDTO memberDTO ) throws Exception {
//		int result = memberDAO.insertMember(sqlSession, memberDTO );
//		if(result < 0 ) {
//			throw new Exception("회원가입에 실패 하였습니다.");
//		}
//		
//		
//	}

	@Override
	public List<MemberDTO> selectList() throws Exception {
		List<MemberDTO> list = memberDAO.selectList(sqlSession);
		return list;
	}

	@Override
	public void deleteMember(String id) throws Exception {
		int result = memberDAO.deleteMember(sqlSession, id );
		if(result < 0 ) {
			throw new Exception("회원삭제에 실패 하였습니다.");
		}
	}
	  /*Request processing failed; nested exception is org.springframework.dao.DataIntegrityViolationException:
		중복키 예외외에 다른 제약조건 위반상황에서도 발생  젤위에있다에러메세지 발생
		https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/dao/DataIntegrityViolationException.html 
		위 경로로 가서 보면 DataAccessException을 상속 받고 있고 들어가서 보면  액세스 API(예: JDBC)에 대한 세부 정보를 모른 채 발생한 오류 종류를 찾아 처리할 수 있도록 하는 것을 목표로하여 sqlexception 을 런타임으로  던져주고 있다
		따라서 기본 롤백됨
		 */
	@Override
	public void updateMember(MemberDTO memberDTO) throws Exception {
		int result = memberDAO.updateMember(sqlSession, memberDTO );
		 memberDAO.insertMember(sqlSession, memberDTO);
		if(result < 0 ) {
			throw new Exception("회원수정에 실패 하였습니다.");// 롤백안됨 - 롤백되게 하려면 @Transactional(rollbackFor = Exception.class) 설정
			//throw new RuntimeException("회원정보 수정에 실패하였습니다"); // 롤백됨
		}
	}

	@Override
	public MemberDTO selectMember(String id) throws Exception {
		MemberDTO dto = memberDAO.selectMember(sqlSession ,  id);
		return dto;
	}

//	@Override
//	public MemberDTO loginMember(MemberDTO m) throws Exception {
//		MemberDTO loginUser = memberDAO.loginMember(sqlSession, m);
//		
//		if(loginUser == null) {
//			throw new Exception("loginUser 정보 확인, 로그인 실패 ");
//		}
//		return loginUser;
//	}
	
	@Override
	public MemberDTO loginMember(MemberDTO m) throws Exception {
		
		
		
		MemberDTO loginUser = memberDAO.loginMember(sqlSession, m);
		

		if(loginUser == null) {
			throw new Exception("loginUser 정보 확인, 로그인 실패 ");
		}
		
		
		if(!bCryptPasswordEncoder.matches(m.getPw(), loginUser.getPw())) {
			
			throw new Exception("암호불일치~!!");
			
		}
		
		
		return loginUser;
	}
	
	
	@Override
	public void insertMember(MemberDTO m ) throws Exception {
		
		System.out.println("암호화전 : " + m.getPw());
		
		String encpw = bCryptPasswordEncoder.encode(m.getPw());
		
		System.out.println("암호화후 : " + encpw);
		
		
		m.setPw(encpw);
		int result = memberDAO.insertMember(sqlSession, m );
		if(result < 0 ) {
			throw new Exception("회원가입에 실패 하였습니다.");
		}
		
		
	}
}
