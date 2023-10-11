package br.unipar.paymentpattern;

/**
 *
 * @author larissa.lima
 */
public class PaymentPattern {

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.payForm("Cartao de credito", new CreditCardPaymentForm());
        payment.payForm("Bitcoin", new BitcoinPaymentForm());
        payment.payForm("Paypal", new PayPalPaymentForm());
        payment.payForm("Money", new MoneyPaymentForm());
    }
}
