package bootsample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bootsample.service.PersonService;

@Controller
public class MainController {

	
	@Autowired
	private PersonService personservice;
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("tasks", personservice.findAll());
		return "index";
	}
}
