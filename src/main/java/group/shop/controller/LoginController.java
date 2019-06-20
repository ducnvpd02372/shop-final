package group.shop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import group.shop.entity.Customers;
import group.shop.entity.Users;
import group.shop.services.CustomerService;
import group.shop.services.UserService;
@Controller
@RequestMapping("")
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	public HttpSession session;
	@GetMapping("/login")
	public String getLoginForm(ModelMap model) {
		model.addAttribute("login", new Users());
		return "login/login";
	}
	@PostMapping("/login")
	public String login(@RequestParam("account") String account,@RequestParam("pass") String pass,ModelMap model) {
		
		if(userService.findByName(account).isPresent()) {
			Users users= userService.findByName(account).get();
			if(users.getPassword().equals(pass)) {
				if(session.getAttribute("accLoginC")!=null)session.removeAttribute("accLoginC");
				session.setAttribute("accLoginA", users);
				return "manager/index";
			}else {
				model.addAttribute("invalid", true);
				return "login/login";
			}
		}else if (customerService.findByName(account).isPresent()) {
			Customers users= customerService.findByName(account).get();
			if(users.getPass().equals(pass)) {
				if(session.getAttribute("accLoginA")!=null)session.removeAttribute("accLoginA");
				session.setAttribute("accLoginC", users);
				return "home/index";
			}else {
				model.addAttribute("invalid", true);
				return "login/login";
			}
		} else {
			model.addAttribute("invalid", true);
			return "login/login";
		}
		
	}
}
