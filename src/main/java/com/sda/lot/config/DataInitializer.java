package com.sda.lot.config;

import com.sda.lot.domain.Pictures;
import com.sda.lot.domain.Plane;
import com.sda.lot.domain.enumeration.EngineType;
import com.sda.lot.domain.enumeration.FuelType;
import com.sda.lot.repository.PlaneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Slf4j
@Profile("develop")

public class DataInitializer implements CommandLineRunner {
    private final PlaneRepository planeRepository;

    public DataInitializer(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("test");
        Plane tupolew = Plane.builder()
                .model("t-153")
                .description("Tupolew is beautifull")
                .bodySerialNumber("123")
                .numberOfSeats(100)
                .speedInKmPerHour(300)
                .engineType(EngineType.V8)
                .trunkCapacityInLitres(300)
                .fuelType(FuelType.OIL)
                .combustionPer100Km("52 liters")
                .rangeInKm(500)
                .pictures(new Pictures("https://media.istockphoto.com/id/155439315/pl/zdj%C4%99cie/pasa%C5%BCer-samolot-lataj%C4%85cy-na-zach%C3%B3d-s%C5%82o%C5%84ca-nad-chmury.jpg?s=612x612&w=0&k=20&c=MSIU3x1RmlpwbOY8JGOeCxBDbsD05F4LAbT6n0yefpY=",
                        List.of()))
                .build();
        log.info("after build");
        planeRepository.save(tupolew);
    }
}