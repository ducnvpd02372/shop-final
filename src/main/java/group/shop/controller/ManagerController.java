package group.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import group.shop.entity.Categorys;
import group.shop.model.Category;
import group.shop.services.CategoryService;

@Controller
@RequestMapping("/manager")
public class ManagerController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="")
	public String manager() {
		
		return "manager/index";
	}
	
	/// category
	@RequestMapping(value="/category")
	public String category(ModelMap model) {
		Category c = new Category();
		model.addAttribute("category", c);
		return "manager/list_category";
	}
	@GetMapping(value = "/category")
	public String list_cateogory(ModelMap model) {
		List<Categorys> c = categoryService.findAll();
		model.addAttribute("category", c);
		return "manager/list_category";
	}
}
