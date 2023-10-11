
package br.unipar.paymentpattern;

/**
 *
 * @author larissa.lima
 */
public class CreditCardPaymentForm implements PaymentForm{
    @Override
    public void pay(String paymentForm) {
        System.out.println("Payment made in CreditCard");
    }
}

