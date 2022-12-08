package shop_app.FirstSpring.com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@GetMapping("/")
	public String getmap() {
		return "index";
		
	}
	

}
