
package br.unipar.decorator;

/**
 *
 * @author larissa.lima
 */
public class Notificacao implements Notifier {
    @Override
    public void write(String message){
        System.out.println("Enviando... "+ message);
    }
}
