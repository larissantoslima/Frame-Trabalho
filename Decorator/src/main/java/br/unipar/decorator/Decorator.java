
package br.unipar.decorator;

/**
 *
 * @author larissa.lima
 */
public class Decorator {

    public static void main(String[] args) {
        EnviandoMessage(new SendSms(new Notificacao()));
        EnviandoMessage(new SendWhats(new Notificacao()));
        EnviandoMessage(new SendWhats(new SendSms(new Notificacao())));
    }

    public static void EnviandoMessage(Notifier notifier){
        notifier.write("Pedido enviado = ");
    }
}