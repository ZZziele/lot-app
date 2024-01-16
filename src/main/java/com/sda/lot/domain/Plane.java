package com.sda.lot.domain;

import com.sda.lot.domain.enumeration.EngineType;
import com.sda.lot.domain.enumeration.FuelType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "PLANES")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String model;

    String description;

    String bodySerialNumber;

    int numberOfSeats;

    int speedInKmPerHour;



    @Enumerated(EnumType.STRING)
    EngineType engineType;

    int trunkCapacityInLitres;

    @Enumerated(EnumType.STRING)
    FuelType fuelType;

    String combustionPer100Km;

    int rangeInKm;

    Pictures pictures;
}
