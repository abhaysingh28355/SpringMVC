package springmvc.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContextController {

	@RequestMapping("/contact")
	public String showform() {
		return "contact";
	}
	@RequestMapping(path="/processform",method = RequestMethod.POST )
	public String handleform(@RequestParam("email")String useremail,
			@RequestParam("userName") String username
			,@RequestParam("password") String userpassword,Model model) {
		
		System.out.println("user email=>" + useremail);
		System.out.println("user Name =>" + username );
		System.out.println("user password =>" + userpassword);
		model.addAttribute("name", username);
		model.addAttribute("email", useremail);
		model.addAttribute("password", userpassword);
		return "success";
	
	}
}
