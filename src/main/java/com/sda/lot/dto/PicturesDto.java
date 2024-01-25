package com.sda.lot.dto;


import lombok.Builder;

import java.util.List;
@Builder

public record PicturesDto(
        String mainPictureUrl,
        List<String> picturesUrls
) {
}
