package com.sda.lot.controller;

import com.sda.lot.dto.PlaneBookingDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api")
public class PlaneBookingController {
    @PostMapping("/plane-bookings")
    public PlaneBookingDto bookPlane(@RequestBody PlaneBookingDto planeBookingDto){
        return null;
    }

}
