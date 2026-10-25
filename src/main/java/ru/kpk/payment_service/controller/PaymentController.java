package ru.kpk.payment_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kpk.payment_service.patterns.adapter.PaymentAdapter;
import ru.kpk.payment_service.patterns.adapter.PaymentProcessor;

@RestController
public class PaymentController {

    @GetMapping("/test_adapter")
    public String testAdapter() {
        PaymentProcessor processor = new PaymentAdapter();

        processor.processPayment("Иванов Иван", 15000.0);

        return "Проверка Адаптера завершена.";
    }
}
