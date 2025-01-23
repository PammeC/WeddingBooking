package com.weddingBooking.photography_service.controller;

import com.weddingBooking.photography_service.service.PhotographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/photographyD")
public class PhotographyController {

    @Autowired
    private PhotographyService photographyService;
    @DeleteMapping("/delete/{id_photography}")
    private String deletePhotography(@PathVariable Long id_photography){
        photographyService.deletePhotography(id_photography);
        return "Photography service delete successfully";
    }
}
