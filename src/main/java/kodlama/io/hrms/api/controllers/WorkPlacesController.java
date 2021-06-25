package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.WorkPlaceService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/workplaces/")
@CrossOrigin
public class WorkPlacesController {

    private WorkPlaceService workPlaceService;

   @Autowired
    public WorkPlacesController(WorkPlaceService workPlaceService) {
        this.workPlaceService = workPlaceService;
    }

    @GetMapping("getall")
    public ResponseEntity<?>  getAll() {
       return ResponseEntity.ok(this.workPlaceService.getAll());
    }

    @GetMapping("getById")
    public ResponseEntity<?> getById(int id){
        return ResponseEntity.ok(this.workPlaceService.getById(id));
    }
}
