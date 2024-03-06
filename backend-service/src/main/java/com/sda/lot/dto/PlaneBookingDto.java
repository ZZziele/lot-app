package com.sda.lot.dto;

import com.sda.lot.domain.Client;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record PlaneBookingDto(
        Long id,

        PlaneDto bookedPlane,

        ClientDto clientDto,

        LocalDate startDate,

        LocalDate endDate,

        int totalPriceInPolishGrosz,

        AddressDto startLocation,

        AddressDto endLocation,

        LocalDateTime creationTimestamp,

        LocalDateTime lastUpdate


        )
{



}
