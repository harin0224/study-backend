package com.multi.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller	// 컨트롤러라 어노테이션은 컨트롤러
@RestController
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		
		return "main";	// Spring에 리졸버가 알아서 매핑해줌?
	}
	
//	@RequestMapping("/main")
//	public String main() {
//		
//		
//	}
	
//	@RestController :  RestController 어노테이션을 사용하면 @ResponseBody 를 일일이 선언 안해도 되게 지원해준다. 
//	restController 차체가 controller  + @ResponseBody  ->ajax수업때 진행, springboot보강시


}
