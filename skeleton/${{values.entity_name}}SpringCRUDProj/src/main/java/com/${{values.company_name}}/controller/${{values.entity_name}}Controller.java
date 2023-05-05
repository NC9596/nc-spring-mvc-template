package com.${{values.company_name}}.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.${{values.company_name}}.entity.${{values.entity_name}};
import com.${{values.company_name}}.service.${{values.entity_name}}Service;

@Controller
public class ${{values.entity_name}}Controller {

	@Autowired
	private ${{values.entity_name}}Service service;

	// show welcome page
		@GetMapping("/")
		public String showWelcome() {
			return "welcome";
		}
	
	// show register page
	@GetMapping("/reg")
	public String showReg(Model map) {
		// form baking object
		map.addAttribute("objOf${{values.entity_name}}", new ${{values.entity_name}}());
		return "register";
	}

	// save objectOf${{values.entity_name}}
	@PostMapping("/save")
	public String save${{values.entity_name}}(${{values.entity_name}} objectOf${{values.entity_name}}, Model map) {
		Integer id = service.save${{values.entity_name}}(objectOf${{values.entity_name}});
		map.addAttribute("msg", "${{values.entity_name}} [" + id + "] added successfully");

		// clear form baking object
		map.addAttribute("objOf${{values.entity_name}}", new ${{values.entity_name}}());

		return "register";
	}

	// get all objectOfCustomer
	@GetMapping("/all")
	public String show${{values.entity_name}}(Model map) {
		List<${{values.entity_name}}> list = service.getAll${{values.entity_name}}s();
		map.addAttribute("list", list);
		return "data";
	}

	// getOne objectOf${{values.entity_name}} for view page
	@GetMapping("/view")
	public String getOne${{values.entity_name}}(@RequestParam int id, Model map) {
		${{values.entity_name}} objectOf${{values.entity_name}}gt = service.getOne${{values.entity_name}}(id);
		if (objectOf${{values.entity_name}}gt != null) {
			map.addAttribute("objOf${{values.entity_name}}", objectOf${{values.entity_name}}gt);
		} else {
			map.addAttribute("msg", "No ${{values.entity_name}} Found");
		}

		return "view";
	}

	// delete objectOf${{values.entity_name}}
	@GetMapping("/delete")
	public String delete${{values.entity_name}}(@RequestParam Integer id, Model map) {
		service.delete${{values.entity_name}}(id);
		map.addAttribute("msg", "${{values.entity_name}} deleted Successfully");
		return "redirect:all";
	}

	// get Update objectOf${{values.entity_name}}
	@GetMapping("/getUpdate")
	public String getUpdate${{values.entity_name}}Page(@RequestParam Integer id, Model map) {
		map.addAttribute("objOf${{values.entity_name}}", service.getOne${{values.entity_name}}(id));
		map.addAttribute("mode", "edit");
		return "register";
	}

	// update objectOf${{values.entity_name}}
	@PutMapping("/update")
	public String update${{values.entity_name}}(@ModelAttribute ${{values.entity_name}} objectOf${{values.entity_name}}upP, Model map) {
		${{values.entity_name}} objectOf${{values.entity_name}}upA = service.update${{values.entity_name}}(objectOf${{values.entity_name}}upP);
		map.addAttribute("msg", "${{values.entity_name}} updated successfully");

		// clear form baking object 
		map.addAttribute("objOf${{values.entity_name}}",new ${{values.entity_name}}());
		return "redirect:view?id=" + objectOf${{values.entity_name}}upA.getid();
	}
	
	@PostMapping("/error")
	public String showError() {
		return "error";
}
	
}
