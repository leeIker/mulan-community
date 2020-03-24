package huijingyuan.mulan.controller;

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import huijingyuan.mulan.dao.QuestionDao;
import huijingyuan.mulan.model.Question;
import huijingyuan.mulan.servive.QuestionService;

@Controller
public class QuestionController {
	@Autowired
	QuestionService questionService;
	@Autowired
	QuestionDao questionDao;
	
@	RequestMapping("/question")
	public String question() {
		return "question";
	}
	
	@RequestMapping("insertQuestion")
	public String insertQuestion(Question question,HttpServletRequest request,Map<String,Object> map ) {
		Cookie[] cookies=	request.getCookies();
		if(cookies.length>0) {
			for(Cookie cookie:cookies) {
				String cookieName=cookie.getName();
				if(cookieName.equals("user_token")) {
					String user_token=cookie.getValue();
					Question questionDto=questionService.addData(question, user_token);
					int i= questionDao.insertQuestion(questionDto);
					if(i==1) {
						return "index";
					}
					
					
					
				}
			}map.put("error", "插入失败,情先登录");
		}
		
		return "question";
	}
}
