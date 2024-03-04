package com.sda.lot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CLIENTS")
@Data
    public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String name;
        String surname;
        String pesel;

        String email;

        LocalDate dateOfBirth;
        String phone;
        @ManyToOne
        Address address;

        LocalDateTime accountCreated;
          @PrePersist

        void setAccountCreated(){
            accountCreated = LocalDateTime.now();
        }

    }
