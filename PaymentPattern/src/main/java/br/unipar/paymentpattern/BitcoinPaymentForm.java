package br.unipar.paymentpattern;

/**
 *
 * @author larissa.lima
 */
public class BitcoinPaymentForm implements PaymentForm{
    @Override
    public void pay(String paymentForm) {
        System.out.println("Payment made in Bitcoin");
    }
}
