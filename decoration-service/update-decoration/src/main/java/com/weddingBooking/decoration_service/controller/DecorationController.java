package com.weddingBooking.decoration_service.controller;

import com.weddingBooking.decoration_service.model.Decoration;
import com.weddingBooking.decoration_service.service.DecorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/decorationU")
public class DecorationController {

    @Autowired
    private DecorationService decorationService;
    @PutMapping("/update/{id_decoration}")
    private String updateDecoration(@PathVariable Long id_decoration,
                                    @RequestBody Decoration decoration){
        decorationService.updateDecoration(id_decoration, decoration);
        return "Decoration service update successfully";
    }
}
