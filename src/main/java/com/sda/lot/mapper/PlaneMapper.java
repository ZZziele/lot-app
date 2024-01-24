package com.sda.lot.mapper;

import com.sda.lot.domain.Plane;
import com.sda.lot.dto.PlaneDto;

public class PlaneMapper implements Mapper<Plane, PlaneDto>{
    @Override
    public PlaneDto fromEntityToDto(Plane entity) {
        return null;
    }

    @Override
    public Plane fromDtoToEntity(PlaneDto dto) {
        return null;
    }
}
