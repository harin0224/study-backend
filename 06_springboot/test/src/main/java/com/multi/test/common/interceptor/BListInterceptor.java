package com.multi.test.common.interceptor;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.slf4j.LoggerFactory;


import com.multi.test.member.model.dto.MemberDTO;

import ch.qos.logback.classic.Logger;

public class BListInterceptor extends HandlerInterceptorAdapter{
	private static final Logger logger=(Logger) LoggerFactory.getLogger(BListInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		MemberDTO loginUser = (MemberDTO)session.getAttribute("loginUser");
		
		if(loginUser == null) {
			logger.info("비로그인 상태에서 [ "+ request.getRequestURI() + " ] 접근시도 !!");
			
			session.setAttribute("msg", "로그인 후 이용하세요");
			response.sendRedirect("/spring");
			return false;
		}
		
		return true;
	}
	
	
	
	

}
