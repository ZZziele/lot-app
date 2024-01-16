package com.sda.lot.domain.enumeration;

public enum FuelType {
    GAS("Gas fuel"),
    OIL("Oil fuel"),
    GASOLINE("Gasoline fuel"),
    ELECTRIC ("Electric fuel"),
    HYBRID ("Hybrid");


    public final String fuelDesc;

    FuelType (String fuelDesc){
        this.fuelDesc = fuelDesc;
    }

    public String getFuelDesc() {
        return fuelDesc;
    }
}
