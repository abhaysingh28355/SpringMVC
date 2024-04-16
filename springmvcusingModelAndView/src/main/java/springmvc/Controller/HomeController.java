package springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/demo")
	public String demo(Model model) {
		System.out.println("this is java class ");
		model.addAttribute("name", "Jhunaa Singh");
		model.addAttribute("id",1234);
//		List<String> list = new ArrayList<String>();
//		list.add("Roshan");
//		list.add("munna");
//		list.add("Pawan");
//		list.add("Akalu");
//		model.addAttribute("l", list);
		return "index";
	}
	@RequestMapping("/home")
	public ModelAndView home() {
		System.out.println("this is java class Default ");
		//Creating Model and view Object
		ModelAndView mav = new ModelAndView();
		//Set the data
		mav.addObject("name", "Akalu");
		mav.addObject("name1", "Akashra Singh");
//		mav.addObject("rollno", "2345");
		//set the views name
		mav.setViewName("home");
		return mav;
	}

}
