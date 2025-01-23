package com.weddingBooking.photography_service.controller;


import com.weddingBooking.photography_service.model.Photography;
import com.weddingBooking.photography_service.service.PhotographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/photographyC")
public class PhotographyController {

    @Autowired
    private PhotographyService photographyService;
    @PostMapping("/create")
    private String createPhotography(@RequestBody Photography photography){
        photographyService.savePhotography(photography);
        return "Photography service create successfully";
    }
}
