package huijingyuan.mulan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("loginPage")
	public String LoginPage() {
		return"login";
	}
	@RequestMapping("registerPage")
	public String registerPage() {
		return"register";
	}
}
