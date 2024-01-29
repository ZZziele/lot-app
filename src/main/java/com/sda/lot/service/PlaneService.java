package com.sda.lot.service;

import com.sda.lot.domain.Plane;
import com.sda.lot.excepiton.WrongPlaneIdException;
import com.sda.lot.mapper.PlaneMapper;
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

    public List<Plane> GetAllPlanes(){
        log.info("getting all planes");
        //List<Plane> planes = planeRepository.findAll();
        var planes = planeRepository.findAll();
        log.info("number of planes: [{}]" , planes.size());
        log.debug("all planes: {}",planes);

        return planes;

    }

    public Plane findCarById(long planeId){
        return planeRepository.findById(planeId)
                .map(plane -> {
                    log.info("found plane: [{}]",plane);
                    return plane;
                })
                .orElseThrow(()->new WrongPlaneIdException("No plane with id: " +planeId));


    }
}
