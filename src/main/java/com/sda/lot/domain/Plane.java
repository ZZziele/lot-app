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
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String model;

    String description;

    @Column(unique = true)
    String bodySerialNumber;

    int numberOfSeats;

    int speedInKmPerHour;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    EngineType engineType;

    int trunkCapacityInLitres;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    FuelType fuelType;

    String combustionPer100Km;

    int rangeInKm;

    @Column(nullable = false)
    Pictures pictures;
}
