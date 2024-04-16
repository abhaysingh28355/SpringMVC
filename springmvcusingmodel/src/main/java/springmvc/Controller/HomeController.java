package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/demo")
	public String demo(Model model) {
		System.out.println("this is java class ");
		model.addAttribute("name", "Jhunaa Singh");
		model.addAttribute("id",1234);
		return "index";
	}
	@RequestMapping("/home ")
	public String home() {
		System.out.println("this is java class Default ");
		return "index";
	}

}
