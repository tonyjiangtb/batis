package tao.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tao.service.serviceA;
import tao.service.serviceReq;

@RestController
public class DataController {
	
	@Autowired
	private serviceA s;
	
	@Autowired
	private serviceReq servicerequest;
	
	@RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) throws Exception {
		String ret;
		ret=s.method2("haha");
		
        return "returned:"+ret;
    }
	
	@RequestMapping("/home")
    public String home() {

		s.method1("");
        return "home";
    }
}
