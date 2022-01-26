package fi.onnela.helloPalvelinohj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("index")
	@ResponseBody
	public String mainPage() {
		return "This is the main page";
	}

	@RequestMapping("contact")
	@ResponseBody
	public String contactPage() {
		return "This is the contact page";
	}

	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(@RequestParam(name = "name", required = false, defaultValue = "Jaakko") String firstName,
			@RequestParam(name = "location", required = false, defaultValue = "beach") String location) {
		return "Welcome to the " + location + ", " + firstName;
	}
}
