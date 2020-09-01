package cn.hxq.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello2")
public class Hello2Controller {

    @GetMapping("show")
    public String test(){
        return "hello spring boot2";
    }


}
