package com.practika.credithistory.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "clients")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Integer workExperience;
    private BigDecimal monthlyIncome;
    private LocalDate birthDate;
    private String employmentType;
    private LocalDateTime createdAt = LocalDateTime.now();

    public  Client(){

    }

    public Client(String firstName, String lastName,LocalDate birthDate, String email, String phone, Integer workExperience, BigDecimal monthlyIncome, String employmentType) {
       this.birthDate = birthDate;
        this.firstName =firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.workExperience = workExperience;
        this.monthlyIncome = monthlyIncome;
        this.employmentType = employmentType;
    }
}