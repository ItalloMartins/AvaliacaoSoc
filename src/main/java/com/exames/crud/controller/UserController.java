package com.exames.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exames.crud.model.UserModel;
import com.exames.crud.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	

	
	@GetMapping("/ListaPacientes")
	public ModelAndView mostraTodos() {
		ModelAndView modelAndView = new ModelAndView("listaPaciente");
		modelAndView.addObject("user_model", userRepository.findAll());
		return modelAndView;
	}
	
	
	@GetMapping("/")
	public ModelAndView CadastraPaciente() {
		ModelAndView modelAndView = new ModelAndView("lista");
		modelAndView.addObject("user_model", userRepository.findAll());
		return modelAndView;
	}
	
	
	@RequestMapping(value = "/teste/{idPaciente}", method = RequestMethod.GET)
	public ModelAndView getPacienteDetails(@PathVariable("idPaciente") long idPaciente) {
		ModelAndView modelAndView = new ModelAndView("lista2");
		userRepository.findById(idPaciente);
		return modelAndView;
	}
	


	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String Post(UserModel user_model) {
		userRepository.save(user_model);
		return "redirect:/ListaPacientes";
	}
	

	@RequestMapping("/delete/{idPaciente}")
	public String delete(@PathVariable("idPaciente") Long idPaciente) {
		userRepository.deleteById(idPaciente);
		return "redirect:/ListaPacientes";
	}
	


}
