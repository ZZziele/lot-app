package com.sda.lot.dto;

import java.util.List;

public record PicturesDto(
        String mainPictureUrl,
        List<String> picturesUrls
) {
}
