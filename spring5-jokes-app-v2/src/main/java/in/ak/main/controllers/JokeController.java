package in.ak.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ak.main.services.JokeService;

@Controller
public class JokeController {

		private final JokeService jokeService;

		public JokeController(JokeService jokeService) {
			this.jokeService = jokeService;
		}
		
		@RequestMapping({"/",""})
		public String showJoke(Model model) {
			model.addAttribute("Joke", jokeService.getJoke());
			return "index";
			
		}
		
}
