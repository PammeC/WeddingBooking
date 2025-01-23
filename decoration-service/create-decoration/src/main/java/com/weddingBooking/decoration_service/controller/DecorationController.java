package com.weddingBooking.decoration_service.controller;

import com.weddingBooking.decoration_service.model.Decoration;
import com.weddingBooking.decoration_service.service.DecorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decorationC")
public class DecorationController {

    @Autowired
    private DecorationService decorationService;
    @PostMapping("/create")
    private String createCatering(@RequestBody Decoration decoration){
        decorationService.saveDecoration(decoration);
        return "Decoration service create successfully";
    }
}
