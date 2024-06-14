package com.multi.test.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping(value = {"/", "/main"})    // 여러 개
    public String main() {


        return "main/main";
    }

    @PostMapping("/")
    public String redirectMain() {
        return "redirect:/";
    }


    


}
