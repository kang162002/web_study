package com.app.controller.study.practice.practice05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Practice05Controller {

	/*
	 * @GetMapping("/pathA") public String pathA() { return
	 * "practice/practice05/pathA"; }
	 * 
	 * 
	 * @GetMapping("/pathB") public String pathB() { return
	 * "practice/practice05/pathB"; }
	 * 
	 * 
	 * @GetMapping("/pathCommon/A") public String pathCommonA() { return
	 * "practice/practice05/pathCommonA/A"; }
	 * 
	 * 
	 * @GetMapping("/pathCommon/B") public String pathCommonB() { return
	 * "practice/practice05/pathCommonB/B"; }
	 * 
	 */

	// 2) (상품기준) A정보, B정보 2개의 페이지를 기준으로 사용하는 케이스

	/*
	 * @GetMapping("/pathA") public String pathA() { return
	 * "practice/practice05/pathA"; }
	 * 
	 * 
	 * @GetMapping("/pathB") public String pathB() { return
	 * "practice/practice05/pathB"; }
	 * 
	 * 
	 * @GetMapping("/pathCommon/A") public String pathCommonA() { return
	 * "practice/practice05/pathCommonA/A"; }
	 * 
	 * 
	 * @GetMapping("/pathCommon/B") public String pathCommonB() { return
	 * "practice/practice05/pathCommonB/B"; }
	 * 
	 */

	// 3) pathA, pathB 는 각자 페이지, pathCommon 공통 페이지에 동적 데이터 전달

//	@GetMapping("/pathA")
//	public String pathA() {
//		return "practice/practice05/pathA";
//	}
//
//	@GetMapping("/pathB")
//	public String pathB() {
//		return "practice/practice05/pathB";
//	}

//	@GetMapping("/pathCommon/A")
//	public String pathCommonA(Model model) {
//		
//		model.addAttribute("productName", "A");
//		
//		return "practice/practice05/pathCommon/Common";
//	}
//
//	@GetMapping("/pathCommon/B")
//	public String pathCommonB(Model model) {
//		
//		model.addAttribute("productName", "B");
//		
//		return "practice/practice05/pathCommon/Common";
//
//	}

	// + pathCommon/pathVariable 형태로 사용

	/*
	 * @GetMapping("/pathCommon/{productName}") public String
	 * pathCommonA(@PathVariable String productName, Model model) {
	 * 
	 * model.addAttribute("productName", "A");
	 * 
	 * return "practice/practice05/pathCommon/Common"; }
	 * 
	 * @GetMapping("/pathCommon/B") public String pathCommonB(Model model) {
	 * 
	 * model.addAttribute("productName", "B");
	 * 
	 * return "practice/practice05/pathCommon/Common";
	 * 
	 * }
	 */

	// 4) 모든 경로가 동일한 공통 페이지 사용 케이스

	/*
	 * @GetMapping("/pathA") public String pathA(Model model) {
	 * model.addAttribute("productName", "A"); return
	 * "practice/practice05/pathCommon/Common"; }
	 * 
	 * 
	 * @GetMapping("/pathB") public String pathB(Model model) {
	 * model.addAttribute("productName", "B"); return
	 * "practice/practice05/pathCommon/Common"; }
	 * 
	 * 
	 * @GetMapping("/pathCommon/A") public String pathCommonA(Model model) {
	 * model.addAttribute("productName", "A"); return
	 * "practice/practice05/pathCommon/Common"; }
	 * 
	 * 
	 * @GetMapping("/pathCommon/B") public String pathCommonB(Model model) {
	 * model.addAttribute("productName", "B"); return "practice/practice05/pathB"; }
	 */

	@GetMapping(value = { "/pathA", "/pathCommon/A" })
	public String pathA() {

		return "practice/practice05/pathCommon/Common";
	}

	@GetMapping(value = { "/pathB", "/pathCommon/B" })
	public String pathB() {

		return "practice/practice05/pathCommon/Common";
	}

}
