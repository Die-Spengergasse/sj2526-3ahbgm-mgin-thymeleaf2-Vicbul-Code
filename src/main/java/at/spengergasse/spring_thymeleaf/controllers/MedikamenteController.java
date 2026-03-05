package at.spengergasse.spring_thymeleaf.controllers;

import at.spengergasse.spring_thymeleaf.entities.Medikamente;
import at.spengergasse.spring_thymeleaf.entities.MedikamenteRepository;
import at.spengergasse.spring_thymeleaf.entities.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("/medikamente")
public class MedikamenteController
{
    public final MedikamenteRepository medikamenteRepository;

    public MedikamenteController(MedikamenteRepository medikamenteRepository)
    {
        this.medikamenteRepository = medikamenteRepository;
    }
    @GetMapping("/")
    public String home() {
        return "index";
    }
    @GetMapping ("/add")
    public String addMedikamente(Model model)
    {
        model.addAttribute("Medikamente", new Medikamente());
        return "add_medikamente";
    }
    @PostMapping("/add")
    public String addMedikamente(Medikamente Medikamente)
    {
        medikamenteRepository.save(Medikamente);
        return "redirect:/medikamente/list";
    }
    @GetMapping ("/list")
    public String medikamente(Model model)
    {
        model.addAttribute("medikamente", medikamenteRepository.findAll());
        return "medlist";
    }

    @PutMapping ("/update")
    public String updateMedikamente(Medikamente medikamente)
    {
        medikamenteRepository.save(medikamente);
        return "redirect:/medikamente/list";
    }

    @DeleteMapping ("/delete/{id}")
    public String deleteMedikamente(@PathVariable int id)
    {
        medikamenteRepository.deleteById(id);
        return "redirect:/medikamente/list";
    }
}
