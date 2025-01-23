package com.weddingBooking.music_service.controller;

import com.weddingBooking.music_service.model.Music;
import com.weddingBooking.music_service.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("musicD")
public class MusicController {

    @Autowired
    private MusicService musicService;
    @DeleteMapping("/delete/{id_music}")
    private String deleteMusic(@PathVariable Long id_music){
        musicService.deleteMusic(id_music);
        return "Music service delete successfully";
    }
}
