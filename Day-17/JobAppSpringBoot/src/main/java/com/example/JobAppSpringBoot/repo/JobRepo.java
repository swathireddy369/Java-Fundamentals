package com.example.JobAppSpringBoot.repo;

import com.example.JobAppSpringBoot.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class JobRepo {
    List<JobPost> jobPosts = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must have good experience in core Java concepts", 5, new ArrayList<>(Arrays.asList("core-java"))),
            new JobPost(2, "Java Developer", "Must have good experience in core Java concepts", 5, new ArrayList<>(Arrays.asList("core-java"))),
            new JobPost(3, "Java Developer", "Must have good experience in core Java concepts", 5, new ArrayList<>(Arrays.asList("core-java"))),
            new JobPost(4, "Java Developer", "Must have good experience in core Java concepts", 5, new ArrayList<>(Arrays.asList("core-java")))
    ));

    public List<JobPost> getAllJobs() {
        return jobPosts;
    }
    public void addJob(JobPost job){
        jobPosts.add(job);
        System.out.println(jobPosts);
    }
}
