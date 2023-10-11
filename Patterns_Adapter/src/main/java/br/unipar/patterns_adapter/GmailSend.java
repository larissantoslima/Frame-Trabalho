package br.unipar.patterns_adapter;

import br.unipar.patterns_adapter.email.Gmail;

/**
 *
 * @author larissa.lima
 */
public class GmailSend implements EmailProvider {
    
    private Gmail gmail;
    
    public GmailSend(Gmail gmail) {
        this.gmail = gmail;
    }
    
    @Override
    public void apply(Email image) {
        gmail.init();
        gmail.render(image);
    }
    
}