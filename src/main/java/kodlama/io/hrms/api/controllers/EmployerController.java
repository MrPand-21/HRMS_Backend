package kodlama.io.hrms.api.controllers;


import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.business.concretes.EmployerManager;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers/")
@CrossOrigin
public class EmployerController {

    private EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @PostMapping("add")
    public Result add(@RequestBody Employer employer ){
        return employerService.add(employer);
    }

    @GetMapping("getall")
    public DataResult<List<Employer>> getAll() {
        return employerService.getAll();
    }

    @GetMapping("getbyid")
    public ResponseEntity<?> getById(@RequestParam int id ){
        return ResponseEntity.ok(employerService.getById(id));
    }
}
