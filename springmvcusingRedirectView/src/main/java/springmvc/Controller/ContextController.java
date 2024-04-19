package springmvc.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.Model.User;

@Controller
public class ContextController {
	
	@ModelAttribute
	public void CommonDataForModel(Model m) {
		
		m.addAttribute("Header","LearnCodeWithAbhay");
		m.addAttribute("Desc","Home the Programming");
		
	}

	@RequestMapping("/contact")
	public String showform(Model m) {
	System.out.println("form Created");
//		m.addAttribute("Header","LearnCodeWithAbhay");
//		m.addAttribute("Desc","Home the Programming");
		return "contact";
	}
	@RequestMapping(path="/processform",method = RequestMethod.POST )
	public String handleform(@ModelAttribute User us,Model model) {
		
		if(us.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		
//		model.addAttribute("Header","LearnCodeWithAbhay");
//		model.addAttribute("Desc","Home the Programming");
		
//		User us = new User();
//		us.setEmail(useremail);
//		us.setUserName(username);
//		us.setPassword(userpassword);
//		System.out.println(us);
		
		model.addAttribute("us",us);
		
//		System.out.println("user email=>" + useremail);
//		System.out.println("user Name =>" + username );
//		System.out.println("user password =>" + userpassword);
//		model.addAttribute("name", username);
//		model.addAttribute("email", useremail);
//		model.addAttribute("password", userpassword);
		return "success";
	
	}
}
