package com.fin.analyzer.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class TransactionDetailsModel {
    private long accountNo;
    private String transactionDescription;
    private Double amount;
    private PayMentType payMentType;
    private Date date;
}