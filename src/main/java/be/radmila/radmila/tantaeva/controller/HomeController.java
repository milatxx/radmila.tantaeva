package be.radmila.radmila.tantaeva.controller;

import be.radmila.radmila.tantaeva.repository.ActiviteitRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final ActiviteitRepository repo;

    public HomeController(ActiviteitRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("activiteiten", repo.findTop10ByOrderByMomentDesc());
        return "index";
    }

    @GetMapping("/info")
    public String info() {
        return "about";
    }
}
