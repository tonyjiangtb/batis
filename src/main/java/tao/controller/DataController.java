package tao.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tao.service.serviceA;

@RestController
public class DataController {
	
	@Autowired
	private serviceA s;
	
	@RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
		String ret;
		ret=s.method2("haha");
        return "returned:"+ret;
    }
	@RequestMapping("/home")
    public String home() {

        return "home";
    }
}
