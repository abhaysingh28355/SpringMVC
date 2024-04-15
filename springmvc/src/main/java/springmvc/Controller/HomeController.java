package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/demo")
	public String demo() {
		System.out.println("this is java class ");
		return "index";
	}
//	@RequestMapping("/home ")
//	public String home() {
//		System.out.println("this is java class Default ");
//		return "index";
//	}

}
