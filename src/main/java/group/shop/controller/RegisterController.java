package group.shop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import group.shop.entity.Customers;
import group.shop.services.CustomerService;

@Controller
public class RegisterController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String page(ModelMap model){
		model.addAttribute("customer", new Customers());
		return "register/register";
	}
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register (@Valid @ModelAttribute("customer")Customers customers, BindingResult result ,ModelMap model){
		if(result.hasErrors()) {
			return "register/register";
		}
		if(customerService.findByName(customers.getEmail()).isPresent()||customerService.findByName(customers.getPhone()).isPresent()) {
			model.addAttribute("result", "Tài khoản đã tồn tại");
			return "register/register";
		}
		customerService.save(customers);
		model.addAttribute("result", "Đăng ký thằng công");
		return "register/register";
	}
}
