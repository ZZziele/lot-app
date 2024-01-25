package com.sda.lot.mapper;

import com.sda.lot.domain.Pictures;
import com.sda.lot.domain.Plane;
import com.sda.lot.dto.PicturesDto;
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
                .pictures(new PicturesDto(entity.getPictures().getMainPictureUrl(),entity.getPictures().getPicturesUrls()))
                .build();
    }

    @Override
    public Plane fromDtoToEntity(PlaneDto dto) {
        return Plane.builder()
                .id(dto.id())
                .model(dto.model())
                .description(dto.description())
                .bodySerialNumber(dto.bodySerialNumber())
                .numberOfSeats(dto.numberOfSeats())
                .engineType(dto.engineType())
                .trunkCapacityInLitres(dto.trunkCapacityInLitres())
                .fuelType(dto.fuelType())
                .combustionPer100Km(dto.combustionPer100Km())
                .rangeInKm(dto.rangeInKm())
                .pictures(new Pictures(dto.pictures().mainPictureUrl(),dto.pictures().picturesUrls()))
                .build();
    }
}
