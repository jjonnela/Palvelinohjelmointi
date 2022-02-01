package fi.onnela.helloPalvelinohj.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	@RequestMapping("/hello")
	public String sayHello(@RequestParam(value = "nimi") String nimi, @RequestParam(value = "ika") int ika,
			Model model) {
		model.addAttribute("nimi", nimi);
		model.addAttribute("ika", ika);
		return "hello";
	}
}
