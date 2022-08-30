package com.bank.msbootcointransactionbackend.services;

import com.bank.msbootcointransactionbackend.handler.ResponseHandler;
import com.bank.msbootcointransactionbackend.models.documents.Transaction;
import reactor.core.publisher.Mono;

public interface TransactionService {
    Mono<ResponseHandler> findAll();

    Mono<ResponseHandler> find(String id);

    Mono<ResponseHandler> create(Transaction transaction);

    Mono<ResponseHandler> update(String id, Transaction transaction);

    Mono<ResponseHandler> delete(String id);

    Mono<ResponseHandler> findByTicket(String ticket);
}
