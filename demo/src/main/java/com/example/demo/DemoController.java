package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    // 메인 페이지 → index.html
    @GetMapping("/")
    public String index() {
        return "index"; // templates/index.html 반환
    }

    // hello 페이지 → hello.html
    @GetMapping("/hello")
    public String hello() {
        return "hello"; // templates/hello.html 반환
    }

    // hello2 페이지 → hello2.html
    @GetMapping("/hello2")
    public String hello2() {
        return "hello2"; // templates/hello2.html 반환
    }
}
