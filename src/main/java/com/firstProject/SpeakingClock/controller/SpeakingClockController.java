package com.firstProject.SpeakingClock.controller;


import com.firstProject.SpeakingClock.service.TimeConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpeakingClockController {

    @Autowired
    private TimeConversionService timeConversionService;

    @GetMapping("/current-time")
    public String getCurrentTime() {
        String currentTime = java.time.LocalTime.now().toString().substring(0, 5);
        return timeConversionService.convertTimeToWords(currentTime);
    }

    @GetMapping("/convert-time")
    public String convertTime(@RequestParam String time) {
        return timeConversionService.convertTimeToWords(time);
    }
}
