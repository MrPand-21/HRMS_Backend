package kodlama.io.hrms.api.controllers;


import kodlama.io.hrms.business.abstracts.ImageService;
import kodlama.io.hrms.entities.concretes.Image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/images/")
public class ImagesController {

    private ImageService imageService;

    @Autowired
    public ImagesController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("upload")
    public ResponseEntity<?> upload(@RequestBody Image image) throws IOException {
        return ResponseEntity.ok(this.imageService.uploadPhoto(image));
    }

}
