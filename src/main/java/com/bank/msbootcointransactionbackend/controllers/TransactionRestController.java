package com.bank.msbootcointransactionbackend.controllers;

import com.bank.msbootcointransactionbackend.handler.ResponseHandler;
import com.bank.msbootcointransactionbackend.models.documents.Transaction;
import com.bank.msbootcointransactionbackend.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/bootcoin/transaction")
public class TransactionRestController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public Mono<ResponseHandler> findAll() {
        return transactionService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ResponseHandler> find(@PathVariable String id) {
        return transactionService.find(id);
    }

    @PostMapping
    public Mono<ResponseHandler> create(@Valid @RequestBody Transaction transaction) {
        return transactionService.create(transaction);
    }

    @PutMapping("/{id}")
    public Mono<ResponseHandler> update(@PathVariable("id") String id,@Valid @RequestBody Transaction transaction) {
        return transactionService.update(id, transaction);
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseHandler> delete(@PathVariable("id") String id) {
        return transactionService.delete(id);
    }

    @GetMapping("/ticket/{ticket}")
    public Mono<ResponseHandler> findByTicket(@PathVariable String ticket) {
        return transactionService.findByTicket(ticket);
    }
}
