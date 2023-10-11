package br.unipar.patterns_adapter;

/**
 *
 * @author larissa.lima
 */
public class EmailView {
    
    private Email email;
    
    public EmailView(Email email) {
        this.email = email;
    }
    
    public void apply(EmailProvider envio) {
        envio.apply(email);
    }

}

