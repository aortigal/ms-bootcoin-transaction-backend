package com.bank.msbootcointransactionbackend.models.documents;

import com.bank.msbootcointransactionbackend.models.enums.PayMode;
import com.bank.msbootcointransactionbackend.models.utils.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Data
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;

    private String ticket;

    @NotNull(message = "senderAccount must not be null")
    private String senderAccount;

    @NotNull(message = "senderName must not be null")
    private String senderName;

    @NotNull(message = "recipientAccount must not be null")
    private String recipientAccount;

    @NotNull(message = "recipientName must not be null")
    private String recipientName;

    @NotNull(message = "rateAmount must not be null")
    private float rateAmount;

    @NotNull(message = "amount must not be null")
    private float amount;

    @NotNull(message = "payMode must not be null")
    private PayMode payMode;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime timeStamp;

    private Status status;
}
