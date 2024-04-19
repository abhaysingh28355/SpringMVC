package springmvc.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectionController {

	@RequestMapping("/one")
	public String one(HttpServletResponse response) {
	System.out.println("This is a one program");
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("https://www.JavaTPoint.com");
	
		return "";
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is a two program");
		return "";
	}
}
