package ru.kpk.payment_service.patterns.adapter;

public class ExternalPaymentProvider {

    public void makeExternalPayment(String clientName, double totalAmount, String currencyCode) {
        System.out.println("Внешний провайдер.");
        System.out.println("Получен запрос от клиента: " + clientName);
        System.out.println("Сумма: " + totalAmount + " " + currencyCode);
        System.out.println("Оплата успешно проведена.");
    }
}