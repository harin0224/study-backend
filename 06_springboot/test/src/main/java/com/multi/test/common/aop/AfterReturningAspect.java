package com.multi.test.common.aop;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.multi.test.member.model.dto.MemberDTO;

import ch.qos.logback.classic.Logger;

@Aspect
@Component
public class AfterReturningAspect {
	private static final Logger logger=(Logger) LoggerFactory.getLogger(AfterReturningAspect.class);
	
	
	
	@AfterReturning(pointcut="execution(* com.multi.spring..*ServiceImpl.login*(..))", returning="returnObj")// 정상적으로 비지니스 메소드가 리턴한 결과 데이터를 다른 용도로 처리할때.
	public void loggerAdvice(JoinPoint join, Object returnObj) {
		
		if(returnObj instanceof MemberDTO) {
			
			MemberDTO m= (MemberDTO)returnObj;
			
			if(m.getId().equals("admin")) {
				logger.info("[LOG] : 관리자님환영합니다. ");
			}else {
				logger.info("[LOG] : "+ m.getId() + " 로그인성공 !!");
			}
		}
	
	
	}
	
}
