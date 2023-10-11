
package br.unipar.decorator;

/**
 *
 * @author larissa.lima
 */
public class SendWhats implements Notifier {
    private Notifier notifier;

    public SendWhats(Notifier notifier){
        this.notifier = notifier;
    }
    @Override
    public void write(String message){

        notifier.write(WhatsApp(message));
    }

    private String WhatsApp(String message) {
        return message + "Enviando uma mensagem via WhatsApp";
    }

}
