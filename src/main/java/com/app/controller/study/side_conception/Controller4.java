package com.app.controller.study.side_conception;

import java.util.Map;

public class Controller4 {

	// 비즈니스 로직처리

	public String process(MyModel myModel) {
		
		
		myModel.addAttribute("key1", "value11");
		myModel.addAttribute("key2", "value12");
		myModel.addAttribute("key3", "value13");
		
		
		return "product/mouse";
	}
	
	
	public  String process(MyModel myModel, Map<String, String> paramMap) {
		
		
		myModel.addAttribute(null, paramMap);
		
		//paramMap.get("key") > 파라미터 활용/처리
		//그냥 이 내부에서만 쓰는 지역변수
		//MyModel model = 
		
		myModel.addAttribute("key1", "value11");
		myModel.addAttribute("key2", "value12");
		myModel.addAttribute("key3", "value13");
		
		
		return "product/keyboard";
	}

}
