package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.FailResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entities.concretes.Employer;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers/")
public class JobSeekersController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @PostMapping(name = "add")
    public Result add( @RequestBody JobSeeker jobSeeker){
        Result result = jobSeekerService.add(jobSeeker);
        if (!result.isSuccess()){
            return new FailResult(result.getMessage());
        }
        return new SuccessResult(result.getMessage());
    }

    @GetMapping("getall")
    public DataResult<List<JobSeeker>> getAll() {
        return jobSeekerService.getAll();
    }
}
