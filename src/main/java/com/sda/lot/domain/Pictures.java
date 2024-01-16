package com.sda.lot.domain;

import lombok.Data;

import java.util.List;

@Data
public class Pictures {
    String mainPictureUrl;
    List<String> picturesUrls;
}
