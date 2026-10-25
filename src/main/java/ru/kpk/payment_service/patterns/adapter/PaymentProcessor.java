package ru.kpk.payment_service.patterns.adapter;

public interface PaymentProcessor {
    void processPayment(String studentName, double amount);
}
