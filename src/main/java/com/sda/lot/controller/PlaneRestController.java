package com.sda.lot.controller;

import com.sda.lot.domain.Plane;
import com.sda.lot.dto.PlaneDto;
import com.sda.lot.mapper.PlaneMapper;
import com.sda.lot.service.PlaneService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class PlaneRestController {
    private final PlaneService planeService;

    private final PlaneMapper planeMapper;



    public PlaneRestController(PlaneService planeService, PlaneMapper planeMapper) {
        this.planeService = planeService;
        this.planeMapper = planeMapper;
    }

    @GetMapping("/planes")
    public List<PlaneDto>  allPlanes(){
        log.info("all planes request");
        return planeService.GetAllPlanes()
                .stream()
                .map(plane -> planeMapper.fromEntityToDto(plane))
                .toList();
    }
    @GetMapping("/planes/{id}")
    public PlaneDto getPlaneById(@PathVariable("id") long planeId){
        log.info("Trying to find car with id: [{}]",planeId);

    return planeMapper.fromEntityToDto(planeService.findCarById(planeId));
    }

    @PostMapping("/planes")
    public void addPlane(@RequestBody @Valid PlaneDto toSave){
        log.info("adding new Plane: [{}]",toSave);

    }
}
