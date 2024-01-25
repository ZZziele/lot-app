package com.sda.lot.mapper;

import com.sda.lot.domain.Plane;
import com.sda.lot.dto.PlaneDto;
import org.springframework.stereotype.Component;

@Component
public class PlaneMapper implements Mapper<Plane, PlaneDto>{
    @Override
    public PlaneDto fromEntityToDto(Plane entity) {
        return PlaneDto.builder()
                .id(entity.getId())
                .model(entity.getModel())
                .description(entity.getDescription())
                .bodySerialNumber(entity.getBodySerialNumber())
                .numberOfSeats(entity.getNumberOfSeats())
                .speedInKmPerHour(entity.getSpeedInKmPerHour())
                .engineType(entity.getEngineType())
                .trunkCapacityInLitres(entity.getTrunkCapacityInLitres())
                .fuelType(entity.getFuelType())
                .combustionPer100Km(entity.getCombustionPer100Km())
                .rangeInKm(entity.getRangeInKm())
                .pictures(entity.getPictures())
                .build();
    }

    @Override
    public Plane fromDtoToEntity(PlaneDto dto) {
        return null;
    }
}
