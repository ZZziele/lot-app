package com.sda.lot.domain;

import java.time.LocalDate;

public class PlaneBooking {
    Plane bookedPlane;
    Client client;
    LocalDate startDate;
    LocalDate endDate;

    int totalPriceInPolishGrosz;
    Address startLocation;
    Address endLocation;


}
