package group.shop.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import group.shop.entity.Customers;
import group.shop.entity.Orders;
import group.shop.entity.Products;
import group.shop.services.OrderBean;
import group.shop.services.OrderService;
import group.shop.services.ProdutService;

@Controller
public class OrdersController {
	@Autowired
	private HttpSession session;
	@Autowired
	private OrderService orderService;
	@Autowired
	private ProdutService  prodService;
	@RequestMapping(value="cart", method= RequestMethod.GET)
	public String cart(ModelMap modelMap){
		modelMap.addAttribute("carts",session.getAttribute("cart"));
		return "shop/cart";
	}
	@RequestMapping(value="addcart", method= RequestMethod.GET)
	public String addOrder(@RequestParam("prod") int prod,@RequestParam("qty") int qty,ModelMap modelMap) {
		try {
			OrderBean cart= (OrderBean) session.getAttribute("cart");
			
			if (cart == null) {
                cart = new OrderBean();
            }
			Orders order = new Orders();
			
			
			
			LocalDate date = LocalDate.now();
			order.setDate(date);
			order.setCustomers((Customers )session.getAttribute("accLoginC"));
			System.out.println(session.getAttribute("accLoginC"));
			Products prodcart= prodService.findById(prod).get();
			order.setProducts(prodcart);
			order.setQuantity(qty);
			order.setTolalmoney(prodcart.getPrices()*qty);
			cart.addSanPham(order);
			cart.size();
			session.setAttribute("cart", cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:cart";
	}
	@RequestMapping(value="clearcart", method= RequestMethod.GET)
	public String clearOrder(ModelMap modelMap) {
		session.removeAttribute("cart");
		return "redirect:cart";
	}
}
