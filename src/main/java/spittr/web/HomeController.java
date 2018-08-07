package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping({"/","/homepage"})//将控制器映射到"/"和"homepage"
public class HomeController {
	
	@RequestMapping(method=GET)//对控制器mapping做请求方法的补充
	public String home() {
		return "home"; //返回视图名字
	}
}
