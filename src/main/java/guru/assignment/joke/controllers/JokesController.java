package guru.assignment.joke.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.assignment.joke.services.JokeGenService;

@Controller
public class JokesController {

	private JokeGenService jokeGeneratorService;
	
	@Autowired
	public JokesController(JokeGenService jokeGeneratorService) {
		this.jokeGeneratorService = jokeGeneratorService;
	}

	@RequestMapping(name="/")
	public String seeJokes(Model model) {
		model.addAttribute("joke", jokeGeneratorService.jokeGrabber());
		return "chucknorris";
	}
}
