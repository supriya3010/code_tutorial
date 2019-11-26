package com.supriya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/add")
	    public String display()  
	    {  
	        return "loginPage";  
	    }  
}
