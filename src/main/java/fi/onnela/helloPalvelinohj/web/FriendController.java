package fi.onnela.helloPalvelinohj.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {

	ArrayList<String> friends = new ArrayList<String>();

	@GetMapping("friends")
	public String handleFriends(@RequestParam(required = false) String friend, Model model) {

		if (friend != null) {
			friends.add(friend);
		}

		model.addAttribute("friends", friends);

		return "helloFriends";
	}
}
