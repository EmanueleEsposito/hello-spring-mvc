package jana60.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	@GetMapping("/home")

	public String saluto() {
		return "home";
	}

// BONUS
	@GetMapping("/ora")
	public String dataOra(Model model) {
		LocalDateTime oggi = LocalDateTime.now();
		model.addAttribute("orario", oggi);
		return "time";

	}
}