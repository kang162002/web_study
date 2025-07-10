package com.app.controller.study.practice.practice03;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.controller.dto.study.practice.practice03.Beverage;

@Controller
@RequestMapping("/practice03")
public class Practice03Controller {

	@GetMapping("/request1_1")
	public String request1_1(HttpServletRequest request) {

		System.out.println("/practice03/request1_1");
		System.out.println(request.getParameter("item"));
		System.out.println(request.getParameter("type"));

		return "practice/practice03/req";
	}

	@GetMapping("/request1-2")
	public String request1_2(@RequestParam String item, @RequestParam String type) {
		System.out.println("/practice03/request1-2  요청");
		System.out.println(item);
		System.out.println(type);

		return "practice/request03/req";
	}

	@GetMapping("/request1-3")
	public String request1_3(@RequestParam Map<String, String> paramMap) {
		System.out.println(paramMap.get("item"));
		System.out.println(paramMap.get("type"));

		return "practice/practice03/req";
	}

	@GetMapping("/request1-4")
	public String request1_4(@ModelAttribute Beverage beverage) {
		System.out.println("practice/practice1-4");
		System.out.println(beverage);
		return "practice/practice03/req";
	}

	
	@GetMapping("/viewData1-1")
	public String viewData1_1(HttpServletRequest request) {
		request.setAttribute("name","싸이버거");
		request.setAttribute("type","햄버거");
		
		return "practice/practice03/viewData"; 
	}
	
	
	@GetMapping("/viewData1-2")
	public String viewData1_2(Model model) {
		model.addAttribute("name","후라이드치킨");
		model.addAttribute("type","치킨");
		
		return "practice/practice03/viewData"; 
	}
	
	
//	@GetMapping("/viewData1-3")
//	public String  viewData1_3(Model model) {
//		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("practice/practice03/viewData");
//		mav.addObject("name","후라이드치킨");
//		mav.addObject("type","치킨");
//		
//		return mav; 
//	}
	
	
	@GetMapping("/viewData1-4")
	public String viewData1_4(Model model) {
		
		System.out.println("/practice03/viewData1-4)");
		model.addAttribute("name","후라이드치킨");
		model.addAttribute("type","치킨");
		
		DrinkItem drinkItem = new DrinkItem();
		
		drinkItem.setName("콜라");
		drinkItem.setType("탄산음료");
		
		model.addAttribute("drinkItem", drinkItem);
		return "practice/practice03/viewData"; 
	}
	
	
}
