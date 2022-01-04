package org.generation.italy.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("name", "Luca");

		return "index";
	}

	@GetMapping("/songs")
	public String songs(Model model) {

		model.addAttribute("list", Arrays.asList("Attention - Charlie Puth", "Bad Habits - Ed Sheeran", "How Long - Charlie Puth", "Wild Blue - John Mayer", "good 4 U - Olivia Rodrigo", "After All - Elton John feat. Charlie Puth"));
		model.addAttribute("obj", "Songs");

		return "list";
	}
	
	@GetMapping("/films")
	public String films(Model model) {
		
		model.addAttribute("list", Arrays.asList("Joker", "Il Lupo di WallStreet", "La Grande Scommessa", "Limitless"));
		model.addAttribute("obj", "Films");

		return "list";
	}

}
