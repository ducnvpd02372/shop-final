package group.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import group.shop.services.ProdutService;

@Controller
@RequestMapping("shop")
public class ShopController {
	@Autowired
	private ProdutService produtService;
	@RequestMapping("/prod/{id}")
	public String page(@PathVariable("id") int prodId,ModelMap modelMap){
		modelMap.addAttribute("prod", produtService.findById(prodId).get());
		return "shop/product";
		
	}
	 
}
