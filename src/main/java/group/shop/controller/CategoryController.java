package group.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import group.shop.entity.Categorys;
import group.shop.services.CategoryService;

@Controller
@RequestMapping("")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/list_category")
	public String list_category(ModelMap model) {
		
		model.addAttribute("category", categoryService.findAll());
		return "manager/list_category";
	}
	
	
	@GetMapping("/add_category")
	public String add_category(ModelMap model) {
		model.addAttribute("category", new Categorys());
		return "manager/add_category";
	}
	
	@PostMapping("/add_category")
	public String add_category(@ModelAttribute("category") Categorys prod) {
		categoryService.save(prod);
		return "redirect:/list_category";
	}
	@GetMapping("/edit_category")
	public String edit_category(@PathVariable(name = "idcate") int idcate,ModelMap model) {
		model.addAttribute("category", idcate);
		return "manager/list_category";
	}
	@PostMapping("/edit_category")
	public String edit_category(@ModelAttribute(name = "cateogry") Categorys c) {

		System.out.println("test");
		categoryService.save(c);
		System.out.println("test");
		return "redirect:/list_category";
	}
	@GetMapping("/edit_category/{id}")
	public String add_category(@PathVariable(name = "id") int idcate, ModelMap model) {
		model.addAttribute("id", categoryService.findById(idcate));
		return "manager/edit_category";
	}
	@GetMapping("/delete/{idcate}")
	public String delete(@PathVariable(name = "idcate") int idcate) {
		categoryService.deleteById(idcate);
		return "redirect:/list_category";
	}
}
