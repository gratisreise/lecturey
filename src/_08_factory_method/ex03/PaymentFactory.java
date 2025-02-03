package _08_factory_method.ex03;

// Abstract factory class
abstract class PaymentFactory {
    abstract Payment createPayment(FinancialInfo info);
}