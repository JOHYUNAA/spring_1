package com.iu.s1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.qna.QnaDTO;

@Controller
@RequestMapping(value="/qna/*")
public class QnaController {
	
	@RequestMapping(value="qnaList", method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView list(ModelAndView mv, @RequestParam(defaultValue="0",required=false)int curPage){
		QnaDTO qnaDTO=new QnaDTO();
		
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("wirte");
		qnaDTO.setAge(255);
		
		mv.addObject("view",qnaDTO);
		mv.setViewName("qna/qnaList");
		System.out.println("curpGe:"+curPage);
		return mv;
	}
	
	@RequestMapping(value="qnaView")
	public String view(Model model){
		QnaDTO qnaDTO=new QnaDTO();
		
		qnaDTO.setTitle("test");
		qnaDTO.setWriter("wirte");
		qnaDTO.setAge(24);
		
		model.addAttribute("view",qnaDTO)
			.addAttribute("board","QNA");
		return "qna/qnaView";
	}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.GET)
	public String write(){
		return "qna/qnaWrite";
	}
	
	@RequestMapping(value="qnaWrite", method=RequestMethod.POST)
	public String write(QnaDTO qnaDTO,String title){ 
		// 굳이 파라미터명을 적지 않고 내가 set할 DTO만 적어주면 알아서 set해줌. 그래서 변수명이 맞아야함.
		// 그리고 qnaDTO에 없는 파라미터가 오면 ',' 이후에 파라미터를 또 작성해주면 된다.
		// QnaDTO 안에 있는 파라미터 ex)title을 또 파라미터로 적으면.. 둘다 동일한 value가 들어간다.
		
		System.out.println("title: "+qnaDTO.getTitle());
		System.out.println("title: "+title);
		System.out.println("writer: "+qnaDTO.getWriter());
		System.out.println("age: "+qnaDTO.getAge());
	
		for(String n: qnaDTO.getName()){
			System.out.println("name: "+n);
		}
		
		return "redirect:./qnaList?curPage=5";
	}
	
}
