package com.sda.lot.mapper;

import com.sda.lot.domain.Plane;
import com.sda.lot.dto.PlaneDto;

public interface Mapper<E,D> {
    D fromEntityToDto(E entity);

    E fromDtoToEntity(D dto);
}
