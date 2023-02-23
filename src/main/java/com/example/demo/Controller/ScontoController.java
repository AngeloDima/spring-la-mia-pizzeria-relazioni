package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Model.Sconto;
import com.example.demo.Repository.pizzeriaRepository;
import com.example.demo.Repository.scontoRepository;



@Controller
@RequestMapping("/sconto")
public class ScontoController {
	
	@Autowired
	scontoRepository repository;
	
	@Autowired
	pizzeriaRepository repositoryPizza;
	
	
	
	@GetMapping("/create")
	public String create(@RequestParam(name="elencoPizze")Integer pizzaId, Model model) {
		Sconto sconto = new Sconto();
		sconto.setElencoPizze(repositoryPizza.getReferenceById(pizzaId));
		model.addAttribute("sconto", sconto);
		return "creaSconto";
	}

	@PostMapping("/create")
	public String paggCreate(@ModelAttribute("sconto") Sconto formSconto, BindingResult bindingResult, Model model) {	
		repository.save(formSconto);
		return "redirect:/";
	}
}



