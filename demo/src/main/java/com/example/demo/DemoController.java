package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("data", "방갑습니다.");
        return "hello";
    }

    @GetMapping("/hello2")
    public String hello2(Model model) {
        model.addAttribute("attr1", "첫 번째 속성");
        model.addAttribute("attr2", "두 번째 속성");
        model.addAttribute("attr3", "세 번째 속성");
        model.addAttribute("attr4", "네 번째 속성");
        model.addAttribute("attr5", "다섯 번째 속성");
        return "hello2";
    }
}
