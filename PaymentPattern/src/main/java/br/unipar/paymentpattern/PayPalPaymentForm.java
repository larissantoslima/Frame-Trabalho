package br.unipar.paymentpattern;

/**
 *
 * @author larissa.lima
 */
public class PayPalPaymentForm implements PaymentForm{
    @Override
    public void pay(String paymentForm) {
        System.out.println("Payment made in PayPal");
    }

}
