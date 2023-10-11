
package br.unipar.designpatternss.abstractFactory.app.construirMusculos.perderPeso;

import br.unipar.designpatternss.abstractFactory.IGanharMusculo;
import br.unipar.designpatternss.abstractFactory.IPerderPeso;
import br.unipar.designpatternss.abstractFactory.WidgetFactory;
import br.unipar.designpatternss.abstractFactory.app.construirMusculos.Musculo;

/**
 *
 * @author larissa.lima
 */
public class PerderPesoFactory implements WidgetFactory {
    @Override
    public IGanharMusculo ganharMusculo() {
        return new Musculo();
    }

    @Override
    public IPerderPeso perderPeso() {
        return new Peso();
    }
}

