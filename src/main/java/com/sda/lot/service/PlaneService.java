package com.sda.lot.service;

import com.sda.lot.domain.Plane;
import com.sda.lot.repository.PlaneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PlaneService {

    private final PlaneRepository planeRepository;

    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    public List<Plane> GetPlanes(){
        log.info("getting all planes");
        //List<Plane> planes = planeRepository.findAll();
        var planes = planeRepository.findAll();
        log.info("number of planes: [{}]" , planes.size());
        log.debug("all planes: {}",planes);
        return planes;

    }
}
