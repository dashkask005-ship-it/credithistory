package com.practika.credithistory.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "credits")
@Data
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "application_id")
    private Application application;

    private BigDecimal amount;          // Сумма кредита
    private BigDecimal rate;            // Ставка
    private BigDecimal monthlyPayment;  // Ежемесячный платеж
    private Integer term;               // Срок

    private BigDecimal totalAmount;     // Общая сумма выплат
    private String status;

    private LocalDate issueDate;        // Дата выдачи
}