package group.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import group.shop.services.ProdutService;
@Controller
@RequestMapping(value= {"","index"})
public class HomeController {
 @Autowired 
 private ProdutService  produtService;
 
	@RequestMapping()
	public String index(ModelMap modelMap){
		modelMap.addAttribute("prods", produtService.findAll());
		return"home/index";
	}
	
}
