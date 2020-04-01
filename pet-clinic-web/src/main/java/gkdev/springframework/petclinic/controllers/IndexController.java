package gkdev.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Konstantin Romanov
 * @created 01/04/2020 - 13:57
 * @project pet-clinic
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        
        return "index";
    }
}
