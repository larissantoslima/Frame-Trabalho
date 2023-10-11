package br.unipar.patterns_adapter;

import br.unipar.patterns_adapter.email.Gmail;

/**
 *
 * @author larissa.lima
 */
public class GmailAdapter extends Gmail
        implements EmailProvider {

    @Override
    public void apply(Email email) {
        init();
        render(email);
    }
    
}

