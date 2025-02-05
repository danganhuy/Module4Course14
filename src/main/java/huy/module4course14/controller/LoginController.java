package huy.module4course14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping("/login1")
    public ModelAndView login() {
        return new ModelAndView("/login");
    }

    @GetMapping("/logout")
    public ModelAndView logout() {
        return new ModelAndView("/login");
    }
}
