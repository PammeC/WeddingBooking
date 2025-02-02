package com.weddingBooking.decoration_service.controller;

import com.weddingBooking.decoration_service.model.Decoration;
import com.weddingBooking.decoration_service.service.DecorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DecorationController {
    @Autowired
    private DecorationService decorationService;

    @QueryMapping
    public List<Decoration> getAllDecoration(){
        return decorationService.getAllDecoration();
    }

    @QueryMapping
    public Decoration getDecorationById(@Argument Long id_decoration){
        return decorationService.getDecorationById(id_decoration);
    }

    @QueryMapping
    public List<Decoration> searchDecorationByName (@Argument String name){
        return decorationService.searchDecorationByName(name);
    }

}
