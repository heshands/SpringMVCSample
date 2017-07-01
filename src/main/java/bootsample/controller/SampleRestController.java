package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bootsample.service.PersonService;

@RestController
public class SampleRestController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/hello")
	public String Hello()
	{
		return "Hello World**";
	}
	
	@GetMapping("/person-list")
	public String getPersonList(){
		
		return personService.findAll().toString();
	}
}
