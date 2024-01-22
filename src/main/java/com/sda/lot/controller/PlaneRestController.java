package com.sda.lot.controller;

import com.sda.lot.domain.Plane;
import com.sda.lot.service.PlaneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class PlaneRestController {
    private final PlaneService planeService;

    public PlaneRestController(PlaneService planeService) {
        this.planeService = planeService;
    }

    @GetMapping("/planes")
    public List<Plane>  allPlanes(){
        log.info("all planes request");
        return planeService.GetAllPlanes();
    }
}
