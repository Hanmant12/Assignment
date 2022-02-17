package com.example.Demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Demo.Repository.StudentRepo;
import com.example.Demo.model.Student;
import com.example.Demo.serviceImpl.StudentImpl;

@Controller
public class webcontroler {
	@Autowired
	StudentImpl std;
	
	@Value("${myapp.title}")
	private String pagetitle;

	@GetMapping(value={"/","index"})
	public String index(Model model)
	
	{
		
		model.addAttribute("pagetitle", pagetitle);
		return "from1";
	}
	

	@GetMapping("/getdata")
	public String printe(Model model  )
	
	{
		
		List<Student> student=std.display();
		model.addAttribute("Student", student);
		return "print";
	}
	@GetMapping("/getd") // this is used for laoding blank form
   public String pudata(Model model)
	{
		Student s=new Student();
		model.addAttribute("Std", s);
		return "form";
	}
	
	@PostMapping("/putdata") // this is used for sending data in database
	public String savea(Model model,@ModelAttribute("Std") Student student)
	{
		System.out.println(student);
		std.add(student);
		return "redirect:/getd";
		
	}
	@GetMapping("/updateform") // this is used for laoding blank form
	   public String emptfrm(Model model)
		{
			Student s=new Student();
			model.addAttribute("Std", s);
			return "update";
		}
	
	@PostMapping("/updaterecord")
	public String updaterec(Model model,@ModelAttribute("Std") Student student)
	{
		
		std.add(student);
		System.out.println("doen");
		
		return "update";
	}
}
