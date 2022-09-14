package prueba.prueba1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController {
    @GetMapping({"/"})
    public String home(){
        return "home";
    }
}
