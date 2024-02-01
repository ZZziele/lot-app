package com.sda.lot.controller;

import com.sda.lot.domain.Plane;
import com.sda.lot.dto.PlaneDto;
import com.sda.lot.mapper.PlaneMapper;
import com.sda.lot.service.PlaneService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Void> addPlane(@RequestBody @Valid PlaneDto toSave,
                                         UriComponentsBuilder ucb){
        log.info("adding new Plane: [{}]",toSave);
        var result = planeService.addPlane(planeMapper.fromDtoToEntity(toSave));
          URI locationUri = ucb.path("/planes/{id}")
              //  .buildAndExpand(result.getId()))
                .buildAndExpand(Map.of("id",result.getId()))
                .toUri();

        String pathWithoutServer = locationUri.getPath();
        URI pathOnlyUri = URI.create(pathWithoutServer);

       return ResponseEntity.created(pathOnlyUri).build();
    }

    @DeleteMapping("/planes/{id}")
    public ResponseEntity<Void> deletePlane(@PathVariable("id") long planeId){
        log.info("trying to delete plane with Id: [{}]",planeId);
        planeService.deletePlaneById(planeId);
        return ResponseEntity.noContent()
                .build();
    }

    @PutMapping("/planes/{id}")
    public PlaneDto replacePlane(@RequestBody @Valid PlaneDto toReplace, @PathVariable("id") Long planeId){
        log.info("trying to replace plane by id: [{}]  with content [{}] ",planeId,toReplace);
        var entityToReplace = planeMapper.fromDtoToEntity(toReplace);
                return planeMapper.fromEntityToDto(planeService.replacePlane(planeId,entityToReplace));
    }
}
