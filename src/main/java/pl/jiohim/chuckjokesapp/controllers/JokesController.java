package pl.jiohim.chuckjokesapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jiohim.chuckjokesapp.services.JokeService;

@Controller
public class JokesController {
    private final JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"", "/"})
    public String showJoke(Model model){

        model.addAttribute("joke", jokeService.randomJoke());

        return "index" ;
    }
}
