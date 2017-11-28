package com.iu.s1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value="/notice/noticeList")
	public String go(HttpServletRequest request,HttpServletResponse response){
		String name=request.getParameter("name");
		System.out.println(name);
		return "notice/noticeList";
	}
	
	@RequestMapping(value="/notice/noticeView")
	public String view(){
		return "/notice/noticeView";
	}
	
}



