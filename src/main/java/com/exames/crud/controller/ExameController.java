	package com.exames.crud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exames.crud.model.ExameModel;
import com.exames.crud.repository.ExameReposity;

@Controller
public class ExameController {
	

	

	@Autowired
	private ExameReposity exameRepo;
	

	
	@GetMapping("/exame/{idExame}")
	public ModelAndView listar(@PathVariable("idExame") Long idExame) {
		ModelAndView modelAndView = new ModelAndView("paciente");
		modelAndView.addObject("exame_model", exameRepo.findById(idExame));
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/exame/{idPaciente}", method = RequestMethod.POST)
	public String Post(ExameModel exame_model) {
		exameRepo.save(exame_model);
		return "redirect:/exame/{idPaciente}";
	}

	
	@RequestMapping("/de/{idExame}")
	public String achar(@PathVariable("idExame") Long idExame) {
		exameRepo.findById(idExame);
		return "paciente";
	}
	
	@RequestMapping("/deleteE/{idExame}")
	public String delete(@PathVariable("idExame") Long idExame) {
		exameRepo.deleteById(idExame);
		return "redirect:/user/add";
	}
	
}
