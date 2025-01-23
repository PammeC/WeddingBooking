package com.weddingBooking.music_service.controller;

import com.weddingBooking.music_service.model.Music;
import com.weddingBooking.music_service.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("musicU")
public class MusicController {

    @Autowired
    private MusicService musicService;
    @PutMapping("/update/{id_music}")
    private String updateMusic(@PathVariable Long id_music,
                               @RequestBody Music music){
        musicService.editMusic(id_music, music);
        return "Music service edit successfully";
    }
}
