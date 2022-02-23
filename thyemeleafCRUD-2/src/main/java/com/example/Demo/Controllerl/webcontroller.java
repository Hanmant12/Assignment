package com.example.Demo.Controllerl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Demo.model.Exam;
import com.example.Demo.serviceimplement.Examserimpl;

@Controller
public class webcontroller {

	@Autowired
	Examserimpl impl;
	
	@GetMapping("/showdata")
	public String displaydata(Model model)
	{
		List<Exam> e=impl.display();
		model.addAttribute("exa", e);
		
		return "display";
}
	@GetMapping("/del1{id}")
	public String Deletmyda(@PathVariable int id)
	{
		impl.deletbyid(id);
		return"redirect:/showdata";
	}
	
	@GetMapping("/loademptyform") // loading form
	public String load(Model model)
	{
		
		Exam e=new Exam();
		model.addAttribute("frm", e);
		return "form";
	}
	
	@PostMapping("/stdataa")
	public String stmydata(Model model,@ModelAttribute("frm") Exam exam)
	
	{
		System.out.println(exam);
		impl.add(exam);
		return "redirect:/loademptyform";
	}
	
}
