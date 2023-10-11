package br.unipar.designpatternss;

import br.unipar.designpatternss.abstractFactory.app.ContactForm;
import br.unipar.designpatternss.abstractFactory.app.construirMusculos.GanharMusculosFactory;

/**
 *
 * @author larissa.lima
 */
public class DesignPatternss {

    public static void main(String[] args) {
       new ContactForm().render(new GanharMusculosFactory());
    }
}
