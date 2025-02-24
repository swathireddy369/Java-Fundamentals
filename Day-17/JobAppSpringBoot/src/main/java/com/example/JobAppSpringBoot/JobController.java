package com.example.JobAppSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
    @RequestMapping({"/", "home"}) //for two urls it should trigger
    public String home() {
        return "home";
    }
    @RequestMapping("addjob")
    public String addJob(){
        return "addjob";
    }
}

