package com.sda.lot.domain;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
public class Pictures {
    String mainPictureUrl;
    List<String> picturesUrls;
}
