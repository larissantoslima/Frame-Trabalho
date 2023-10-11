
package br.unipar.designpatternss.abstractFactory.app;

import br.unipar.designpatternss.abstractFactory.WidgetFactory;

/**
 *
 * @author larissa.lima
 */
public class ContactForm {
    
    public void render(WidgetFactory factory) {
        factory.ganharMusculo().render();
        factory.perderPeso().render();

}
}
