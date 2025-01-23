package com.weddingBooking.music_service.controller;

import com.weddingBooking.music_service.model.Music;
import com.weddingBooking.music_service.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("musicC")
public class MusicController {

    @Autowired
    private MusicService musicService;
    @PostMapping("/create")
    private String createMusic(@RequestBody Music music){
        musicService.saveMusic(music);
        return "Music service create successfully";
    }
}
