package guru.springframework.sfgptclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","index","index.hml"})
    public String index() {
        return "index";
    }
}
