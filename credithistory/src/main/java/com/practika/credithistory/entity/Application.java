package com.practika.credithistory.entity;



import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "applications")
@Data
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    private BigDecimal amount;          // Запрошенная сумма
    private Integer term;               // Срок
    private String purpose;             // Цель кредита

    private String status;

    private BigDecimal rate;            // Итоговая ставка
    private BigDecimal monthlyPayment;  // Ежемесячный платеж

    private LocalDateTime createdAt = LocalDateTime.now();    // Дата подачи

    public Application(Client client, BigDecimal amount, Integer term, String purpose) {
        this.client = client;
        this.amount = amount;
        this.term = term;
        this.purpose = purpose;
        this.status = "NEW";
        this.rate = BigDecimal.ZERO;
        this.monthlyPayment = BigDecimal.ZERO;
    }

    public Application(Client client, BigDecimal amount, Integer term, String purpose,
                       BigDecimal rate, BigDecimal monthlyPayment) {
        this.client = client;
        this.amount = amount;
        this.term = term;
        this.purpose = purpose;
        this.rate = rate;
        this.monthlyPayment = monthlyPayment;
        this.status = "APPROVED";
    }

    public Application() {

    }
}


