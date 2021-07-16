package payment.strategy.service;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
