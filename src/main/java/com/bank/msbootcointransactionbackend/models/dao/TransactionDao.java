package com.bank.msbootcointransactionbackend.models.dao;

import com.bank.msbootcointransactionbackend.models.documents.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TransactionDao extends ReactiveMongoRepository<Transaction, String> {
}
