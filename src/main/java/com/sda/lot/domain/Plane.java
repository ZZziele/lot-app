package com.sda.lot.domain;

import com.sda.lot.domain.enumeration.FuelType;
import lombok.Data;

import java.util.List;

@Data
public class Plane {
    String model;
    String description;
    String bodySerialNumber;
    int numberOfSeats;
    int speedInKmPerHour;
    Pictures pictures;
    Engine engine;
    int trunkCapacityInLitres;
    FuelType fuelType;
    String combustionPer100Km;
    int rangeInKm;


}
