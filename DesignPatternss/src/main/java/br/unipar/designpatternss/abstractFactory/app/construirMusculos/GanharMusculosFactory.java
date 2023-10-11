
package br.unipar.designpatternss.abstractFactory.app.construirMusculos;

import br.unipar.designpatternss.abstractFactory.IGanharMusculo;
import br.unipar.designpatternss.abstractFactory.IPerderPeso;
import br.unipar.designpatternss.abstractFactory.WidgetFactory;
import br.unipar.designpatternss.abstractFactory.app.construirMusculos.perderPeso.Peso;

/**
 *
 * @author larissa.lima
 */
public class GanharMusculosFactory implements WidgetFactory {
    @Override
    public IGanharMusculo ganharMusculo() {
        return new Musculo();
    }

    @Override
    public IPerderPeso perderPeso() {
        return new Peso();
    }

}

