package com.sfm.stage.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sfm.stage.entity.Logistique;
import com.sfm.stage.service.LogistiqueService;

import jakarta.validation.Valid;

@Controller
public class ArticleController {

	private LogistiqueService logistiqueService;

	public ArticleController(LogistiqueService logistiqueService) {
		this.logistiqueService = logistiqueService;
	}

	// handler method to handle home page request
	@GetMapping("/index")
	public String home(Model model) {
		List<Logistique> logistiques = logistiqueService.findAllLogistiques();
		model.addAttribute("logistiques", logistiques);
		return "index";
	}

	// handler method to handle user registration form request
	@GetMapping("/save")
	public String showSaveForm(Model model) {
		// create model object to store form data
		Logistique logistique = new Logistique();
		model.addAttribute("logistique", logistique);
		return "save";
	}

	// handler method to handle user registration form submit request
	@PostMapping("/save/logistique")
	public String saveLogistique(@Valid @ModelAttribute("logistique") Logistique logistique, BindingResult result,
			Model model) {
		logistiqueService.saveLogistique(logistique);
		return "redirect:/save?success";
	}

	@PostMapping("/articleDelete")
	public String articleDelete(@ModelAttribute(value = "article") Logistique logistique, BindingResult result,
			Model model) {
		logistiqueService.deleteById(logistique.getId());
		return "redirect:index";
	}

	// handler method to handle user registration form request
	@PostMapping("/update")
	public String showUpdateForm(@ModelAttribute(value = "article") Logistique logistique, BindingResult result,
			Model model) {
		// create model object to store form data
		model.addAttribute("logistique", logistique);
		return "update";
	}

	// handler method to handle user registration form submit request
	@PostMapping("/update/logistique")
	public String updateLogistique(@Valid @ModelAttribute("logistique") Logistique logistique, BindingResult result,
			Model model) {
		logistiqueService.saveLogistique(logistique);
		return "redirect:/index";
	}
}