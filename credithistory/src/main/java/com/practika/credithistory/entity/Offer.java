package com.practika.credithistory.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "offers")
@Data
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;

    private BigDecimal amount;          // Сумма
    private BigDecimal rate;            // Ставка
    private BigDecimal monthlyPayment;  // Платеж
    private Integer term;               // Срок

    private Boolean isInsuranceEnabled; // Со страховкой?
    private Boolean isSalaryClient;     // Зарплатный клиент?

    private String description;         // Описание для клиента
    private Integer priority;
}