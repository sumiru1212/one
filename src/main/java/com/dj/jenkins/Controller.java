package com.dj.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins/")
public class Controller {

    @RequestMapping("aa")
    public String aa() {
        return "hello!";
    }
}
