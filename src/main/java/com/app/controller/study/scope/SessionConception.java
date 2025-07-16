package com.app.controller.study.scope;

import java.util.HashMap;
import java.util.Map;

public class SessionConception {
	
	/*
		사용자 (브라우저)			(요청) > 서버
		쿠키값(JSESSIONID) <		(응답) >
		
		
		사용자 - (요청 : 쿠키값) > 서버 : 쿠키값 확인
									>	JSESSIONID key 값 > 그 세션의 저장공간 영역  > session.setAttribute
									
		Map
		key:JSESSIONID Value : 저장공간(SessionStorage)
		
	
	*/
	
	public static void main (String[] args) {
		
		Map<String, SessionStorage> sessionMap = new HashMap<String, SessionStorage>();
		
		//새로운 사용자 접근 > 11AA
		
		sessionMap.put("11AA",new SessionStorage()); // 11AA 세션에 대한 저장공간
		
		SessionStorage session = sessionMap.get("11AA");
		session.setAttribute("fromBMsg", "fromB");
		session.setAttribute("msg", "hello");
		
		// 또다른 사용자 접근 > 22BB
		
		
		sessionMap.put("22BB",new SessionStorage());
		
		session = sessionMap.get("11AA");
		session = sessionMap.get("22BB");
		
		
	}
	
	
}


class SessionStorage {
	
	Map<String,Object> storage;
	
	public SessionStorage() {
		storage = new HashMap<String, Object>();
		
	}
	
	public void setAttribute(String key, Object value) {
		storage.put(key, value);
	}
	
	public void removeAttribute(String key) {
		storage.remove(key);
	}
	
	public void invalidate() {
		storage.clear();
	}
	
}

