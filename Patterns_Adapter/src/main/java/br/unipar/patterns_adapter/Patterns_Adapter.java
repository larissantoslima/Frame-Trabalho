package br.unipar.patterns_adapter;

import br.unipar.patterns_adapter.email.Gmail;

/**
 *
 * @author larissa.lima
 */
public class Patterns_Adapter {

    public static void main(String[] args) {
        EmailView emailView = new EmailView(new Email());
        emailView.apply(new GmailSend(new Gmail()));
    }
}
