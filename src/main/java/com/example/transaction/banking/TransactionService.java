package com.example.transaction.banking;

import com.example.transaction.banking.exceptions.UseException;

import java.util.function.Consumer;

public interface TransactionService {
    Transaction createTransaction(String created, String userId, String accountId, double amount) throws UseException;

    double sum(String created, String userId, String accountId) throws UseException;

    void addMonitor(Consumer<Transaction> monitor);
}

