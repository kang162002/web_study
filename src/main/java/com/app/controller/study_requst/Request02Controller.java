package com.app.controller.study_requst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/* 컴포넌트 등록이 되려면 ,
 	servlet-context.xml 에 설정되어있는 
 	
 	context:component-scanbase-package="com.app.controller"
 */

//Controller 컴포넌트로 인식해서 스프링에 등록
@Controller // 이노테이션
@RequestMapping("/request02")
public class Request02Controller {

	
	
	
	// 리퀘스트 맵핑: 요청 들어오는 주소별로 맵핑
//	@RequestMapping("/request02/url02")
	@RequestMapping("/url02") // 괄호안에 명시된 주소로 요청이 들어왔을때 담당 설정
	public String url02() {

		return "url1";
		// 리턴하는 문자열의 이름을 가지고 있는 view파일을 명시 -> view 파일로 연결
		// ViewResolver 설정
		// /WEB-INF/views/ "return 한 view 이름문자열" .JSP
	}


	
//	@RequestMapping("/request02/url03")
	@RequestMapping("/url03")
	public String ur03() {
		return "url1";
	}
	
//	@RequestMapping("/request02/url04")
	@RequestMapping("/url04")
	public String url04() {
		return "url1";
	}
	
	
	


}
