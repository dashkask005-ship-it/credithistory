package com.practika.credithistory.DTO;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ApplicationChangesDTO {

    private String status;

    private BigDecimal rate;
    private BigDecimal monthlyPayment;

    private BigDecimal amount;
    private Integer term;
    private String purpose;


    private String ClientName;
    private String ClientEmail;

    private String message;
}
