package com.daniel.hellohuman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class helloHumanController {
    @RequestMapping("")
    public String hello() {
            return "Hello Human";
    }
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false)  String searchQuery, @RequestParam(value="lastName", required=false) String searchQuery1 ) {
    	if (searchQuery == null) {
    		return ("Hello Human");
    	}
    	else if(searchQuery!= null && searchQuery1 == null) {
            return ("Hello " + searchQuery);
    	}
    	return ("Hello " + searchQuery + " " + searchQuery1);
    }
    

}
