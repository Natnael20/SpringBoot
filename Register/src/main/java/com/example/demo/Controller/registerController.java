package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Login")
public class registerController {
	
    @GetMapping("/login.html")
    public String display(Model model) {
        // You can add model attributes if needed
        return "login.html"; // Assuming "login.html" is in the "resources/templates" directory
    }
    
    
    
}
