package br.unipar.patterns_adapter;

/**
 *
 * @author larissa.lima
 */
public class YahooSend implements EmailProvider {

    @Override
    public void apply(Email email) {
        System.out.println("Yahoo sendo enviado!");
    }

}

