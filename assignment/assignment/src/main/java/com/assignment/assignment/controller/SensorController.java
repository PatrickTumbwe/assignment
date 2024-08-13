package com.assignment.assignment.controller;

import com.assignment.assignment.Entity.Reading;
import com.assignment.assignment.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SensorController {

    @Autowired
    private ReadingRepository readingRepository;

    @PostMapping("/submit")
    public String submitData(@RequestParam Float temperature, @RequestParam Float humidity) {
        Reading reading = new Reading();
        reading.setTemperature(temperature);
        reading.setHumidity(humidity);
        readingRepository.save(reading);
        return "Data received and saved";
    }
}
