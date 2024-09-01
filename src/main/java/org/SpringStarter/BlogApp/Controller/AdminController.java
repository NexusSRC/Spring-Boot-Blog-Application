package org.SpringStarter.BlogApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    
    @GetMapping("/admin")
    public String admin(Model model){
        return "admin_views/admin";
    }
    
}
