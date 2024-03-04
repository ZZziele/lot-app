package com.sda.lot.dto;

import com.sda.lot.domain.Client;

import java.time.LocalDate;

public record PlaneBookingDto(
        Long id,

        PlaneDto bookedPlane,

        ClientDto clientDto,

        LocalDate startDate,

        LocalDate endDate
        )
{



}
