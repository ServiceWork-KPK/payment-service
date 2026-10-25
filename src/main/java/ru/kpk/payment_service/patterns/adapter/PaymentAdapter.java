package ru.kpk.payment_service.patterns.adapter;

public class PaymentAdapter implements PaymentProcessor {

    private final ExternalPaymentProvider externalProvider;

    public PaymentAdapter() {
        this.externalProvider = new ExternalPaymentProvider();
    }

    @Override
    public void processPayment(String studentName, double amount) {
        String currency = "RUB";
        externalProvider.makeExternalPayment(studentName, amount, currency);
    }
}