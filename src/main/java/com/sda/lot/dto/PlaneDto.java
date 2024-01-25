package com.sda.lot.dto;

import com.sda.lot.domain.Pictures;
import com.sda.lot.domain.enumeration.EngineType;
import com.sda.lot.domain.enumeration.FuelType;
import lombok.Builder;

@Builder

public record PlaneDto(
        Long id,
        String model,
        String description,
        String bodySerialNumber,
        int numberOfSeats,
        int speedInKmPerHour,
        EngineType engineType,
        int trunkCapacityInLitres,
        FuelType fuelType,
        String combustionPer100Km,
        int rangeInKm,

        PicturesDto pictures



) {
}
