package be.radmila.radmila.tantaeva.controller;

import be.radmila.radmila.tantaeva.model.Activiteit;
import be.radmila.radmila.tantaeva.repository.ActiviteitRepository;
import be.radmila.radmila.tantaeva.repository.LocatieRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/activiteit")
public class ActiviteitController {

    private final ActiviteitRepository repo;
    private final LocatieRepository locatieRepo;

    public ActiviteitController(ActiviteitRepository repo, LocatieRepository locatieRepo) {
        this.repo = repo;
        this.locatieRepo = locatieRepo;
    }

    @GetMapping("/toevoegen")
    public String nieuwFormulier(Model model) {
        model.addAttribute("activiteit", new Activiteit());
        model.addAttribute("plaatsen", locatieRepo.findAll());
        return "new";
    }

    @PostMapping("/toevoegen")
    public String opslaan(@Valid @ModelAttribute Activiteit activiteit, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("plaatsen", locatieRepo.findAll());
            return "new";
        }
        repo.save(activiteit);
        return "redirect:/";
    }

    @GetMapping("/{id}")
    public String details(@PathVariable Long id, Model model) {
        model.addAttribute("activiteit", repo.findById(id).orElseThrow());
        return "details";
    }
}
