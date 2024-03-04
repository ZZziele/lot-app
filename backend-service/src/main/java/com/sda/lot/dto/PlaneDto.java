package com.sda.lot.dto;

import com.sda.lot.domain.Pictures;
import com.sda.lot.domain.enumeration.EngineType;
import com.sda.lot.domain.enumeration.FuelType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;


@Builder

public record PlaneDto(
        Long id,
        @NotNull
        @Size(min = 2)
        String model,
        String description,

        @NotNull
        @Size(min = 2)
        String bodySerialNumber,
        int numberOfSeats,
        int speedInKmPerHour,
        @NotNull
        EngineType engineType,
        int trunkCapacityInLitres,
        @NotNull
        FuelType fuelType,
        String combustionPer100Km,
        int rangeInKm,

        @NotNull
        PicturesDto pictures



) {
}
