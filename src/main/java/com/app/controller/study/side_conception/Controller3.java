package com.app.controller.study.side_conception;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller3 {

	// 3 -1)
	public MyModelAndView process(HttpServletRequest request, HttpServletResponse response) {

		// Controller2 에서 처리해야하는 비즈니스 로직

		// view 에 관한 정보를 MyView 객체로 만들어서 전달(반환/return)

		MyModelAndView mav = new MyModelAndView();
		mav.setViewName("/WEB-INF/views/practice03/home.jsp");
		//ViewReso1ver 설정 이후로 가정
		
		//----------------------------
		
//		MyviewResolver MyViewResolver = new MyViewResolver();
		

		mav.addObject("product", "뭐다~");
		mav.addObject("itemValue", "abc~");

		return mav;

	}

	public MyModelAndView process(Map<String, String> paramMap) {

		// paramMap.get("key"); 전달받은 파라미터 확인/활용

		MyModelAndView mav = new MyModelAndView();
		mav.setViewName("/WEB-INF/views/practice03/home.jsp");

		mav.addObject("product", "뭐다~");
		mav.addObject("itemValue", "abc~");

		return mav;
	}

}