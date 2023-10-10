package com.universal.containx.model;

import java.util.Date;

import com.universal.containx.enums.TransactionTypeEnums;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;


public class CoinTransaction {



private Long id;


private User user;

private TransactionTypeEnums transactionTypeEnums = TransactionTypeEnums.REFERRAL;

private Integer amount;

private String source;


private Date createdDate = new Date();

public CoinTransaction(User user, TransactionTypeEnums transactionType, Integer amount) {
    this.user = user;
    this.transactionTypeEnums = transactionType;
    this.amount = amount;
}
}

