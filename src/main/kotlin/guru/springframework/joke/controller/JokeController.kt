package guru.springframework.joke.controller

import guru.springframework.joke.service.JokesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class JokeController(@Autowired val jokesService: JokesService) {

    @RequestMapping(value = ["/", ""])
    fun showJoke(model: Model): String {
        model.addAttribute("joke", jokesService.getJoke())
        return "chucknorris"

    }
}
