package com.sda.lot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RENTS")
@Entity
public class PlaneBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    Plane bookedPlane;
    @ManyToOne
    Client client;

    LocalDate startDate;

    LocalDate endDate;

    int totalPriceInPolishGrosz;

    @ManyToOne
    Address startLocation;
    @ManyToOne
    Address endLocation;


    LocalDateTime creationTimestamp;

    LocalDateTime lastUpdate;

    @PrePersist
    void writeCreationTimestamp (){
        creationTimestamp = LocalDateTime.now();
        lastUpdate = creationTimestamp;
    }

    @PreUpdate
    void writeUpdateTimeStamp(){
        lastUpdate = LocalDateTime.now();
    }

}
