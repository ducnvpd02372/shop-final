package group.shop.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import group.shop.entity.Categorys;
import group.shop.entity.Products;
import group.shop.model.Product;
import group.shop.services.CategoryService;
import group.shop.services.ProdutService;

@Controller
@RequestMapping("/prod")
public class ProductController {
	
	@Autowired
	ProdutService productService;
	@Autowired
	CategoryService categoryService;
	@GetMapping("/list_product")
	public String list_product(ModelMap model) {
		model.addAttribute("product", productService.findAll());
		return "manager/list_product";
	}
	@GetMapping("/add_product")
	public String add_product(ModelMap model) {
		model.addAttribute("product", new Products());
		model.addAttribute("categorys", categoryService.findAll());
		return "manager/add_product";
	}
	@PostMapping("/add_product")
	public String add_product_save(@RequestParam(value = "image") MultipartFile image ,@Valid @ModelAttribute("product") Products prod,BindingResult result, ModelMap modelMap) {
		if (result.hasErrors()) {
			return "manager/add_product";
		}
		
		
		productService.save(prod);
		return "redirect:list_product";
	}
	@GetMapping("/edit_product/{id}")
	public String edit_product(@PathVariable(name = "id") int id, ModelMap model) {
		
		model.addAttribute("product", productService.findById(id));

		model.addAttribute("categorys", categoryService.findAll());
		return "manager/edit_product";
	}
	@PostMapping("/edit_product")
	public String edit_product_save(@Valid @ModelAttribute("product") Products prod,
			@RequestParam(value = "file") MultipartFile image, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "manager/add_product";
		}
		if(!image.isEmpty()) {
			try {
				prod.setImage(image.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			
			prod.setImage(productService.findById(prod.getId()).get().getImage());
		}
		
		productService.save(prod);
		return "redirect:list_product";
	}
	
	@GetMapping("/deleteProd/{idpro}")
	public String delete(@PathVariable(name = "idpro") int idpro) {
		productService.deleteById(idpro);
		return "redirect:list_product";
	}
	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws ServletException {
		binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
	}

}
