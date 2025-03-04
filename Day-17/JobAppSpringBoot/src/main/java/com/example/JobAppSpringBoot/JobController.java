package com.example.JobAppSpringBoot;

import com.example.JobAppSpringBoot.model.JobPost;
import com.example.JobAppSpringBoot.repo.JobRepo;
import com.example.JobAppSpringBoot.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
    @Autowired
    private JobRepo service;

    @GetMapping({"/", "home"}) //for two urls it should trigger
    public String home() {
        return "home";
    }

    @GetMapping("addjob")
    public String addJob() {
        return "addjob";
    }

    @PostMapping("handleForm")

    public String handleForm(JobPost jobPost) {
        service.addJob(jobPost);
        return "success";
    }
}

