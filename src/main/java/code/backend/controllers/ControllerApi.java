package code.backend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class ControllerApi {
	
	@GetMapping("/apiRest")
	@ResponseBody
	public String ApiRset() {
		
		return "hello world";
	}

}
