package huijingyuan.mulan.controller;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import huijingyuan.mulan.dao.UserDao;
import huijingyuan.mulan.model.User;

@Controller
public class UserController {
	@Autowired
	UserDao userDao;
	@RequestMapping("/register")
	public String register(User user ,Map<String,Object> map,HttpServletResponse response) {
		user.setUser_token(UUID.randomUUID().toString());
		int i=	userDao.insertUser(user);
		if(i!=0) {
			map.put("user",user);
			Cookie cookie=new Cookie("user_token",user.getUser_token());
			response.addCookie(cookie);
			return "index";
		}
		return "registerPage";
	}
	
	@RequestMapping("/login")
	public String login(User user,Map<String,Object> map,HttpServletResponse response) {
		User userInfo= userDao.queryUserByNameAndPassword(user);
		if(userInfo!=null) {
			map.put("user", userInfo);
			Cookie cookie=new Cookie("user_token",userInfo.getUser_token());
			response.addCookie(cookie);
			return "index";
		}
		return "login";
	}
	
}
