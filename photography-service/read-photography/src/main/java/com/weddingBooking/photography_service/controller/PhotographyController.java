package com.weddingBooking.photography_service.controller;

import com.weddingBooking.photography_service.model.Photography;
import com.weddingBooking.photography_service.service.PhotographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/photographyC")
public class PhotographyController {

    @Autowired
    private PhotographyService photographyService;

    @QueryMapping
    public List<Photography> getAllPhotography(){
        return photographyService.getAllPhotography();
    }

    @QueryMapping
    public Photography getPhotographyById(@Argument Long id_photograhy){
        return photographyService.getPhotographyById(id_photograhy);
    }

    @QueryMapping
    public List<Photography> searchPhotographyByName(@Argument String name){
        return photographyService.searchPhotographyByName(name);
    }
}
